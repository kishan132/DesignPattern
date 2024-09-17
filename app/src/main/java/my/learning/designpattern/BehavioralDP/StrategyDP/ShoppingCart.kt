package my.learning.designpattern.BehavioralDP.StrategyDP

class ShoppingCart(private val payStrategy: PayStrategy) {

    fun pay(amount: Int) {
        payStrategy.pay(amount)
    }

}