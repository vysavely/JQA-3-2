public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKG = 98, growthM = 1.87;
        double resultBmi = service.calculate(weightKG, growthM);
        System.out.println ("Ваш индекс массы тела: " +(int)resultBmi);
    }
}