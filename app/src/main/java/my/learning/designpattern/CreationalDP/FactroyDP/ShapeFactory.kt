package my.learning.designpattern.CreationalDP.FactroyDP

class ShapeFactory {

    fun getShape(shapeName: String): Shape? {
        return when(shapeName) {
            "Rectangle" -> Rectangle()
            "Circle" -> Circle()
            else -> null
        }
    }
}