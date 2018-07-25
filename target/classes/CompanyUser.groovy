

import com.nosoft.entity.sys.base.AbstractDomainId
import com.nosoft.entity.sys.user.User
import com.nosoft.utils.Constants

/**
 * CompanyUser
 */
class CompanyUser extends AbstractDomainId {

    User user
    Company company
    Integer type
    Integer state
    String companyPhone
    String email
    String duty
    String customerId
    Date createTime
    Date updateStamp

    def beforeInsert() {
        createTime = new Date()
        state = Constants.COMPANY_USER_STATE_OK
        company.dataUpdateTime = createTime
    }

    def beforeUpdate() {
        updateStamp = new Date()
        company.dataUpdateTime = updateStamp
    }

    static constraints = {
        user blank: false, nullable: false
        company blank: false, nullable: false
        type blank: false, nullable: false
        customerId blank: false, nullable: false
    }

    static mapping = {
        table "T_COMPANY_USER"
        user column: 'uid', fetch: 'join'
        company column: 'cid', fetch: 'join'
    }
}
