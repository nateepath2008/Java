void main() {
    String correctPin = "1234";
    double balance = 10000.0;

    // รับรหัส PIN จากผู้ใช้ 1 ครั้ง
    String inputPin = IO.readln("Enter PIN: ");

    // ตรวจสอบรหัส PIN
    if (!inputPin.equals(correctPin)) {
        IO.println("Incorrect PIN.");
        return;
    }

    boolean isRunning = true;

    // วนลูปแสดงเมนูและทำงานตามตัวเลือก
    while (isRunning) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");

        String choice = IO.readln("Select an option: ");

        switch (choice) {
            case "1":
                IO.println("Your balance is " + balance + " baht.");
                break;

            case "2":
                String withdrawInput = IO.readln("Enter amount to withdraw: ");
                double withdrawAmount = Double.parseDouble(withdrawInput);

                if (withdrawAmount <= 0) {
                    IO.println("The amount must be greater than 0.");
                } else if (withdrawAmount > balance) {
                    IO.println("Insufficient funds.");
                } else {
                    balance -= withdrawAmount;
                    IO.println("Withdrawal successful.");
                    IO.println("Remaining balance: " + balance + " baht.");
                }
                break;

            case "3":
                String depositInput = IO.readln("Enter amount to deposit: ");
                double depositAmount = Double.parseDouble(depositInput);

                if (depositAmount > 0) {
                    balance += depositAmount;
                    IO.println("Deposit successful.");
                    IO.println("Updated balance: " + balance + " baht.");
                } else {
                    IO.println("The amount must be greater than 0.");
                }
                break;

            case "4":
                IO.println("Thank you for using the ATM.");
                isRunning = false;
                break;

            default:
                IO.println("Invalid option.");
                break;
        }
    }
}