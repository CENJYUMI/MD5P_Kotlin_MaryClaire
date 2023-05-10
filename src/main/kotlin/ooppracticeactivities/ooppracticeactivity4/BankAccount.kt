package ooppracticeactivities.ooppracticeactivity4

class BankAccount(var accountNumber:Long, var balance:Double) {
    fun deposit(amount:Double){
        balance+= amount
        println("You have successfully deposited P${String.format("%,.2f",amount)} into your account!")
        println("Your account balance is P${String.format("%,.2f",balance)} ")

    }
    fun withdraw(amount:Double){
        balance-= amount
        println("\nYou have successfully withdrawn P${String.format("%,.2f",amount)} from your account!")
        println("Your account balance is P${String.format("%,.2f",balance)} ")
    }
}