package cn.bootz.account.service.domain.entity

import cn.bootz.account.service.domain.AccountState
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "account_base")
class AccountBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "login", nullable = false, length = 64)
    var login: String? = null

    @Enumerated
    @Column(name = "state", nullable = false)
    var state: AccountState? = null

    @Column(name = "nickname", nullable = false, length = 256)
    var nickname: String? = null

    @Column(name = "avatar", nullable = false, length = 512)
    var avatar: String? = null

    @Column(name = "add_time", nullable = false)
    var addTime: LocalDateTime? = null

    @Column(name = "update_time", nullable = false)
    var updateTime: LocalDateTime? = null

    @OneToOne(mappedBy = "base")
    var email: AccountBindingEmail? = null

    @OneToOne(mappedBy = "base")
    var mobile: AccountBindingMobile? = null

    @OneToOne(mappedBy = "base")
    var password: AccountPassword? = null
}