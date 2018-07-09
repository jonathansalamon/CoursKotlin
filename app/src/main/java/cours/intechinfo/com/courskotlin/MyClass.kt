package cours.intechinfo.com.courskotlin

inline fun IWantItGlobal(): String {
    return "Now you have it"
}
class MyClass(val value: Int, val name: String, val firstName: String,
                   var country: String = "France") {

    val person = PersonKotlin(12)
    fun test() {
        val testString = "testString"
    }
}