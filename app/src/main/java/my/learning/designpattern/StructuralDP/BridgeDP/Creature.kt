package my.learning.designpattern.StructuralDP.BridgeDP

// this all classes can grow independently

class Dog(private val breatheImplementor: BreatheImplementor): LivingThing() {
    override fun breathProcess() {
        breatheImplementor.breathProcess("Dog")
    }
}

class Fish(private val breatheImplementor: BreatheImplementor): LivingThing() {
    override fun breathProcess() {
        breatheImplementor.breathProcess("Fish")
    }
}

class Tree(private val breatheImplementor: BreatheImplementor): LivingThing() {
    override fun breathProcess() {
        breatheImplementor.breathProcess("Tree")
    }
}