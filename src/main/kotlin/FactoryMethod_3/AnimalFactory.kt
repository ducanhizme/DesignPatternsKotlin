package FactoryMethod_3

class AnimalFactory {
    var count =1;
    val dog = DogFactory()
    val cat = CatFactory()

    fun createAnimal(animalTypes :String, breed : String ) :Animal {
        return when (animalTypes.trim().toLowerCase()){
            "dog" -> dog.createDog(breed,count++)
            "cat" -> cat.createCat(breed,count++)
            else -> throw RuntimeException("Unknown $animalTypes")
        }
    }
}