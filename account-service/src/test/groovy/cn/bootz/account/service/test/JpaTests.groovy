package cn.bootz.account.service.test

import cn.bootz.account.service.AppMain
import cn.bootz.account.service.domain.entity.AccountBase
import cn.bootz.account.service.domain.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = AppMain)
class JpaTests extends Specification {

    @Autowired
    AccountRepository accountRepository

    def "test create new account"() {
        setup:
        def login = "peiqi"
        when:
        def e = accountRepository.save(new AccountBase(login: login))
        then:
        e.id > 0
        e.login == login
    }

}
