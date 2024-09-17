package my.learning.designpattern.StructuralDP.BridgeDP

// this is the issue as we are not able to change the implementation of the breathProcess() method
// as it is tightly coupled with their own class
// so we need to decouple the implementation of the breathProcess() method

class Dog1 : LivingThing1() {
    override fun breathProcess() {
        // this will has its own implementation
        // it has its own way of breathing
        println("Dog is breathing")
    }
}

class Fish1 : LivingThing1() {
    override fun breathProcess() {
        // this will has its own implementation
        // it has its own way of breathing
        println("Fish is breathing")
    }
}

class Tree1 : LivingThing1() {
    override fun breathProcess() {
        // this will has its own implementation
        // it has its own way of breathing
        println("Tree is breathing")
    }
}

abstract class LivingThing1 {
    abstract fun breathProcess()
}