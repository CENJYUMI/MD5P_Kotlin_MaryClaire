package ooppracticeactivities.ooppracticeactivity10

fun main(){
    println("Primary Constructor")
    val bankAccount1 = BankAccount()
    println("Account Number: ${bankAccount1.accountNumber}")
    println("Balance: ${String.format("%,.2f", bankAccount1.balance)}")

    println("\nSecondary Constructor")
    val bankAccount2 = BankAccount(12345678910,15000.00)
    println("Account Number: ${bankAccount2.accountNumber}")
    println("Balance: ${String.format("%,.2f", bankAccount2.balance)}")
}