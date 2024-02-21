package cn.bootz.account.service.domain.repository

import cn.bootz.account.service.domain.entity.AccountPassword
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AccountPasswordRepository : JpaRepository<AccountPassword, Long>