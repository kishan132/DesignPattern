package my.learning.designpattern.CreationalDP.BuilderDP

// abstract class because student may be of different types like SchoolStudent, CollegeStudent, UniversityStudent etc.
abstract class StudentBuilder {

    // abstract properties
    var age: Int = 0
    var rollNo: String = ""
    var name: String = ""
    var fatherName: String = ""
    var motherName: String = ""
    var subjects: List<String> = emptyList()

    /*fun setRollNumber(rollNo:String): StudentBuilder {
        this.rollNo = rollNo
        return this
    }*/

    // "apply" will return the StudentBuilder object (this) after setting the value

    fun setRollNumber(rollNo: String) = apply { this.rollNo = rollNo }

    fun setAge(age: Int) = apply { this.age = age }

    fun setName(name: String) = apply { this.name = name }

    fun setFatherName(fatherName: String) = apply { this.fatherName = fatherName }

    fun setMotherName(motherName: String) = apply { this.motherName = motherName }

    // every student will have different subjects, so it is abstract - will override in child classes
    abstract fun setSubjects() : StudentBuilder

    // this will return the object of Student
    fun build(): Student = Student(this)
}