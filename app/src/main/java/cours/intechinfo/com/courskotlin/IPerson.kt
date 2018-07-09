package cours.intechinfo.com.courskotlin

interface IPerson {
    enum class Status(val value: String) {
        FREE("free_people"), PREMIUM("premium")
    }
    val status: Status
    val age: Int
    fun getName(): String
    fun getFirstName(): String
}