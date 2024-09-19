package com.example.quicktransfer

data class Transaction(
    val from: String,
    val to: String,
    val amount: Double
)

class User(
    val phoneNum: String,
    var availableAmount: Double
) {
    val transactions = mutableListOf<Transaction>()

    fun transfer(recipient: User, amount: Double) {
        if (amount <= 0) throw IllegalArgumentException("Transfer amount must be greater than zero.")
        if (amount > availableAmount) throw IllegalArgumentException("Insufficient funds.")

        availableAmount -= amount
        recipient.availableAmount += amount
        transactions.add(Transaction(from = phoneNum, to = recipient.phoneNum, amount = amount))
    }
}
