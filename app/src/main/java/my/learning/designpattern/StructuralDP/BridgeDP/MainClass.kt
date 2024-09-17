package my.learning.designpattern.StructuralDP.BridgeDP

/**
 * **Structural Design Pattern is a way to combine and arrange different classes and objects to form a complex and bigger structure to solve particular requirement**
 *
 * Bridge Design Pattern
 * It is used to decouple an abstraction from its implementation so that the two can vary independently.
 */

fun main() {

    println("-------------old way of implementation-----------------")
    println("breathProcess is tightly coupled with their own class")
    val dog1 = Dog1()
    dog1.breathProcess()
    val fish1 = Fish1()
    fish1.breathProcess()
    val tree1 = Tree1()
    tree1.breathProcess()

    println("-------------new way of implementation-----------------")
    println("both creature and breathe classes can grow independently")

    val dog = Dog(LandBreathe())
    dog.breathProcess()

    val fish = Fish(WaterBreathe())
    fish.breathProcess()

    val tree = Tree(TreeBreathe())
    tree.breathProcess()
}