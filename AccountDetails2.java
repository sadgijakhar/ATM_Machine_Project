public class AccountDetails2 extends Account1Details {
    double money1 = 15.0;
     @Override
    void PersonalDetails1() {
        System.out.println();
        System.out.println("Name "+ name1());
        System.out.println("Account Number: "+ 123456);
        System.out.println("Address: "+ address1());
        System.out.println();
        account1();
    }
    String name1(){
        String Name = "Sadgi Jakhar";
        return Name;
    }
    String address1(){
        String address = "H.no 123 Street No.5 xyz Colony, New Delhi, India";
        return address;
    }

    @Override
    void Accountdetails1() {
        System.out.println("Account Balance: "+ balance1());
        account1();
    }
    double balance1(){
        return money1;
    }

    @Override
    void withdrawl1() {
        System.out.println();
        System.out.println("Account Balance: "+ balance1());
        System.out.println();
        int x = withdrawlAmount1();
        if(x < balance1()){
            money1-= x;
            System.out.println("Account Balance: "+ balance1());
            System.out.println();
            account1();
        }
        else{
            System.out.println("Balance is not Sufficient");
            System.out.println();
            account1();
        } 
    }
    int withdrawlAmount1() {
        System.out.println("Enter Amount to Withdraw: ");
        int option = sc.nextInt();
        return option;
    }
    @Override
    void deposit1() {
        System.out.println("Account Balance: "+ balance1());
        System.out.println();
        int x = depositAmount1();
        money1+=x;
        System.out.println();
        System.out.println("Account Balance: "+ balance1());
        System.out.println();
    }
    int depositAmount1() {
        System.out.print("Enter Amount to Deposit: ");
        int option = sc.nextInt();
        return option;
    }
    public static void main(String[] args) {
        AtmMachine s = new AccountDetails2();
        s.checkAccountNumber();
    }
}
