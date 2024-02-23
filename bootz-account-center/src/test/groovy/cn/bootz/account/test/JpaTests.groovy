package cn.bootz.account.test

import cn.bootz.account.AppMain
import cn.bootz.account.domain.AccountState
import cn.bootz.account.inf.jpa.entity.AccountBase
import cn.bootz.account.inf.jpa.repository.AccountEmailRepository
import cn.bootz.account.inf.jpa.repository.AccountMobileRepository
import cn.bootz.account.inf.jpa.repository.AccountPasswordRepository
import cn.bootz.account.inf.jpa.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.data.domain.Example
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@DataJpaTest
@ContextConfiguration(classes = AppMain)
class JpaTests extends Specification {

    @Autowired
    AccountRepository acctRepo

    @Autowired
    AccountEmailRepository emailRepo

    @Autowired
    AccountMobileRepository mobileRepo

    @Autowired
    AccountPasswordRepository pwdRepo

    def "test create new account"() {
        setup:
        def login = "peiqi"
        when:
        def acct = acctRepo.save(new AccountBase(login: login, state: AccountState.INACTIVE, nickname: login, avatar: ""))
        then:
        acct.id > 0
        acct.login == login
        noExceptionThrown()
    }

    def "test create new account with exists login"() {
        setup:
        def login = "xiaozhu"
        when:
        acctRepo.save(new AccountBase(login: login, state: AccountState.INACTIVE, nickname: login, avatar: ""))
        then:
        thrown DataIntegrityViolationException
    }

    def "test find by id"() {
        setup:
        def id = 1L
        when:
        def byId = acctRepo.findById(id)
        then:
        byId.isPresent()
        byId.get().id == id
        byId.get().login == "xiaozhu"
    }

    def "test find by login with example"() {
        setup:
        def login = "xiaozhu"
        when:
        def one = acctRepo.findOne(Example.of(new AccountBase(login: login)))
        then:
        one.isPresent()
        one.get().login == login
    }

    def "test find by login with spec"() {
        setup:
        def login = "xiaozhu"
        when:
        def one = acctRepo.findOne((root, query, cb) -> cb.equal(root.get("login"), login))
        then:
        one.isPresent()
        one.get().login == login
    }

    def "test delete account"() {
        setup:
        def toDel = 1L
//        def acct = acctRepo.findById(toDel)
        when:
//        acct.ifPresent { acctRepo.delete(it) }
        acctRepo.deleteById(toDel)
        then:
        !acctRepo.existsById(toDel)
    }

}
