fun main(){
    //Activity 8

    // 90-100: A
    // 80-89: B
    // 70-79: C
    // 60-69: D
    //Below 60: F

    var examScore : Int = 0
    // < > <= >= == !=
    println("Enter your exam score: ")
    examScore = readln().toInt()
    //age = -1
    if(examScore >= 90){
        println("A")
    }else if(examScore >= 80 ){
        println("B")
    }else if(examScore >= 70){
        println("C")
    }else if(examScore >= 60){
        println("D")
    }else {
        println("F")
    }
}