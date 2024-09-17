package my.learning.designpattern.CreationalDP.AbstractFactroyDP

class PremiumCarFactory : AbstractFactory {

    override fun getInstance(price: Int) : Car {
        return if (price < 1000000) {
            PremiumCar1()
        } else {
            PremiumCar2()
        }
    }

}