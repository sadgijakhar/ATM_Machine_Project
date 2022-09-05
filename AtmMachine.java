import java.util.*;
public abstract class AtmMachine {
    Scanner sc = new Scanner(System.in);
    static int No_Of_Account = 2;
    static int accountNummber [] = new int[No_Of_Account];
    HashMap<Integer , Integer> hm = new HashMap<>();
    int accountNo(){
        System.out.print("Enter Account Number: ");
        int account = sc.nextInt();
        return account;
    }
    void checkAccountNumber(){
        hm.put(987654 , 101010);
        hm.put(123456,000000);
        Set<Integer> keys = hm.keySet();
        int i = 0;
        for ( Integer key : keys ) {
            accountNummber[i] = key;
            i++;
        }
        int x = accountNo();
            if(!hm.containsKey(x)){
                System.out.println("Invalid Account Number");
                checkAccountNumber();
            }
            else{
                if(accountNummber[0]==x){
                    checkPassWord(x);
                }
                else if(accountNummber[1]==x){
                    checkPassWord1(x);
                }
            }
        
        
    }
    int password() {
        System.out.print("Enter Password: ");
        int pass = sc.nextInt();
        return pass;
    }
    void checkPassWord(int x){
        int password = password();
        int a = hm.get(x);
        
            if(a == password){
                System.out.println("Welcome To Your Account");
                account1();
            }
            else{
                System.out.println("Invalid Password");
                checkAccountNumber();
            }  
    }
    void checkPassWord1(int x){
        int password = password();
        int a = hm.get(x);
            if(a == password){
                System.out.println("Welcome To Your Account");
                account();
            }
            else{
                System.out.println("Invalid Password");
            } 
    }

    abstract void account();
    abstract void account1();
}