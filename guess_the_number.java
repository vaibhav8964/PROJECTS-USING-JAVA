import java.util.Scanner;
import java.util.Random;
public class guess_the_number
{
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public int comp_inp, user_inp, input,guess;
    guess_the_number ()                    //constructor will generate random number on behalf of computer
    {
        comp_inp = 1 + rand.nextInt(100);
    }
    int intro()                          //the introduction window of user sees
    {
        System.out.println("                                WELCOME TO GUESS THE NUMBER GAME");
        System.out.println("                               **********************************");
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
    void tutorial()                                      //to help user know how to play game
    {
        System.out.println("\n                                        HOW TO PLAY");
        System.out.println("                                       *************");
        System.out.println("                   -> JUST TRY TO GUESS THE NUMBER YOU THINK COMPUTER HAS THOUGHT.");
        System.out.println("                   -> ITS A GAME OF CHECKING HOW LESS GUESS CHANCE YOU TAKE.");
        System.out.println("                   -> FOR EXAMPLE :     ");
        System.out.println("                                   COMPUTER HAS GUESS 48. ");
        System.out.println("                                    NOW YOU GUESS 34 THAN COMPUTER WILL TELL YOU ITS LOWER THAN THE NUMBER.");
        System.out.println("                                    SO YOU GET A NEW CHANCE TO GUESS AGAIN");
        System.out.println("                                    NOW YOU GUESS 65 THAN COMPUTER WILL TELL YOU ITS HIGHER THAN THE NUMBER.");
        System.out.println("                                    SO YOU GET A NEW CHANCE TO GUESS AGAIN");
        System.out.println("                       -> THIS WILL GO ON UNTIL YOU DON'T GUESS THE CORRECT NUMBER.");
        System.out.println("                     ->IT WILL ALSO SHOW THE CHANCES YOU TAKE TO GUESS THE CORRECT NUMBER");
        System.out.println("             TAKING TO NEW GAME WINDOW ");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }

    void user_input()                               //to take the user input
    {
        System.out.println("\n                     NEW GAME");
        System.out.println("                    **********");
        System.out.println("        MAKE YOUR GUESS BETWEEN NUMBER 1 TO 100");
        System.out.print("        USER GUESS :- ");
        user_inp = sc.nextInt();
    }
    void recall()                  //to take user input inside loop
    {
        System.out.println("        AGAIN MAKE YOUR GUESS BETWEEN NUMBER 1 TO 100");
        System.out.print("        USER GUESS :- ");
        user_inp = sc.nextInt();
    }
    void condition()                 //testing condition
    {
        guess++;
        if(user_inp>comp_inp)
            {
                System.out.println("            HIGHER THAN THE COMPUTER NUMBER");
            }
        else if(user_inp<comp_inp)
            {
                System.out.println("            LOWER THAN THE COMPUTER NUMBER");
            }
        else if(user_inp==comp_inp)
            {
                System.out.println("            WOW YOU GUESSED THE CORRECT NUMBER");
            }
    }
}
class run                       // new clas to run main function
{
    public static void main(String[]args)
    {
        int choice;
        guess_the_number  gm=new guess_the_number ();
        choice=gm.intro();
        switch(choice)
        {
            case 1 : gm.tutorial();
            case 2 : gm.user_input();
                     gm.condition();
                     do
                     {
                        gm.recall();
                        gm.condition();
                     }while(!(gm.user_inp==gm.comp_inp ));
                     System.out.print("YOU TAKE "+gm.guess +" CHANCES TO GUESS CORRECTLY. ");
                     break;
        }
    }
}
