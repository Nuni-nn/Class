
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