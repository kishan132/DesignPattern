package my.learning.designpattern.CreationalDP.AbstractFactroyDP

class EconomicCar1 : Car {

    init { println("EconomicCar1") }

    override fun getTopSpeed(): Int {
       return 100
    }
}

class EconomicCar2 : Car {

    init { println("EconomicCar2") }

    override fun getTopSpeed(): Int {
        return 150
    }
}