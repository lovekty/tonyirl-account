package cn.bootz.account.application.ui.rest

import cn.bootz.account.common.model.api.ApiResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class AccountQueryApi {

    @GetMapping("account/{id:\\d+}")
    fun queryById(@PathVariable("id") id: Long): ApiResult<Nothing> {
        return ApiResult.ok()
    }

    @GetMapping("account")
    fun queryByLogin(@RequestParam("login") login: String): ApiResult<Nothing> {
        return ApiResult.ok()
    }
}