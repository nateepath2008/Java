void main() {
    IO.println("Enter your score: ");
    int score = Integer.parseInt(IO.readln());
    char grade = 'E';
    if ((score <= 0) || (score >= 100)) {
        IO.println("You must enter a correct score, try again later.");
    } else if (score >= 80) {
        grade = 'A';
    } else if (score >= 70) {
        grade = 'B';
    } else if (score >= 60) {
        grade = 'C';
    } else if (score >= 50) {
        grade = 'D';
    } else
        grade = 'E';
    IO.println("Your grade is " + grade);
}