package rvt;

public class paymentcard {
    private double balance;

    public paymentcard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance - 2.60 >= 0) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 >= 0) {
            this.balance = this.balance - 4.60;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount < 0)
            this.balance += amount;
            
        if (this.balance + amount > 0)
            this.balance += amount;
    }

    public class MainProgram {
        public static void main(String[] args) {
            paymentcard paulsCard = new paymentcard(10);
            paymentcard mattsCard = new paymentcard(453);

            paulsCard.eatHeartily();
            mattsCard.eatAffordably();

            System.out.println("Janis: " + paulsCard);
            System.out.println("Edgars: " + mattsCard);

            paulsCard.addMoney(2434);
            mattsCard.eatHeartily();

            System.out.println("Janis: " + paulsCard);
            System.out.println("Edgars: " + mattsCard);

            paulsCard.eatAffordably();
            paulsCard.eatAffordably();
            mattsCard.addMoney(600);

            System.out.println("Janis: " + paulsCard);
            System.out.println("Edgars: " + mattsCard);
        }
    }
}