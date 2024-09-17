package my.learning.designpattern.StructuralDP.ProxyDP

/**
 * **Structural Design Pattern is a way to combine and arrange different classes and objects to form a complex and bigger structure to solve particular requirement**
 *
 * Proxy Design Pattern
 * It is used to provide control access to another object (or original object).
 *
 */

fun main() {
    val employeeDaoProxy = EmployeeDaoProxy()
    employeeDaoProxy.create("ADMIN")
    employeeDaoProxy.create("KISHAN")
}