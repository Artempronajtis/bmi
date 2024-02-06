public class BmiService {
    public int calculate(double weight, double height) {

        double bmi = weight / (height * height);
        int roundedBMI = (int) bmi;

        return roundedBMI;


    }
}
