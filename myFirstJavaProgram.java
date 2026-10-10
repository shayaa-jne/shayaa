public class myFirstJavaProgram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter your mother's name: ");
        String motherName = scanner.nextLine();

        System.out.print("Enter your mother's occupation: ");
        String motherOccupation = scanner.nextLine();

        System.out.print("Enter your father's name: ");
        String fatherName= scanner.nextLine();

        System.out.print("Enter your father's occupation: ");
        String fatherOccupation = scanner.nextLine();

        System.out.println("Hello World!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of birth: " + dateOfBirth);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Mother's occupation: " + motherOccupation);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Father's occupation: " + fatherOccupation);

        scanner.close();
    }
}