void main() {
    IO.println("Enter your age: ");
    int age = Integer.parseInt(IO.readln());
    if ((age <= 0) || (age >= 120)) {
        IO.println("ไม่อยู่ในช่วงอายุที่ต้องการ");
    } else if (age <= 9) {
        IO.println("วัยเด็ก");
    } else if (age <= 19) {
        IO.println("วัยรุ่น");
    } else if (age <= 59) {
        IO.println("วัยผู้ใหญ่");
    } else
        IO.println("คุณอยู่ในช่วง : " + age);
}