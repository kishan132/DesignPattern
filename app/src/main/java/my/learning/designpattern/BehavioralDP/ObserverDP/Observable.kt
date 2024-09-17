package my.learning.designpattern.BehavioralDP.ObserverDP

class ObservalbeImpl : Observable {
    private val observers = mutableListOf<Observer>()

    override fun register(observer: Observer) {
        observers.add(observer)
    }

    override fun unregister(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update()
        }
    }

    override fun setData() {
        println("Data is set")
        notifyObservers()
    }

}


interface Observable {
    fun register(observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObservers()
    fun setData()
}