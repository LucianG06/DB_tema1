public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountNo(122344);
        account1.deposit(1200);
        try {
            account1.linkToNationalId("1234567890123");
        } catch (InvalidNationalIdException e) {
            e.printStackTrace();
        }
        System.out.println(account1);

        try {
            account1.withdraw(1000);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        System.out.println(account1);
        System.out.println();

        Account account2 = new Account();
        account2.setAccountNo(2000);
        account2.deposit(300);
        System.out.println(account2);

        try {
            account2.withdraw(400);
        } catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }
        System.out.println(account2);

        try {
            account2.linkToNationalId("121212FFF[");
        } catch (InvalidNationalIdException e) {
            e.printStackTrace();
        }

        System.out.println(account2);
    }
}
