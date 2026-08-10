void main() {
    IO.print("Enter price: ");
    int price = Integer.parseInt(IO.readln());
    IO.print("Enter quantity: ");
    int quantity = Integer.parseInt(IO.readln());

    int pay = price * quantity;
    if (pay <= 1000) {

        int change = 1000 - pay;
        IO.println("Change is: " + change + " baht");

        int b500 = change / 500;
        change = change % 500;

        int b100 = change / 100;
        change = change % 100;

        int b50 = change / 50;
        change = change % 50;

        int b20 = change / 20;
        change = change % 20;

        int c10 = change / 10;
        change = change % 10;

        int c5 = change / 5;
        change = change % 5;

        int c2 = change / 2;
        change = change % 2;

        int c1 = change;
        IO.println("Five-hundred note: " + b500 + " note(s)");
        IO.println("Hundred note: " + b100 + " note(s)");
        IO.println("Fifty note: " + b50 + " note(s)");
        IO.println("Twenty note: " + b20 + " note(s)");
        IO.println("Ten coin: " + c10 + " coin(s)");
        IO.println("Five coin: " + c5 + " coin(s)");
        IO.println("Two coin: " + c2 + " coin(s)");
        IO.println("One coin: " + c1 + " coin(s)");
    } else {
        IO.println("Not enough money!!");
    }
}