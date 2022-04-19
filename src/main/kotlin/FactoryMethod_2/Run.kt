package FactoryMethod_2

fun main() {
    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")
    val a = AnimalFactory()
    for(i in  animalTypes){
        var c = a.createAnimal(i)
        println(" ${c.name} và ${c.id}")
    }
}
