public abstract class Account1Details extends AccountDetails {

    double money = 0.0;
    @Override
    void PersonalDetails() {
        System.out.println("Name "+ name());
        System.out.println("Account Number: "+ 987654);
        System.out.println("Address: "+ address());
        account();
    }
    String name(){
        String Name = "Sadik Jakhar";
        return Name;
    }
    String address(){
        String address = "H.no 123 Street No.5 xyz Colony, Sadar Bazar cantt, New Delhi, India";
        return address;
    }

    @Override
    void Accountdetails() {
        System.out.println("Account Balance: "+ balance());
        account();
        
    }
    double balance(){
        return money;
    }

    @Override
    void withdrawl() {
        System.out.println("Account Balance: "+ balance());
        System.out.println();
        int x = withdrawlAmount();
        if(x < balance()){
            money-=x;
            System.out.println("Account Balance: "+ balance());
        }
        else{
            System.out.println("Balance is not Sufficient");
            System.out.println();
            account();
        }
    }
    int withdrawlAmount() {
        System.out.println();
        System.out.println("Enter Amount to Withdraw: ");
        int option = sc.nextInt();
        return option;
    }


    @Override
    void deposit() {
        System.out.println("Account Balance: "+ balance());
        System.out.println();
        int x = depositAmount();
        money+=x;
        System.out.println("Account Balance: "+ balance());
        account();
    }

    int depositAmount() {
        System.out.println("Enter Amount to Deposit: ");
        int option = sc.nextInt();
        return option;
    }

    abstract void PersonalDetails1();
    abstract void Accountdetails1();
    abstract void withdrawl1();
    abstract void deposit1();
    
}
