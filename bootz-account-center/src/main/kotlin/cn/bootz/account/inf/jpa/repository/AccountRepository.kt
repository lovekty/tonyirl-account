package cn.bootz.account.inf.jpa.repository

import cn.bootz.account.inf.jpa.entity.AccountBase
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AccountRepository : JpaRepository<AccountBase, Long>, JpaSpecificationExecutor<AccountBase>