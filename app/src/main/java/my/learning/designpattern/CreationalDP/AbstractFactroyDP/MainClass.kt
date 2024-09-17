package my.learning.designpattern.CreationalDP.AbstractFactroyDP

/**
 * **Creational Design Pattern responsible for creating objects/controls the object creation**
 *
 * Abstract Factory Design Pattern
 * It is factory of factories
 *
 */

fun main() {

    val abstractFactoryProvider = AbstractFactoryProvider()

    val economicCarFactory = abstractFactoryProvider.getCarFactory("Economic")
    economicCarFactory?.getInstance(50000)

    val premiumCarFactory = abstractFactoryProvider.getCarFactory("Premium")
    premiumCarFactory?.getInstance(2000000)

}