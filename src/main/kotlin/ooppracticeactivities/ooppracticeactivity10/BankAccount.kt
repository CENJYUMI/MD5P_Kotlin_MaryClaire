package ooppracticeactivities.ooppracticeactivity10

class BankAccount {
    var accountNumber : Long
    var balance : Double

    constructor(){
        //primary constructor
        accountNumber = 9522584853
        balance = 12000.00
    }
    //secondary constructor
    constructor(accountNumber:Long, balance:Double){
        this.accountNumber = accountNumber
        this.balance = balance
    }

}