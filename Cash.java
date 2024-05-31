import java.util.Scanner;
public class Cash {
    public static void main(String[] args) {
        String userName,password;
        int right=3;
        int select;
        int balance=1500000;


        while(right>0){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your username:");
            userName=scan.nextLine();
            System.out.println("Enter your password: ");
            password=scan.nextLine();

            if (userName.equals("poncikBuse") && password.equals("buse27")){
                System.out.println("Hello,Welcome to XX bank");
                do {
                    System.out.println("1-Lodgement\n2-Withdraw Money\n3-Balance inquiry\n4-Exit");
                    System.out.print("Please select the action you want to perform : ");
                    select=scan.nextInt();
                    if (select==1){
                        System.out.println("Amount of money: ");
                        int price=scan.nextInt();
                        balance+=price;
                    } else if (select==2) {
                        System.out.println("Amount of money: ");
                        int price=scan.nextInt();
                        if(price > balance){
                            System.out.println("Insufficient balance.");
                        }else {
                            balance-=price;
                        }
                    } else if (select==3) {
                        System.out.println("Your balance: " + balance);
                    }
                }while(select!=4);
                System.out.println("See you again.");
                break;
            }else{
                right--;
                System.out.println("Wrong username or password.Try again.");
                if (right==0){
                    System.out.println("Your account has been blocked, please contact your bank.");
                }else{
                    System.out.println("Your remaining right: " + right );
                }
            }
        }


    }
}
