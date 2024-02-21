package cn.bootz.account.inf.jpa.repository

import cn.bootz.account.inf.jpa.entity.AccountBindingMobile
import org.springframework.data.jpa.repository.JpaRepository

interface AccountMobileRepository : JpaRepository<AccountBindingMobile, Long>