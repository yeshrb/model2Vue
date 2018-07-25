<template>
  <div class="page">
    <div class="page_bd top_space">
      <PopupPicker title="业务类型" v-model="type" :data="typeList" placeholder="请选择业务类型" required
                   v-validate:type:required="'请选择业务类型'" show-name :columns="1"/>
      <XInput title="姓名" v-model="applicantName" :max="30" placeholder="请输入申请人姓名" required
              v-validate:applicantName:required="'请输入申请人姓名'"/>
      <XInput title="手机号码" v-model="applicantPhone" :max="20" placeholder="请输入申请人手机号码" required
              v-validate:applicantPhone:mobile="'请输入正确的手机号码'"
              v-validate:applicantPhone:required="'请输入申请人手机号码'"/>
      <XInput title="身份证号" v-model="applicantId" :max="30" placeholder="请输入申请人身份证号" required
              v-validate:applicantId:card="'请输入正确身份证号'"
              v-validate:applicantId:required="'请输入申请人身份证号'"/>
      <XInput title="地址" v-model="address" :max="100" placeholder="请输入地址" required
              v-validate:address:required="'请输入地址'"/>
      <Datetime title="申请时间" v-model="applyTime" placeholder="请选择申请时间" format="YYYY-MM-DD HH:mm"/>
      <x-textarea title="备注" :show-counter="false" :max="1000" :rows="1" v-model="remark" placeholder="请输入备注" autosize></x-textarea>
      <!--<CellDetail title="社区民警" link="SelectPolice?select=detail&source=add">-->
        <!--<span class="p-place_ft" v-show="!policeName">请选择社区民警</span>{{policeName}}-->
      <!--</CellDetail>-->
      <UpLoadImgInput ref="UpLoadImg" required :count="9" title="上传照片" v-model="photo" v-validate:photo:required="'请上传照片'"/>
    </div>
    <div class="page_ft">
      <x-button @click.native="submit" flex type="primary">保存</x-button>
      <!--<x-button @click.native="sendToAudit" flex type="primary">发送户籍警</x-button>-->
    </div>
  </div>
</template>
 
<script>
  import houseHoldTypeApi from '@/api/houseHoldType'
  import houseHoldBusinessApi from '@/api/houseHoldBusiness'
  import keepStore from '@/mixins/keepStore'
 
  export default {
    mixins: [keepStore],
    data () {
      return {
        type: [],
        typeList: [],
        photo: [],
        applicantName: '',
        applicantPhone: '',
        applicantId: '',
        applyTime: '',
        address: '',
        detail: {},
        remark: ''
      }
    },
    computed: {
      policeName () {
        return this.detail.name && this.detail.name + ' ' + this.detail.mobile
      }
    },
    async created () {
      if (this.$store.state.directionIsForward) {
        const res = await houseHoldTypeApi.all()
        this.typeList = res.data.list.map(item => {
          return {name: item.name, value: item.id, parent: '0'}
        })
        this.type = [this.typeList[0].value]
      }
    },
    methods: {
      sendToAudit () {
        if (this.$validate.check()) {
          if (this.detail.id === '') {
            this.$toast.show('请选择社区民警')
            return
          }
          const that = this
          this.$confirm.show({
            title: '是否确认保存并发送？',
            onConfirm () { that.onSendConfirm() }
          })
        }
      },
      onSendConfirm () {
        houseHoldBusinessApi.saveAndSend({
          'cPolice.id': this.detail.id,
          'biz.type.id': this.type[0],
          'biz.applicantName': this.applicantName,
          'biz.applicantPhone': this.applicantPhone,
          'biz.applicantId': this.applicantId,
          'biz.applyTime': this.applyTime !== '' ? this.applyTime + ':00' : '',
          'biz.materials': this.photo.map(url => { return {url} }),
          'biz.address': this.address,
          'biz.remark': this.remark
        }, () => {
          this.$alert.show({
            content: '发送成功',
            onHide: () => {
              const page = '$HouseHold$BusinessPolice'
              this.$store.state[page] && this.$store.commit(page + '/updateState', {listData: {}})
              this.$router.replace(`BusinessPolice`)
            }
          })
        })
      },
      submit () {
        if (this.$validate.check()) {
          const that = this
          this.$confirm.show({
            title: '是否确认保存？',
            onConfirm () { that.onConfirm() }
          })
        }
      },
      onConfirm () {
        houseHoldBusinessApi.save({
          'type.id': this.type[0],
          applicantName: this.applicantName,
          applicantPhone: this.applicantPhone,
          applicantId: this.applicantId,
          applyTime: this.applyTime !== '' ? this.applyTime + ':00' : '',
          materials: this.photo.map(url => { return {url} }),
          address: this.address,
          remark: this.remark
        }, () => {
          this.$alert.show({
            content: '添加成功',
            onHide: () => {
              const page = '$HouseHold$BusinessPolice'
              this.$store.state[page] && this.$store.commit(page + '/updateState', {listData: {}})
              this.$router.replace(`BusinessPolice`)
            }
          })
        })
      }
    }
  }
</script>