class Student(
    private var studentId: Int,
    private var name: String,
): Person(name) {

    fun setStudentId(newId: Int){
        this.studentId = newId
    }

    fun printStudentDetails(){
        println("Name: $name, student ID $studentId")
    }
}