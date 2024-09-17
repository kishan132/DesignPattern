package my.learning.designpattern.CreationalDP.BuilderDP

class MBAStudentBuilder : StudentBuilder() {

    override fun setSubjects() =
        apply { this.subjects = listOf("Marketing", "Finance", "Human Resource", "Operations") }

}