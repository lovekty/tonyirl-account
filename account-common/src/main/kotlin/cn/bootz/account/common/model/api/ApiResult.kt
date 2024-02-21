package cn.bootz.account.common.model.api

data class ApiResult<out T>(val code: Int = SUCCESS_CODE, val msg: String = "ok", val data: T? = null) {
    val succeed
        get() = code == SUCCESS_CODE

    companion object {
        const val SUCCESS_CODE = 0

        fun <T> ok(data: T? = null) = ApiResult(data = data)

        fun error(code: Int, msg: String = "error") = ApiResult<Nothing>(code, msg)
    }
}