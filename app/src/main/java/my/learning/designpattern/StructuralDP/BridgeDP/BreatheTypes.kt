package my.learning.designpattern.StructuralDP.BridgeDP

// this all classes can grow independently

class LandBreathe: BreatheImplementor {
    override fun breathProcess(creature: String) {
        println("Land Breathe by $creature")
    }
}

class WaterBreathe: BreatheImplementor {
    override fun breathProcess(creature: String) {
        println("Water Breathe by $creature")
    }
}

class TreeBreathe: BreatheImplementor {
    override fun breathProcess(creature: String) {
        println("Tree Breathe by $creature")
    }
}