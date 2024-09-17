package my.learning.designpattern.CreationalDP.BuilderDP

class EngineeringStudentBuilder : StudentBuilder() {

    override fun setSubjects() =
        apply { this.subjects = listOf("Maths", "Physics", "Chemistry", "Computer Science") }

}