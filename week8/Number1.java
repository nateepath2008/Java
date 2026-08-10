void main() {
    int number3 = 0;
    IO.print("Enter number 1: ");
    int number1 = Integer.parseInt(IO.readln());
    IO.print("Enter number 2: ");
    int number2 = Integer.parseInt(IO.readln());
    IO.println("Current -> number 1 = " + number1 + " and number 2 = " + number2);
    IO.println("Swapping . . . . . . . ");
    number3 = number1;
    number1 = number2;
    number2 = number3;
    IO.println("Now -> number 1 = " + number1 + " number 2 = " + number2);
}