package my.learning.designpattern.StructuralDP.ProxyDP


// it is "is a" relationship
class EmployeeDaoImpl : EmployeeDao {
    override fun createEmployee() {
        println("Employee created successfully")
    }
}