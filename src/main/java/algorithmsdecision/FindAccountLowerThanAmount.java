package algorithmsdecision;

import java.util.ArrayList;
import java.util.List;

public class FindAccountLowerThanAmount {

    public boolean findAccountLargerThanAmount(List<BankAccount> bankAccounts, int amount) {
        boolean contains = false;
        int i = 0;
        while (i < bankAccounts.size() && !contains) {
            if (bankAccounts.get(i).getBalance() > amount) {
                System.out.println(bankAccounts.get(i).getNameOfOwner());
                contains = true;
            }
            i++;
        }
        return contains;
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Jack Smith", "123", 450_782);
        BankAccount bankAccount2 = new BankAccount("John Sales", "123", 360_000);
        BankAccount bankAccount3 = new BankAccount("Kate Middle", "123", 75_620);

        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(bankAccount1);
        bankAccounts.add(bankAccount2);
        bankAccounts.add(bankAccount3);

        System.out.println(new FindAccountLowerThanAmount().findAccountLargerThanAmount(bankAccounts, 450_000));
    }
}
