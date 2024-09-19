# QuickTransfer

**QuickTransfer** is a simplified money transfer app that allows users to send money to others easily, view their account balance, and access their transaction history. This project is developed using **Kotlin** in **Android Studio**.

## Table of Contents

- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

## Features

- **Transfer Money:** Send money from one user to another securely by entering a phone number and amount.
- **View Balance:** Display the current balance of the logged-in user.
- **Transaction History:** List of all transactions made by the user.
- **Responsive UI:** Designed with a clean and user-friendly interface.
- **Error Handling:** Includes basic error handling for invalid inputs (e.g., insufficient funds, invalid phone numbers).

---

## Screenshots

| ![Login Screen](https://via.placeholder.com/150) | ![Transfer Screen](https://via.placeholder.com/150) | ![Transaction History](https://via.placeholder.com/150) |
|:------------------------------------------------:|:---------------------------------------------------:|:-------------------------------------------------------:|
| **Login**                                        | **Transfer Amount**                                  | **Transaction History**                                 |

---

## Installation

To run this project locally, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/QuickTransfer.git
    ```
2. Open the project in **Android Studio**.
3. Sync Gradle and resolve dependencies.
4. Build and run the app on your emulator or physical device.

---

## Usage

1. **Log In:** Enter the user’s phone number to log in.
2. **Transfer Amount:** Input the recipient's phone number and the amount to transfer.
3. **View User Info:** Displays the current available balance of the logged-in user.
4. **Transaction History:** Displays a list of past transactions.

---

## Project Structure

```bash
QuickTransfer/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/yourapp/quicktransfer/
│   │   │   │   │   ├── MainActivity.kt
│   │   │   │   │   ├── User.kt
│   │   │   │   │   ├── Transaction.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   ├── drawable/
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── strings.xml
│   ├── build.gradle
│   ├── AndroidManifest.xml
├── README.md
