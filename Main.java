import java.util.Scanner;
class Main {


    
  public static void cookie(){
    try {
      Scanner sc = new Scanner(System.in);

      
      int cookieclick = 0;
      // cookieclick is how many cookies a in your bank
      int cookiecount = 1;
      // cookiecount is how many cookies you get per enter
      int afksec = 1000;
      // afksec is how much time it takes to finish the afk sequence
      int upgrade = 0;
      // upgrade is how the afk shop determines if you can buy the afk upgrade in the shop
      int i = 0;
      // i is to determine when afk sequence stops


      while(true){
      String enter = sc.nextLine();
      if(enter.equals("quit")){
        System.exit(69);
      }
      else if(enter.equals("count")){
        System.out.println(cookiecount);
      }
      else if(enter.equals("afk")){
        System.out.println("How many secconds do you want to wait until the afk time is done (remember that you cannot stop the afk time until the secconds are up.)");
        int afkwait = sc.nextInt();
        while (i < afkwait) {
            Thread.sleep(afksec);
            System.out.println("Added +" + cookiecount + " Cookies\n");
            cookieclick = cookieclick + cookiecount;
            i++;
        }
        i = i - i;
        System.out.println("Done!");
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
        cookieclick = cookieclick + 10000 *10000000;
        cookiecount = cookiecount + 10000*10000;
        System.out.println("Welcome to developer mode.");
      }
      else if(enter.equals("shop")){
        System.out.println("\nChecking out shop.");
        Thread.sleep(1200);
        System.out.println("Checking out shop..");
        Thread.sleep(1050);
        System.out.println("Checking out shop...");
        Thread.sleep(900);
        System.out.println("\nYou can either upgrade the afk time or upgrade how many cookies you get per enter");
        System.out.println("so what do you want to upgrade?\n\ntype 'cookies' if you want to upgrade your cookies and type 'afk' for upgrading afk\n");
        String upgradeafk = sc.nextLine();

        if(upgradeafk.equals("cookies")){
          System.out.println("How many cookies do you want to make per enter \nremember that each extra cookie per enter is 100 cookies\n");
          Thread.sleep(800);
          System.out.println("How many cookies do you want?");
          int number = sc.nextInt();
          if(cookieclick > number * 100 ){
          cookieclick = cookieclick - number * 100;
          cookiecount = cookiecount + number; 
         } else{
           System.out.println("you have no cookies dude");
         }
        } else if(upgradeafk.equals("afk")){
          System.out.println("there are 4 upgrades the first three is 25% off the time\nthe last one is GOD mode where it is nearly instantaneously.\n\ntype 'upgrade' to buy the first one and then if you already bought the first or second the same command works for each upgrade.\n\n   1st upgrade:10,000,000,000 cookies\n   2nd upgrade:10,000,000,000,000,000,000 Cookies\n   3rd upgrade:10,000,000,000,000,000,000,000,000,000 Cookies\n   God upgrade:999,999,999,000,000,000,000,000,000,000,000,000,000,000 Cookies");
          String afkupgrade = sc.nextLine();
          if(afkupgrade.equals("upgrade")){
            if(upgrade == 0 && cookieclick > 10000*1000000){
              Thread.sleep(800);
              System.out.println("Loading.");
              Thread.sleep(800);
              System.out.println("Loading..");
              Thread.sleep(800);
              System.out.println("Loading...");
              Thread.sleep(800);
              System.out.println("you bought the 1st upgrade.");
              upgrade = upgrade + 1;
              afksec = afksec - 250;
              cookieclick = cookieclick - 10000 * 10000000;
            }else if(upgrade == 0 && cookieclick < 10000 *10000000){
              System.out.println("You dont have enough cookies to buy this");
            }else if(upgrade == 1 && cookieclick > 10000 *10000000 * 10000000 * 10){
              Thread.sleep(800);
              System.out.println("Loading.");
              Thread.sleep(800);
              System.out.println("Loading..");
              Thread.sleep(800);
              System.out.println("Loading...");
              Thread.sleep(800);
              upgrade = upgrade + 1;
              System.out.println("you bought the 2nd upgrade.");
              afksec = afksec - 250;
              cookieclick = cookieclick - 10000 *10000000 * 10000000 * 10;
            }else if(upgrade == 1 && cookieclick < 10000 *10000000 * 10000000 * 10){
              System.out.println("You dont have enough cookies to buy this");
            }else if(upgrade ==  2 && cookieclick > 10000 *10000000 * 10000000 * 10 * 1000 * 1000 * 1000){
              Thread.sleep(800);
              System.out.println("Loading.");
              Thread.sleep(800);
              System.out.println("Loading..");
              Thread.sleep(800);
              System.out.println("Loading...");
              Thread.sleep(800);
              System.out.println("you bought the 3rd upgrade.");
              upgrade = upgrade + 1;
              afksec = afksec - 250;
              cookieclick = cookieclick - 10000 *10000000 * 10000000 * 10 * 1000 * 1000 * 1000;
            }else if(upgrade == 2 && cookieclick < 10000 *10000000 * 10000000 * 10 * 1000 * 1000 * 1000){
              System.out.println("You dont have enough cookies to buy this");
            }else if(upgrade == 3 && cookieclick > 999999999 * 1000000 * 1000000 * 1000000 * 1000000 * 1000000 * 1000){
              Thread.sleep(800);
              System.out.println("Loading.");
              Thread.sleep(800);
              System.out.println("Loading..");
              Thread.sleep(800);
              System.out.println("Loading...");
              Thread.sleep(800);
              System.out.println("you just bought GOD MODE enjoy!");
              afksec = afksec - 225;
              upgrade = upgrade + 1;
              cookieclick = cookieclick - 999999999 * 1000000 * 1000000 * 1000000 * 1000000 * 1000000 * 1000;
            }else if (upgrade == 3 && cookieclick < 999999999 * 1000000 * 1000000 * 1000000 * 1000000 * 1000000 * 1000){
              System.out.println("You dont have enough cookies to buy this");
            }
          }else if(upgrade > 4){
            System.out.println("You already have GOD MODE you basically just won the game there is no more upgrades.");
        }else {System.out.println("try again by typing 'shop' and see if you misspelled something");}

        }else{System.out.println("try again by typing 'shop' and see if you misspelled something");}
        
         
         
       }
      else if(enter.equals("bal")){System.out.println("you have " + cookieclick + " Cookies");}
      else{System.out.println("Added +" + cookiecount + " cookies");
        cookieclick = cookieclick + cookiecount;}
    }
        
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }
  
  
  
    public static void main(String[] args){
    
    System.out.println("\n==================================================================================================================");
    System.out.println("Welcome to my version of cookie clicker press enter to add a cookie type 'help' for a list of all of the commands");
   System.out.println("==================================================================================================================\n");
   cookie();
  }

  }