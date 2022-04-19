package FactoryMethod_3

fun main() {
    val animalTypes = listOf("dog" to "bulldog",
        "dog" to "beagle",
        "cat" to "persian",
        "dog" to "poodle",
        "cat" to "russian blue",
        "cat" to "siamese")
    val a = AnimalFactory()
    for((type,breed) in  animalTypes){
        var c = a.createAnimal(type,breed)
        println(" ${c.name} va ${c.id} ")
    }
}
