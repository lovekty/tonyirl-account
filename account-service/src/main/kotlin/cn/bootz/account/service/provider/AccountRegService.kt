package cn.bootz.account.service.provider

import cn.bootz.account.common.model.api.ApiResult
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author tony.zhuby
 * @date 2020/11/30
 */
@RestController
class AccountRegService {

    @PostMapping("account/reg")
    fun register(): ApiResult<Nothing> {

        return ApiResult.ok()
    }

    @PostMapping("account/close")
    fun close(): ApiResult<Nothing> {
        return ApiResult.ok()
    }

}