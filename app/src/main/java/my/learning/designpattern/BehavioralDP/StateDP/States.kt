package my.learning.designpattern.BehavioralDP.StateDP

class IdleState : VendingState {
    override fun insertCoin(vendingMachine: VendingMachine) {
        println("Coin inserted for Idle state")
        vendingMachine.setMachineState(WorkingState())
    }

    override fun dispenseItem(vendingMachine: VendingMachine) {
        println("Item dispensed for Idle state")
    }
}


class WorkingState : VendingState {
    override fun insertCoin(vendingMachine: VendingMachine) {
        println("Coin inserted for Working state")
    }

    override fun dispenseItem(vendingMachine: VendingMachine) {
        println("Item dispensed for Working state")
        vendingMachine.setMachineState(IdleState())
    }
}