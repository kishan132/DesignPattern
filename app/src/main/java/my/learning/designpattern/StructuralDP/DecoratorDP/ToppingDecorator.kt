package my.learning.designpattern.StructuralDP.DecoratorDP

abstract class ToppingDecorator : BasePizza() {
    abstract override fun getCost(): Int
}