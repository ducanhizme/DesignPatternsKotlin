package FactoryMethod_3

class CatFactory {
    fun createCat(breed : String ,id :Int)= when(breed.trim().toLowerCase()){
        "siamese" -> Siamese(id)
        "russian blue" -> RussianBlue(id)
        "persian" -> Persian(id)
        else -> throw RuntimeException("Unknow $breed")
    }
}