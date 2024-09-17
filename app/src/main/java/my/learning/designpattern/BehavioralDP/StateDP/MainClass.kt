package my.learning.designpattern.BehavioralDP.StateDP

/**
 * **Behavioral Design Pattern guides how different objects communicate with each other efficiently and distribute tasks efficiently,
 * making software system flexible and easy to maintain**
 *
 * State Design Pattern allows an object to alter its behaviour when its internal state changes
 */

fun main() {

    val vendingMachine = VendingMachine(IdleState())

    var state = vendingMachine.getMachineState()  // Idle state

    // coin will insert in Idle state and state change to Working state
    state.insertCoin(vendingMachine)

    state = vendingMachine.getMachineState()   // Working state

    // coin will dispense in Working state and state change to Idle state
    state.dispenseItem(vendingMachine)

}