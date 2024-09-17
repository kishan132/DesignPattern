package my.learning.designpattern.CreationalDP.FactroyDP

/**
 * **Creational Design Pattern responsible for creating objects/controls the object creation**
 *
 * Factory Design Pattern
 * It is used when all the object creation and its business logic we need to keep in one place
 *
 */

fun main() {

    val shapeFactory : ShapeFactory = ShapeFactory()
    val shape : Shape ? = shapeFactory.getShape("Circle")
    shape?.draw()

}