public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.7;
        double weight = 80;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println("Индекс массы вашего тела: " + bodyMassIndex);
    }
}