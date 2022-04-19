package FactoryMethod_1
fun main() {
     var c = animalFactory("CAT");
    println(c.name)
    val animalTypes = listOf("dog", "dog", "cat", "dog", "cat", "cat")
    for( a in animalTypes){
        val i = animalFactory(a)
        println(i.name)
    }
}
fun animalFactory(animalType:String):Animal{
    return when(animalType.toLowerCase()){
        "cat" -> Cat()
        "dog" -> Dog()
        else -> throw RuntimeException("Unknown $animalType is animal")
    }
}
