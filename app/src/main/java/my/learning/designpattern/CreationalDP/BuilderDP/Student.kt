package my.learning.designpattern.CreationalDP.BuilderDP

data class Student(
    var age: Int,
    var rollNo: String,
    var name: String,
    var fatherName: String,
    var motherName: String,
    var subjects: List<String>
) {
    constructor(builder: StudentBuilder) : this(
        builder.age,
        builder.rollNo,
        builder.name,
        builder.fatherName,
        builder.motherName,
        builder.subjects
    )
}