public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountOfCredit = 1_000_000;
        double creditTerm = 24; // количество месяцев
        double interestRate = 9.99; // в процентах

        int monthlyPayment12 = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж:" + monthlyPayment12);

        int monthlyPayment24 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платеж:" + monthlyPayment24);

        int monthlyPayment36 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платеж:" + monthlyPayment36);
    }
}