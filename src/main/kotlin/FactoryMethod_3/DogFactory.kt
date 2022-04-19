package FactoryMethod_3

class DogFactory {
    fun createDog(breed : String ,id :Int)= when(breed.trim().toLowerCase()){
        "beagle" -> Beagle(id)
        "bulldog" -> bulldog(id)
        "poodle" -> Poodle(id)
        else -> throw RuntimeException("Unknow $breed")
    }

}