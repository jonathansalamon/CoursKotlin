package cours.intechinfo.com.courskotlin

fun PersonKotlin.compute(): Int {
    return this.age.hashCode()
}

class Person() {
    fun getStatuses(age: Int): List<IPerson.Status?> {
        val personList = mutableListOf<IPerson>(PersonKotlin(12), PersonKotlin(42))
        personList.add(PersonKotlin(35).apply { parentName = "Claudine" })

        val person = PersonKotlin(25)
        person.compute()
        IWantItGlobal()
        person.createParent {
            originalCountry = "France"
        }.originalCountry = "England"

        person.applyPerson {

        }
        person.apply {

        }

        return personList.filter { it.age == age && it.getName().isNotBlank() }.map { it.status }
    }
}