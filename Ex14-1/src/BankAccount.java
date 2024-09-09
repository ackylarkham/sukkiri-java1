public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("口座番号が設定されていない");
        } else {
            if (accountNumber.length() <= 7) {
                //OK
            } else {
                throw new IllegalArgumentException("口座番号は7桁以内でなくてはならない");
            }
        }
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return ("残高 ￥" + this.balance + "(口座番号: " + this.accountNumber + ")");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else {
            if (o instanceof BankAccount a) {
                if (this.accountNumber.trim().equals(a.accountNumber.trim())) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
