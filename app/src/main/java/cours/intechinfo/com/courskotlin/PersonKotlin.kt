package cours.intechinfo.com.courskotlin

fun PersonKotlin
        .createParent(person: PersonKotlin.() -> Unit): PersonKotlin {
    parent = PersonKotlin(42)
    parent!!.person()
    return this
}

fun PersonKotlin.applyPerson(person: PersonKotlin.() -> Unit): PersonKotlin {
    this.person()
    return this
}

class PersonKotlin(override val age: Int) : IPerson {
    var parent: PersonKotlin? = null
    var parentName: String? = null
    var originalCountry: String? = null
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