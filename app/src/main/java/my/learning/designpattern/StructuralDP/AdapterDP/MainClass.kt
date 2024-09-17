package my.learning.designpattern.StructuralDP.AdapterDP

/**
 * **Structural Design Pattern is a way to combine and arrange different classes and objects to form a complex and bigger structure to solve particular requirement**
 *
 * Adapter Design Pattern
 * It is used to convert the interface of a class into another interface that a client expects.
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 *
 * This pattern act as a bridge/intermediate between two incompatible interfaces.
 */

fun main() {
    val weightMachineAdapter = WeightMachineAdapterImpl()
    println("Weight in Kg: ${weightMachineAdapter.getWeightInKg()}")
}