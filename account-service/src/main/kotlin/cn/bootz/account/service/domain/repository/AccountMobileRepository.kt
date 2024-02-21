package cn.bootz.account.service.domain.repository

import cn.bootz.account.service.domain.entity.AccountBindingMobile
import org.springframework.data.jpa.repository.JpaRepository

interface AccountMobileRepository : JpaRepository<AccountBindingMobile, Long>