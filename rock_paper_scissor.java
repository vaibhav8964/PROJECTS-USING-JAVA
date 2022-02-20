import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor
{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int comp_inp, user_inp, input;
    void random_no()
    {
        comp_inp = 1 + rand.nextInt(3);
    }
    int intro()
    {
        System.out.println("                                WELCOME TO ROCK PAPER SCISSOR GAME");
        System.out.println("                               ************************************");
        System.out.println("                                        DEVELOP BY VAIBHAV");
        System.out.println("                                       ********************");
        System.out.println("                        MENU");
        System.out.println("                       ------ ");
        System.out.println("                    1. TUTORIAL");
        System.out.println("                    2. NEW GAME\n");
        System.out.print("        ENTER YOUR OPTION(1/2) :- ");
        input = sc.nextInt();
        return input;
    }
    void tutorial()
    {
        System.out.println("\n                                        HOW TO PLAY");
        System.out.println("                                       *************");
        System.out.println("                   -> JUST TYPE THE NUMBER CORRESPONDING TO THE SYMBOL YOU WANT TO ENTER.");
        System.out.println("                   -> FOR EXAMPLE :     ");
        System.out.println("                                   THE AVAILABLE OPTIONS ARE:- ");
        System.out.println("                                        1.SCISSOR");
        System.out.println("                                        2.ROCK");
        System.out.println("                                        3.PAPER");
        System.out.print("                      ->IF YOU WANT TO CHOOSE SCISSOR AS YOUR OPTION THAN JUST CHOOSE 1 AS YOUR INPUT");
        System.out.println("                    ->IF YOU WANT TO CHOOSE ROCK AS YOUR OPTION THAN JUST CHOOSE 2 AS YOUR INPUT");
        System.out.println("                    ->IF YOU WANT TO CHOOSE PAPER AS YOUR OPTION THAN JUST CHOOSE 3 AS YOUR INPUT");
        System.out.println("             TAKING TO NEW GAME WINDOW ");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }

    void userinput()
    {
        System.out.println("\n                     NEW GAME");
        System.out.println("                    **********");
        System.out.println("        PLEASE CHOOSE YOUR SYMBOL FROM THE OPTIONS BELOW.......");
        System.out.println("                   THE AVAILABLE OPTIONS ARE:- ");
        System.out.println("                      1.SCISSOR");
        System.out.println("                      2.ROCK");
        System.out.println("                      3.PAPER");
        System.out.print("        ENTER YOUR OPTION(1/2/3) :- ");
        user_inp = sc.nextInt();
        switch (user_inp)
        {
            case 1:
                System.out.println("USER : SCISSOR");
                break;
            case 2:
                System.out.println("USER : ROCK");
                break;
            case 3:
                System.out.println("USER : PAPER");
                break;
        }
        switch (comp_inp)
        {
            case 1:
                System.out.println("COMPUTER : ROCK");
                break;
            case 2:
                System.out.println("COMPUTER : PAPER");
                break;
            case 3:
                System.out.println("COMPUTER : SCISSOR");
                break;
        }
    }
    void condition()
    {
      switch(comp_inp)
      {
          case 1 :  if(user_inp==1)
                    {
                        System.out.println("COMPUTER WON");
                    }
                    else if(user_inp==2)
                    {
                        System.out.println("ITS A DROW");
                    }
                    else if(user_inp==3)
                    {
                        System.out.println("USER WON");
                    }
                    break;
          case 2 :  if(user_inp==2)
                    {
                        System.out.println("COMPUTER WON");
                    }
                    else if(user_inp==3)
                    {
                       System.out.println("ITS A DROW");
                    }
                    else if(user_inp==1)
                    {
                        System.out.println("USER WON");
                    }
                    break;
          case 3 :  if(user_inp==3)
                    {
                        System.out.println("COMPUTER WON");
                    }
                    else if(user_inp==1)
                    {
                        System.out.println("ITS A DROW");
                    }
                    else if(user_inp==2)
                    {
                        System.out.println("USER WON");
                    }
                    break;
      }
    }
}
class run
{
    public static void main(String[]args)
    {
        int choice;char b;
        Scanner sd=new Scanner(System.in);
        rock_paper_scissor gm=new rock_paper_scissor();
        choice=gm.intro();
        switch(choice)
        {
            case 1 : gm.tutorial();
            case 2 : do
                     {
                         gm.random_no();
                         gm.userinput();
                         gm.condition();
                         System.out.print("WANT TO PLAY ONCE MORE: -");
                         b =sd.next().charAt(0);
                     }while( b=='y' || b=='Y');
                     break;
        }
    }
}



