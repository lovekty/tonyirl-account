package cn.bootz.account.service.domain.repository

import cn.bootz.account.service.domain.entity.AccountBindingEmail
import org.springframework.data.jpa.repository.JpaRepository

interface AccountEmailRepository : JpaRepository<AccountBindingEmail, Long>