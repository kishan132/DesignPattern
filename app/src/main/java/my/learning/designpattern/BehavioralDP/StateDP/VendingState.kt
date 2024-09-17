package my.learning.designpattern.BehavioralDP.StateDP


interface VendingState {

    // these are the behaviours that the VendingMachine can have
    fun insertCoin(vendingMachine : VendingMachine)
    fun dispenseItem(vendingMachine : VendingMachine)
}