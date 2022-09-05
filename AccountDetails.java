public abstract class AccountDetails extends AtmMachine{

    @Override
    void account() {

       System.out.println("Press 1 for Personal Details");
       System.out.println("Press 2 for Account Details");
       System.out.println("Press 3 for withdrawl");
       System.out.println("Press 4 for Deposit");
       System.out.println("Press 5 for Exit");
       int option = sc.nextInt();
       accountinfo(option);

    }
    void account1() {

        System.out.println("Press 1 for Personal Details");
        System.out.println("Press 2 for Account Details");
        System.out.println("Press 3 for withdrawl");
        System.out.println("Press 4 for Deposit");
        System.out.println("Press 5 for Exit");
        int option = sc.nextInt();
        accountinfo1(option);
 
     }

    void accountinfo(int x){
        if(x == 1){
            PersonalDetails();
        }
        else if (x == 2){
            Accountdetails();
        }
        else if (x == 3){
            withdrawl();
        }
        else if (x== 4){
            deposit();
        }
        else if(x==5){
            exit();
        }
        else{
            System.out.println("Choose the right Charcter: ");
            account();
        }
    }
    void accountinfo1(int x){
        if(x == 1){
            PersonalDetails1();
        }
        else if (x == 2){
            Accountdetails1();
        }
        else if (x == 3){
            withdrawl1();
        }
        else if (x== 4){
            deposit1();
        }
        else if(x==5){
            exit();
        }
        else{
            System.out.println("Choose the right Charcter: ");
            account1();
        }
    }
    void exit(){
        
    }
    abstract void PersonalDetails();
    abstract void Accountdetails();
    abstract void withdrawl();
    abstract void deposit();
    abstract void PersonalDetails1();
    abstract void Accountdetails1();
    abstract void withdrawl1();
    abstract void deposit1();
}
