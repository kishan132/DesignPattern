package my.learning.designpattern.BehavioralDP.StrategyDP

class CreditCardImpl : PayStrategy {
    override fun pay(amount: Int) {
        println("CreditCard Amount paid: $amount")
    }
}

class UPIImpl : PayStrategy {
    override fun pay(amount: Int) {
        println("UPI Amount paid: $amount")
    }
}

class WalletImpl : PayStrategy {
    override fun pay(amount: Int) {
        println("Wallet Amount paid: $amount")
    }
}


interface PayStrategy {
    fun pay(amount: Int)
}