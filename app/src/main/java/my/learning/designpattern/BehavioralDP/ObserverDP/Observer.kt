package my.learning.designpattern.BehavioralDP.ObserverDP


class ObserverImpl : Observer {
    override fun update() {
        println("Observer is updated")
    }
}


interface Observer {
    fun update()
}