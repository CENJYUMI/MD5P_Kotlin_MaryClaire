package ooppracticeactivities.ooppracticeactivity8

class Date {
    var month:String
    var day:Int
    var year:Int

    constructor(){
        //primary constructor
        month = "September"
        day = 6
        year = 2010
    }
    constructor(month:String, day:Int, year:Int){
        //secondary constructor
        this.month = month
        this.day = day
        this.year = year
    }
}