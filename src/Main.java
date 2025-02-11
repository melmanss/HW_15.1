import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayAdvisor advisor = new DayAdvisor();
        System.out.print("Введіть день тижня (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY): ");
        String input = scanner.nextLine().toUpperCase();
        try {
            Day day = Day.valueOf(input);
            advisor.advise(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Невірний ввід. Будь ласка, введіть день тижня на англійській мові.");
        }
        scanner.close();
    }
}