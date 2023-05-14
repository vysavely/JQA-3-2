public class BmiService {
    public int calculate(double weightKG, double growthM) {
        double index = weightKG / (growthM * growthM);
        return (int) index;
    }
}
