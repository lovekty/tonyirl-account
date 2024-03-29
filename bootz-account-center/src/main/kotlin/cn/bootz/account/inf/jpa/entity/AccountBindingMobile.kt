package cn.bootz.account.inf.jpa.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.OffsetDateTime

@Entity
@Table(name = "account_binding_mobile")
class AccountBindingMobile {
    @Id
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id", nullable = false)
    var base: AccountBase? = null

    @Column(name = "mobile", unique = true, nullable = false, length = 32)
    var mobile: String? = null

    @Column(name = "add_time", insertable = false, updatable = false)
    var addTime: OffsetDateTime? = null
}