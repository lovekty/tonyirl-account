package cn.bootz.account.inf.jpa.entity

import jakarta.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name = "account_binding_mobile")
class AccountBindingMobile {
    @Id
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    var base: AccountBase? = null

    @Column(name = "mobile", unique = true, nullable = false, length = 32)
    var mobile: String? = null

    @Column(name = "add_time", insertable = false, updatable = false)
    var addTime: OffsetDateTime? = null

    @Column(name = "update_time", insertable = false, updatable = false)
    var updateTime: OffsetDateTime? = null
}