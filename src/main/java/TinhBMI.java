import java.util.Scanner;

public class TinhBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Can nang cua ban la (tinh theo kilogam): ");
        weight = scanner.nextDouble();
        System.out.println("Chieu cao cua ban la (tinh theo met): ");
        height = scanner.nextDouble();

        System.out.println("Ket qua cua ban la: \n" + tinhBmi(weight, height));
    }

    public static String tinhBmi(double weight, double height) {
        if (weight < 0.01 || weight > 700 || height <0.01 || height > 3) {
            throw new IllegalArgumentException("Invalid Input");
        } else {
            double bmi = weight / Math.pow(height, 2);
            String result;
            if (bmi < 18.5)
                result = "Thieu can";
            else if (bmi < 25.0)
                result = "Binh thuong";
            else if (bmi < 30.0)
                result = "Thua can";
            else
                result = "Beo phi";
            return result;
        }
    }
}
