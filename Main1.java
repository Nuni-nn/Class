public class OnlineBanking {
    public String name;
    public double balance;
    public int Deposit;

    public void setValues(String name, double balance, int Deposit) {
        this.name = name;
        this.balance = balance;
        this.Deposit = Deposit;
    }

    public String getValues() {
        String info= "Name: " + name + "\nBalance1: " + balance+"\n"+"Deposit: " + Deposit+"\n";
        String info2= "Balance2: ";
        if (Deposit > 0)
            info2+= balance + Deposit + "\n";

        return info + info2;
    }
}

public class Main{
    public static void main(String[] args){
        OnlineBanking people1 = new OnlineBanking();
        people1.name="Tom";
        people1.balance=1000;
        people1.Deposit=500;

        String res=people1.getValues();
        System.out.println(res);
    }
}
