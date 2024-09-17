package my.learning.designpattern.StructuralDP.DecoratorDP

class FarmhousePizza : BasePizza() {
    override fun getCost(): Int {
        return 200
    }

}

class MargaritaPizza : BasePizza() {
    override fun getCost(): Int {
        return 100
    }

}