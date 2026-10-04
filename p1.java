import java.util.Scanner;
public class p1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         int hero_hp = 100;
        int monster_hp =100;
        int remaining_hp1;
        int remaining_hp2;
        int response;
        int n =10;
        int   m=2;
        int heal;
        int def;
        int opp;  
        int heal_1;    
        System.out.println("Enter 'Begin' to start the game : ");
        String beg = sc.nextLine();
        String var = "Begin";
       for (int j =1;j<m;j++){ 
        if (beg.equals(var)){
             System.out.println("THE BATTLE BEGINS !!!");
        }
        else{
            System.out.println("please re run the program  ");
            System.out.println("and type Begin to start ");
            hero_hp-=100;
            monster_hp-=100;
        
            break;
        }
        
    }
        while(hero_hp>0 && monster_hp>0){
              System.out.println("Choose your option");
        System.out.println("1. Attack ");
        System.out.println("2. Heal ");
        System.out.println("3. Defend ");
        System.out.println("4.Run away ");
        response  = sc.nextInt();
        if(response==4){
            System.out.println("You choose to run away ");
            break;

        }
        

        

        
      
        switch(response){
            case 1:
                System.out.println("You attacked the opponent ");
                remaining_hp1=(int)(Math.random()*50 )+1;
                remaining_hp2=(int)(Math.random()*50 )+1;
                hero_hp-=remaining_hp1;
                monster_hp-=remaining_hp2;
                System.out.println("Your  remaining hp is "+ hero_hp);
                System.out.println(" Opponent remaining hp is "+ monster_hp);
                break;

            case 2:
                System.out.println("you are healing ");
                if(hero_hp==100){
                    System.out.println("Your Energy full ");
                    continue;
                }
                else if(hero_hp<100){
                    heal = (int)(Math.random()*20)+1;
                hero_hp+=heal;

                }
                if(monster_hp==100){
                    System.out.println("Opponent  Energy full");
                    continue;
                }
                else if(monster_hp<100){
                    heal_1=(int)(Math.random()*20)+1;
                monster_hp+=heal_1;

                }
                
                System.out.println("Your total reamaining hp is "+hero_hp);
                System.out.println("Opponent remaining hp is "+monster_hp);
                break;
            case 3 : 
                System.out.println("You defended the opponent ");
                def = (int)(Math.random()*5)+1;
                hero_hp-=def;
                opp =(int)(Math.random()*3)+1;
                monster_hp-=opp;
                System.out.println("Your remaining hp is :"+hero_hp);
                System.out.println("opponent remaining hp is :"+monster_hp);
                break;
        }
        if (monster_hp>0 && hero_hp<=0){
            System.out.println("Opponent WON !!");
            System.out.println("Please try again in next game");
            
        }
        else if (hero_hp>0 && monster_hp<=0){
            System.out.println("Congratulations");
            System.out.println("You WON !!");
        
        
        }
        else if (hero_hp==0 && monster_hp==0){
            System.out.println("The match has been tied !! ");

            
        }
        if(monster_hp<0 && hero_hp<0){
            if( hero_hp<monster_hp){
             System.out.println("Opponent WON !!");
            System.out.println("Please try again in next game");

        }
        else if(monster_hp<hero_hp){
              System.out.println("Congratulations");
            System.out.println("You WON !!");

        }
        if(hero_hp==0 && monster_hp<0){
             System.out.println("Congratulations");
            System.out.println("You WON !!");

        }
        else if (monster_hp==0 && hero_hp<0){
             System.out.println("Opponent WON !!");
            System.out.println("Please try again in next game");


        }
    }

    }
}
}
                