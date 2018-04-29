import java.util.Scanner;

public class PiDay {
    private static final int PI_PRECISION = 10000;

    public static void main(String[] args){
        System.out.println("Calculating PI digits...\n");
        int[] piDigitsHexBase = PiGenerator.computePiInHex(PI_PRECISION);
        int[] piDigitsInTenBase = BaseTranslator.convertBase(piDigitsHexBase, 16, 10, PI_PRECISION);
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String piString = DigitsToStringConverter.convert(piDigitsInTenBase, 10, digits);
        System.out.println("Please input your date of birthday in format 'MMDD': ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        int index = WordFinder.findWords(piString, new String[]{date}).getOrDefault(date, -1);
        printResult(index);
    }
    private static void printResult(int index){
        if (index > -1) {
            System.out.printf("Found your day on %d digit", index);
        } else {
            System.out.println("Your day found on >10000 digit");
        }
    }
}
