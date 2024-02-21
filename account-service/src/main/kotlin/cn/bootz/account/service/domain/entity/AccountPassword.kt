package cn.bootz.account.service.domain.entity

import jakarta.persistence.*
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.time.OffsetDateTime

@Entity
@Table(name = "account_password")
class AccountPassword {
    @Id
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id", nullable = false)
    var base: AccountBase? = null

    @Column(name = "password", nullable = false, length = 128)
    var password: String? = null

    @Column(name = "add_time", nullable = false)
    var addTime: OffsetDateTime? = null
}