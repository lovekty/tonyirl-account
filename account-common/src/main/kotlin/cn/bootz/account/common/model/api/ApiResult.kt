package cn.bootz.account.common.model.api

data class ApiResult<out T>(val code: Int = SUCCESS, val msg: String = "ok", val data: T? = null) {
    val succeed
        get() = code == SUCCESS

    companion object {
        const val SUCCESS = 0

        fun <T> ok(data: T? = null) = ApiResult(data = data)

        fun error(code: Int, msg: String = "error") = ApiResult<Nothing>(code, msg)
    }
}