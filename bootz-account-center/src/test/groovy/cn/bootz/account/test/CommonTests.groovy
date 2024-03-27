package cn.bootz.account.test

import cn.bootz.account.common.trait.WithCode
import cn.bootz.account.domain.AccountState
import spock.lang.Specification

class CommonTests extends Specification {

    def "test inline"() {
        when:
        def code = WithCode.forCode(AccountState, 1)
        then:
        code == AccountState.INACTIVE
    }
}
