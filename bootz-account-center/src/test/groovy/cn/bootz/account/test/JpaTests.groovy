package cn.bootz.account.test

import cn.bootz.account.AppMain
import cn.bootz.account.inf.jpa.entity.AccountBase
import cn.bootz.account.inf.jpa.repository.AccountRepository
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest(classes = AppMain)
class JpaTests extends Specification {

    @Autowired
    AccountRepository accountRepository

    def om = new ObjectMapper()

    @Transactional
    @Rollback
    def "test create new account"() {
        setup:
        def login = "peiqi"
        when:
        def e = accountRepository.save(new AccountBase(login: login))
        then:
        e.id > 0
        e.login == login
        println(om.writeValueAsString(e))
        noExceptionThrown()
    }

}
