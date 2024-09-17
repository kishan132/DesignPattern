package my.learning.designpattern.CreationalDP.AbstractFactroyDP

class AbstractFactoryProvider {

    fun getCarFactory(factoryType: String) : AbstractFactory? {
        if (factoryType == "Economic") {
            return EconomicCarFactory()
        } else if (factoryType == "Luxury" || factoryType == "Premium") {
            return PremiumCarFactory()
        }

        return null
    }
}