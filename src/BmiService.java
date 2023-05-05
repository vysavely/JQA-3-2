public class BmiService {
    public double calculate (double weightKG, double growthM) {
        double index = weightKG / (growthM*growthM);
        return (int)index;
    }
}
