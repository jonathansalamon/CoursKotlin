package cours.intechinfo.com.courskotlin

class PersonKotlin(override val age: Int) : IPerson {
    var parentName: String? = null
    override val status: IPerson.Status
        get() = IPerson.Status.valueOf("free_person")
    override fun getFirstName(): String {
      return ""
    }

    /**
     * Return name of the person
     */
    override fun getName(): String {
       return ""
    }
}