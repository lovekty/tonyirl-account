package cn.bootz.account.common.trait

interface WithCode {
    val code: Int

    companion object {
        @JvmStatic
        fun <E> forCode(clazz: Class<E>, code: Int?) where E : Enum<E>, E : WithCode =
            code?.let { clazz.enumConstants.firstOrNull { e -> e.code == it } }

        inline fun <reified E> forCode(code: Int?) where E : Enum<E>, E : WithCode = forCode(E::class.java, code)
    }
}
