public class Main {
    public static void main(String[] args) {
        int startBalance = 300; // начальный баланс клиента
        int x = 1255; // сумма пополнения

        System.out.println("Баланс:" + startBalance);
        System.out.println("Сумма пополнения:" + x);

        int finishBalance = startBalance + x + x/100; // конечный баланс клиента
        int bonus = x/100;
        if (x < 1000) {

            System.out.println("Количество бонусов = 0");
            System.out.println("Сумма на счету клиента:" + (startBalance + x));

        } else {

            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый баланс клиента:" + finishBalance);

        }
    }
}