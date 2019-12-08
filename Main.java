import java.util.Scanner;
class Main {
  
  public static void cookie(){
    Scanner sc = new Scanner(System.in);
    double cookieclick = 0;
    // cookieclick is how many cookies a in your bank
    double cookiecount = 1;
    // cookiecount is how many cookies per enter
    while(true){
      String enter = sc.nextLine();
      if(enter.equals("quit")){
        System.exit(69);
      }
      else if(enter.equals("count")){
        System.out.println(cookiecount);
      }
      else if(enter.equals("eat")){
        if(cookieclick < 1){
          System.out.println("You cannot eat right now you have no cookies");
        }
        else{
          cookieclick = cookieclick - 1;
          System.out.println("You ate one cookie");
        }
        
      }
      else if(enter.equals("help")){
        System.out.println("press enter to add a cookie and enter 'you can type a lot of commands like 'eat' to eat one cookie, 'shop' to enter the shop, and 'bal' to see how many cookies you have also type 'quit' to quit the game");
      }
      else if(enter.equals("debug")){
        cookieclick = cookieclick + 1000;
        cookiecount = cookiecount + 14;
        System.out.println("ok added 1000 more cookies");
      }
      else if(enter.equals("shop")){
        System.out.println("Checking out shop.");
        if(cookiecount < 5){
          System.out.println("You can buy + 5 cookies per clck (-100 cookies)");
        }
        else if(cookiecount < 20){
          System.out.println("You can buy + 5 cookies per clck (-350 cookies)");
        }
        else{
          System.out.println("You can buy + 5 cookies per clck (-1,000 cookies)");
        }
        String buy = sc.nextLine();
        if(buy.equals("buy + 5") & cookieclick > 99.9){
          if(cookiecount < 5){
            System.out.println("You bought + 5 cookies per enter.");
            cookiecount = cookiecount +  4;
            cookieclick = cookieclick - 100;
          }
          else if(cookiecount > 4 & cookiecount < 16){
            System.out.println("You bought + 5 cookies per enter.");
            cookiecount = cookiecount +  5;
            cookieclick = cookieclick - 350;
          }
          else if(cookiecount > 19){
            System.out.println("You bought + 5 cookies per enter.");
            cookiecount = cookiecount +  5;
            cookieclick = cookieclick - 1000;
          }
          else{
            System.out.println("You dont have enough cookies to buy this.");
          }
          
        }
        else{
          System.out.println("You dont have enough cookies to buy this. Or you misspeled something");
        }
       }
      else if(enter.equals("bal")){
        System.out.println(cookieclick + " Cookies");
      }
      else{
        cookieclick = cookieclick + cookiecount;
      }
    }
  }
  public static void main(String[] args) {
    System.out.println("\n");
        System.out.println("---------------------------------------------------------------");
    System.out.println("Welcome to my version of cookie clicker press enter to add a cookie type 'help' for a list of all of the commands");
  
   System.out.println("---------------------------------------------------------------");
   System.out.println("\n");

    cookie();
  }      
}