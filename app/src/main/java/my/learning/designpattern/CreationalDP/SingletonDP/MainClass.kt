package my.learning.designpattern.CreationalDP.SingletonDP

/**
 * **Creational Design Pattern responsible for creating objects/controls the object creation**
 *
 * Singleton Design Pattern
 * It is used when we have to create only 1 instance of the class
 *
 * There are 4 ways to create Singleton class
 *
 * - Eager
 * - Lazy
 * - Synchronized Method
 * - Double Checked Locking
 *
 */

fun main() {
    val dbConnection : DBConnection = DBConnection.getInstance()
}