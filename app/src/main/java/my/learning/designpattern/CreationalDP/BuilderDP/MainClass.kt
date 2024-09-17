package my.learning.designpattern.CreationalDP.BuilderDP

/**
 * **Creational Design Pattern responsible for creating objects/controls the object creation**
 *
 * Builder Design Pattern
 * It is used when we want to construct a complex object step by step and the final step will return the object.
 *
 */

fun main() {

    val director1 = Director(EngineeringStudentBuilder())
    val engineeringStudent = director1.createStudent()
    println(engineeringStudent)

    val director2 = Director(MBAStudentBuilder())
    val mbaStudent = director2.createStudent()
    println(mbaStudent)

}

class Director(private var studentBuilder: StudentBuilder) {

    fun createStudent(): Student {
        return when (studentBuilder) {
            is EngineeringStudentBuilder -> createEngineeringStudent()
            is MBAStudentBuilder -> createMBAStudent()
            else -> throw IllegalArgumentException("Invalid Student Type")
        }
    }

    fun createEngineeringStudent(): Student {
        return studentBuilder.setAge(19).setRollNumber("1214").setName("John")
            .setFatherName("John's Father").setMotherName("John's Mother").setSubjects().build()
    }

    fun createMBAStudent(): Student {
        return (studentBuilder.setAge(22).setRollNumber("1234").setName("Kim")
            .setFatherName("Kim's Father").setMotherName("Kim's Mother").setSubjects() as MBAStudentBuilder).build()
    }

}