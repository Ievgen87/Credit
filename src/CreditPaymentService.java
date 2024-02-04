public class CreditPaymentService {
    public int calculate(double amountOfCredit , double creditTerm ,  double interestRate) {

        double procent = (interestRate / 12) / 100;
        double pow = Math.pow((1 + procent), creditTerm);
        double coefficient = (procent * pow) / (pow - 1);
        double total = coefficient * amountOfCredit;
        int result = (int) total;



        return result;
    }
}
