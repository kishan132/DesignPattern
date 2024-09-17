package my.learning.designpattern.BehavioralDP.StrategyDP

/**
 * **Behavioral Design Pattern guides how different objects communicate with each other efficiently and distribute tasks efficiently,
 * making software system flexible and easy to maintain**
 *
 * Strategy Design Pattern defines multiple algorithms, and a class can choose the algorithm dynamically to be used depending on the situation.
 *
 */

fun main() {

    //Based upon situation will use algorithms to pay the amount.
    val shoppingCart = ShoppingCart(CreditCardImpl())
    shoppingCart.pay(100)

    val shoppingCart1 = ShoppingCart(UPIImpl())
    shoppingCart1.pay(200)

    val shoppingCart2 = ShoppingCart(WalletImpl())
    shoppingCart2.pay(300)

}