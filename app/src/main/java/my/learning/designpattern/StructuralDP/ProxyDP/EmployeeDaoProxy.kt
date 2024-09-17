package my.learning.designpattern.StructuralDP.ProxyDP

// it is "has a" relationship
class EmployeeDaoProxy : EmployeeDao {

    // this has a original object
    private val employeeDaoImpl = EmployeeDaoImpl()

    override fun createEmployee() {
        employeeDaoImpl.createEmployee()
    }

    fun create(user:String) {
        if(user == "ADMIN") {
            createEmployee()
        } else {
            println("$user: You are not authorized to create employee")
        }
    }
}