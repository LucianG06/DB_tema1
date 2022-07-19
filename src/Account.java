public class Account {
    private long accountNo;
    private int amount;
    private String nationalId;

    public Account(long accountNo, int amount, String nationalId) {
        this.accountNo = accountNo;
        this.amount = amount;
        this.nationalId = nationalId;
    }

    public Account() {
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void deposit(int auxAmount) {
        amount += auxAmount;
    }

    public void withdraw(int auxAmount) throws NotEnoughMoneyException {
        if (amount >= auxAmount) {
            amount -= auxAmount;
        } else {
            throw new NotEnoughMoneyException("You don't have " + auxAmount + " euros in your account.");
        }
    }

    public void linkToNationalId(String auxNationalId) throws InvalidNationalIdException {
        try {
            long aux = Long.parseLong(auxNationalId);
        } catch (NumberFormatException e) {
            throw new InvalidNationalIdException("Your National Id is invalid");
        }

        nationalId = auxNationalId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", amount=" + amount +
                ", nationalId='" + nationalId + '\'' +
                '}';
    }
}
