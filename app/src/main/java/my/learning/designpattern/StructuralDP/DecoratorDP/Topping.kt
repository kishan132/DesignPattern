package my.learning.designpattern.StructuralDP.DecoratorDP

class ExtraCheeze(private val basePizza: BasePizza) : ToppingDecorator() {

    override fun getCost(): Int {
        return basePizza.getCost() + 30
    }
}

class Mushroom(private val basePizza: BasePizza) : ToppingDecorator() {

    override fun getCost(): Int {
        return basePizza.getCost() + 15
    }
}