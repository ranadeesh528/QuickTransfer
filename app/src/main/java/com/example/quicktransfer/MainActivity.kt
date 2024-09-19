package com.example.quicktransfer

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val users = mutableMapOf<String, User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample users
        users["1234567890"] = User("1234567890", 1000.0)
        users["0987654321"] = User("0987654321", 500.0)

        // Initialize UI elements
        val phoneInput = findViewById<EditText>(R.id.phoneInput)
        val amountInput = findViewById<EditText>(R.id.amountInput)
        val transferButton = findViewById<Button>(R.id.transferButton)
        val infoButton = findViewById<Button>(R.id.infoButton)
        val transactionsButton = findViewById<Button>(R.id.transactionsButton)
        val outputText = findViewById<TextView>(R.id.outputText)

        transferButton.setOnClickListener {
            val senderPhone = phoneInput.text.toString()
            val recipientPhone = "0987654321" // Hardcoded for demo
            val amount = amountInput.text.toString().toDoubleOrNull() ?: 0.0

            try {
                val sender = users[senderPhone] ?: throw IllegalArgumentException("User not found.")
                val recipient = users[recipientPhone] ?: throw IllegalArgumentException("Recipient not found.")
                sender.transfer(recipient, amount)
                outputText.text = "Transfer successful!"
            } catch (e: Exception) {
                outputText.text = "Error: ${e.message}"
            }
        }

        infoButton.setOnClickListener {
            val phone = phoneInput.text.toString()
            val user = users[phone]
            if (user != null) {
                outputText.text = "User: ${user.phoneNum}, Available Amount: ${user.availableAmount}"
            } else {
                outputText.text = "User not found."
            }
        }

        transactionsButton.setOnClickListener {
            val phone = phoneInput.text.toString()
            val user = users[phone]
            if (user != null) {
                outputText.text = "Transaction History:\n" + user.transactions.joinToString("\n") {
                    "From: ${it.from}, To: ${it.to}, Amount: ${it.amount}"
                }
            } else {
                outputText.text = "User not found."
            }
        }
    }
}
