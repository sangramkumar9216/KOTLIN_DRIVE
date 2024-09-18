interface Animal

class Dog(val name: String) : Animal {
    fun retrieve(item: String) {
        println("$name Retrieving $item")
    }
}

class Cat(val name: String) : Animal

fun checkIsDog(animal: Animal){
    if (animal is Dog){
        println("It is a dog")
    } else{
        println("It is not a dog!")
    }
}

fun main() {
    checkIsDog(Dog("Rex")) // Retrieving stick
    checkIsDog(Cat("sum"))
}

abstract class A{
    abstract fun a()
}