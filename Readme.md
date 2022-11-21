public class Main {
    public static void main(String[] args) {
        double startBalance = 355.5; // начальный баланс клиента
        double amount = 999.9; // сумма пополнения

        System.out.println("Баланс:" + startBalance);
        System.out.println("Сумма пополнения:" + amount);

        double finishBalance = startBalance + amount + amount / 100; // конечный баланс клиента
        double bonus = amount / 100;
        if (amount < 1000) {

            System.out.println("Количество бонусов: 0");
            System.out.printf("Итоговый на счету клиента:%s%n", startBalance + amount);

        } else {

            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый баланс клиента:" + finishBalance);

        }
    }
}
