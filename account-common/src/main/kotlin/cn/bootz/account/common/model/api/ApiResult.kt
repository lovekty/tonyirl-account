package cn.bootz.account.common.model.api

data class ApiResult<out T>(val code: Int = 0, val msg: String = "ok", val data: T? = null) {
    val succeed
        get() = code == 0

    companion object {
        fun <T> ok(data: T? = null) = ApiResult(data = data)
    }
}