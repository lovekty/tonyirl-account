package cn.bootz.account.inf.jpa.repository

import cn.bootz.account.inf.jpa.entity.AccountPassword
import org.springframework.data.jpa.repository.JpaRepository

interface AccountPasswordRepository : JpaRepository<AccountPassword, Long>