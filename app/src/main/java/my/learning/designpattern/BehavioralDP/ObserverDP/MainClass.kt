package my.learning.designpattern.BehavioralDP.ObserverDP

/**
 * **Behavioral Design Pattern guides how different objects communicate with each other efficiently and distribute tasks efficiently,
 * making software system flexible and easy to maintain**
 *
 * Observable Design Pattern defines a one-to-many dependency between objects so that
 * when one object changes state, all its dependents are notified and updated automatically.
 *
 */

fun main() {

    val observable = ObservalbeImpl()
    val observer1 = ObserverImpl()
    val observer2 = ObserverImpl()

    observable.register(observer1)
    observable.register(observer2)

    observable.setData()
    observable.unregister(observer2)
    observable.setData()

}

