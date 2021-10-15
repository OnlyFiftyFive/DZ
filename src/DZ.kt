fun main() {

    val x = 1.1
    val y = 5.0
    val z = x * y  // z =2
    println(z)

    fun two(a: Int = 2, b: Int = 3): Int {
        return a + b

    }
    println(two())

    fun one(a: Int = 1): Int {
        return a

    }
    println(one())

    fun three(a: Int = 2, b: Int = 3, c: Int = 4): Int {
        return a + b + c

    }
    println(three())

    fun twoInOne(a: Int = 2, b: Int = 3): Int {
        return a

    }
    println(twoInOne())

    fun convert(StringConverter: String): String{
        val convertString: MutableMap<String, Any?> = mutableMapOf()
        return String()
    }
}



