package my.learning.designpattern.CreationalDP.AbstractFactroyDP

class EconomicCarFactory : AbstractFactory {

    override fun getInstance(price: Int) : Car {
        return if (price < 100000) {
            EconomicCar1()
        } else {
            EconomicCar2()
        }
    }

}