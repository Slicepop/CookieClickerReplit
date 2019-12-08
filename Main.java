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
        try {
            
            System.out.println("Checking out shop.");
            Thread.sleep(1600);
            System.out.println("Checking out shop..");
            Thread.sleep(1500);
            System.out.println("Checking out shop...");
            System.out.println("");

            Thread.sleep(1000);
         } catch (Exception e){
           
         }
        
        System.out.println("How many cookies do you want to make per enter \nremember that each extra cookie per enter is 100 cookies\n");
        try{
          Thread.sleep(1000);
          System.out.println("How Many Cookeis Do You Want?");
        }catch (Exception e){}
        int number = sc.nextInt();
         if(cookieclick > number * 100 ){
           cookieclick = cookieclick - number * 100;
           cookiecount = cookiecount + number; 
           System.out.println("Ok you bought +" + number + " cookies per enter");
         } else{
           System.out.println("you have not enough cookies to buy +" + number + " cookies per enter");
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