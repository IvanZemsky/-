import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        int occurrences = countOccurrences(str1, str2);

        System.out.println("Число вхождений второй строки в первую: " + occurrences);
    }

    public static int countOccurrences(String str1, String str2) {
        if (str1 == null || str2 == null) return 0;
        if (str1 == "" || str2 == "") return 1;

        int count = 0;
        int index = str1.indexOf(str2);

        while (index != -1) {
            count++;
            index = str1.indexOf(str2, index + 1);
        }

        return count;
    }
}
