// Create an object literal representing a bank
// account with properties for account number, account
// holder name, and balance. Add methods for depositing
// and withdrawing money from the account, and a method
// for checking the balance.

const bankAccount = {
    accountNumber: "123456789",
    accountHolderName: "Alice",
    balance: 1000,
    deposit: function (amount) {
        amount > 60000
            ? console.log("Требуется подтверждение легальности доходов")
            : (this.balance += amount);
    },
    withdraw: function (amount) {
        // if (amount <= this.balance) {
        //     this.balance -= amount;
        // } else {
        //     alert('Not enough money on the balance');
        // }
        amount <= this.balance
            ? (this.balance -= amount)
            : console.log("Not enough money on the balance");
    },
    checkBalance: function () {
        console.log(`Account balance is ${this.balance}`);
    },
};