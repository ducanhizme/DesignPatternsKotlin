package FactoryMethod_2

class AnimalFactory {
    var count =1;
    fun createAnimal(animalTypes :String ) :Animal {
        return when (animalTypes.trim().toLowerCase()){
            "cat" -> Cat(count++)
            "dog" -> Dog(count++)
            else -> throw RuntimeException("Unknown $animalTypes")
        }
    }
}