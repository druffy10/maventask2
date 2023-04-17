import ru.netology.maventask.services.RestMonthsCalculator;

public class Main {

    public static void main(String[] args) {
        RestMonthsCalculator service = new RestMonthsCalculator();
        System.out.println(service.calculateRestMonths(100000,60000,150000));
    }
}