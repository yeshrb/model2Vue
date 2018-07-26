<template>
  <div class="page">
    <div class="page_bd top_space">
        <Datetime title="birthday" v-model="birthday" :data="birthday" placeholder="请选择birthday" v-validate:birthday:required="请选择birthday" show-name :birthday format="YYYY-MM-DD HH:mm"/>
        <XInput title="name" v-model="name" :data="name" placeholder="请选择name"true v-validate:name:required="请选择name" show-name :name/>
        <XInput title="age" v-model="age" :data="age" placeholder="请选择age"true v-validate:age:required="请选择age" show-name :age/>
        <PopupPicker title="others" v-model="others" :data="others" placeholder="请选择others" v-validate:others:required="请选择others" show-name :others/>
    </div>
    <div class="page_ft">
      <x-button @click.native="submit" flex type="primary">保存</x-button>
    </div>
  </div>
</template>

<script>

  export default {
   data () {
      return {
        _data_placeholder
      }
    },

</script>