package cn.bootz.account.service.domain.repository

import cn.bootz.account.service.domain.AccountState
import cn.bootz.account.service.domain.entity.AccountBase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query

interface AccountRepository : JpaRepository<AccountBase, Long>, JpaSpecificationExecutor<AccountBase>