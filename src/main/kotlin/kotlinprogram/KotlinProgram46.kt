fun main(){
    //assertion !!
    //nullable - non-nullable
    val name:String? = "John"
    val newName = name!!

    println(newName)

    //elvis operator
    val name2:String? = "Peter"
    val elvisOperatorResult = name2?: "No null values please"
        //display name2 if not null, otherwise display "no null value please"
    println(elvisOperatorResult)

    //?.let
    val greeting:String? = null
    val result = greeting?.let{10+10}
        //display let{} if not null, otherwise display null
    println(result)
}