fun main(){
    val matrix = listOf(
        //      0   1   2
        listOf('a','b','c'), //0
        listOf('d','e','f'), //1
        listOf('g','h','i'), //2

    )
    println(matrix.size) //get the number of rows

    var row = 0
    //0-3
    while(row < matrix.size){
        var column = 0
        while (column < matrix[row].size){
            print("${matrix[row][column]} \t")
            column++
        }
        row++
        println()
    }

}