void main() {
   String correctPin = "1234";
    double balance = 10000.0;

    // รับรหัส PIN
    IO.println("Enter PIN:");
    String pin = IO.readln();

    // ตรวจสอบรหัส PIN
    if (pin.equals(correctPin)) {
        // แสดงเมนู ATM
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        
        IO.println("Select option:");
        int menu = Integer.parseInt(IO.readln());

        // ตรวจสอบเมนูที่เลือกโดยใช้ if-else
        if (menu == 1) {
            // เมนูที่ 1: ตรวจสอบยอดเงิน
            IO.println("Your balance is " + balance + " baht.");
        } 
        else if (menu == 2) {
            // เมนูที่ 2: ถอนเงิน
            IO.println("Enter amount to withdraw:");
            double amount = Double.parseDouble(IO.readln());

            if (amount <= 0) {
                IO.println("The amount must be greater than 0.");
            } else if (amount > balance) {
                IO.println("Insufficient funds.");
            } else {
                balance = balance - amount;
                IO.println("Withdrawal successful.");
                IO.println("Remaining balance: " + balance + " baht.");
            }
        } 
        else if (menu == 3) {
            // เมนูที่ 3: ฝากเงิน
            IO.println("Enter amount to deposit:");
            double amount = Double.parseDouble(IO.readln());

            if (amount > 0) {
                balance = balance + amount;
                IO.println("Deposit successful.");
                IO.println("Updated balance: " + balance + " baht.");
            } else {
                IO.println("The amount must be greater than 0.");
            }
        } 
        else if (menu == 4) {
            // เมนูที่ 4: ออกจากระบบ
            IO.println("Thank you for using the ATM.");
        } 
        else {
            // กรณีเลือกเมนูไม่ถูกต้อง
            IO.println("Invalid option.");
        }

    } else {
        IO.println("Incorrect PIN.");
    }
}