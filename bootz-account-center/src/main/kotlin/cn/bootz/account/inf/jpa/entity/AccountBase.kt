package cn.bootz.account.inf.jpa.entity

import cn.bootz.account.domain.AccountState
import jakarta.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name = "account_base")
class AccountBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "login", unique = true, nullable = false, length = 64)
    var login: String? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "state", nullable = false, length = 32)
    var state: AccountState? = null

    @Column(name = "nickname", nullable = false, length = 256)
    var nickname: String? = null

    @Column(name = "avatar", nullable = false, length = 512)
    var avatar: String? = null

    @Column(name = "add_time", insertable = false, updatable = false)
    var addTime: OffsetDateTime? = null

    @Column(name = "update_time", insertable = false, updatable = false)
    var updateTime: OffsetDateTime? = null

    @OneToOne(mappedBy = "base")
    var email: AccountBindingEmail? = null

    @OneToOne(mappedBy = "base")
    var mobile: AccountBindingMobile? = null

    @OneToOne(mappedBy = "base")
    var password: AccountPassword? = null
}