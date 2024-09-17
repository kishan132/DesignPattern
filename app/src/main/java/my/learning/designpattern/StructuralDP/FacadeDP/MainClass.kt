package my.learning.designpattern.StructuralDP.FacadeDP

/**
 * **Structural Design Pattern is a way to combine and arrange different classes and objects to form a complex and bigger structure to solve particular requirement**
 *
 * Facade Design Pattern
 * It is used to hide the system complexity from the client.
 */

fun main() {
    val acFacade = ACFacade()
    // all the complexity of turning ON the AC is hidden from the client
    // client just need to call the method to turn ON the AC
    // and facade will take care of the rest of process
    acFacade.turnONAc()
}