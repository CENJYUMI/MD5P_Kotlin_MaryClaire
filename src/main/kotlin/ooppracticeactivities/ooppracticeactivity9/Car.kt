package ooppracticeactivities.ooppracticeactivity9

class Car {
    var make:String
    var model:String
    var year:Int

    constructor(){
        //primary constructor
        make = "Toyota"
        model = "Altis"
        year = 2002
    }
    constructor(make:String, model:String, year:Int){
        //secondary constructor
        this.make = make
        this.model = model
        this.year = year
    }
}