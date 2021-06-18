class account
{
    int acc_no;
    String name,acc_type;
    double balance;
    account(int num,String n,String type,double b)
    {
        acc_no=num;
        acc_type=type;
        name=n;
        balance=b;
    }
    void credit(double amt)
    {
        balance+=amt;
    }
    void debit(double amt)
    {
        if(balance<amt||balance-amt<1000)
            System.out.println("Not enough Balance available.");
        else
        {
            balance-=amt;
        }
    }
    void balanceCheck()
    {
        System.out.println("Balance is:"+balance);
    }
    public static void main(String[] args)
    {
        account a1=new account(123,"Aarya","current",1500.50);
        account a2=new account(127,"Anirudh","Savings",15800.50);
        a1.credit(300.60);
        a1.balanceCheck();
        a2.debit(800);
        a2.balanceCheck();

    }
}
