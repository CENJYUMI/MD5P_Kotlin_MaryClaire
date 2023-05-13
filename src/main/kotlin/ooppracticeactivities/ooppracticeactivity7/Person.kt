package ooppracticeactivities.ooppracticeactivity7

class Person {
    var name:String
    var age:Int

    constructor(){
        //primary constructor
        name = "Charles Jayvin"
        age = 12
    }

    //secondary constructor
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }
}