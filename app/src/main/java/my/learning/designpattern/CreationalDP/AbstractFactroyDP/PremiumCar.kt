package my.learning.designpattern.CreationalDP.AbstractFactroyDP

class PremiumCar1: Car {

    init { println("PremiumCar1") }

    override fun getTopSpeed(): Int {
        return 250
    }
}

class PremiumCar2: Car {

    init { println("PremiumCar2") }

    override fun getTopSpeed(): Int {
        return 300
    }
}