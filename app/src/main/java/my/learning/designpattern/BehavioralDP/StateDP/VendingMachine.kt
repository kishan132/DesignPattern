package my.learning.designpattern.BehavioralDP.StateDP

class VendingMachine(private var vendingState: VendingState) {

    fun getMachineState(): VendingState {
        return vendingState
    }

    fun setMachineState(vendingState: VendingState) {
        this.vendingState = vendingState
    }

}