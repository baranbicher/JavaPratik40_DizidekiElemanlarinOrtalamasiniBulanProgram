public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);

        System.out.println("???????????????????????????");

       for (int i = 0; i < numbers.length; i++) {
            sum +=1/numbers[i];

        }
        System.out.println("Harmonik Sayı: " + sum);
        System.out.println("Harmonik Ortalama: " + numbers.length/sum);
    }
}