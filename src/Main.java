public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 88.7;   // килограммы
        double height = 1.75;   // метры
        double bmiIndex = service.calculate(weight,height);
        System.out.println("Ваш ИМТ составляет: " + bmiIndex);
    }
}
