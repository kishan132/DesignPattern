package my.learning.designpattern.StructuralDP.DecoratorDP

/**
 * **Structural Design Pattern is a way to combine and arrange different classes and objects to form a complex and bigger structure to solve particular requirement**
 *
 * Decorator Design Pattern
 * It is used to add more functionality to existing object, without changing its structure
 *
 */

fun main() {

    val pizza = Mushroom(ExtraCheeze(FarmhousePizza()))
    println(pizza.getCost())

    val pizza1 = ExtraCheeze(MargaritaPizza())
    println(pizza1.getCost())

}