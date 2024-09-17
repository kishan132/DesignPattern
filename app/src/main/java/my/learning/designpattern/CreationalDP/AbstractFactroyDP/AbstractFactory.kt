package my.learning.designpattern.CreationalDP.AbstractFactroyDP

interface AbstractFactory {
    fun getInstance(price: Int) : Car
}