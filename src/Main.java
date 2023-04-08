public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(49.8, 1.63);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
