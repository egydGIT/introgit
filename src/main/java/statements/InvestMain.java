package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {                                        // ezen még gondolkozom.
        System.out.println("Kérem adja meg a befektetett összeget: ");
        Scanner scanner = new Scanner(System.in);
        int fund = scanner.nextInt();

        System.out.println("Kérem adja meg a kamatlábat: ");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Tőke: " + investment.getFund());

        System.out.println("Kérem adja meg, a lekötés napjainak számát: ");
        int days = scanner.nextInt();
        System.out.println("Hozam: " + days + "nap után: " + investment.getYield(days));

        System.out.println("Kivett összeg " + days + "nap után: " + investment.close(days));


    }
}
