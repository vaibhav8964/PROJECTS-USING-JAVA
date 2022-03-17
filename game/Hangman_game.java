import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman_game
{
    Scanner sc=new Scanner(System.in);
    int intro()                          //the introduction window of user sees
    {
        int input;
        System.out.println("                                WELCOME TO HANGMAN GAME");
        System.out.println("                               *************************");
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
        System.out.println("                   -> JUST TRY TO GUESS THE LETTER OF THE WORD YOU THINK COMPUTER HAS GENERATED.");
        System.out.println("                   -> YOU WILL GET 6 CHANCES TO COMPLETE THE WORD");
        System.out.println("                   -> AND FOR EVERY WRONG ANSWER A IMAGE WILL APPEAR LIKE A MAN HANGING.");
        System.out.println("                     ->THE FATE OF A MAN IS NOW ON YOUR SHOULDERS !! PLAY SMARTLY!!");
        System.out.println("             TAKING TO NEW GAME WINDOW ");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }
    public void CHALO() throws FileNotFoundException
    {
        File dictionary = new File("C:/Users/SP/Documents/NetBeansProjects/game/src/english2.txt");
        Scanner textscanner = new Scanner(dictionary);
        Scanner input=new Scanner(System.in);
        ArrayList<String> words= new ArrayList<>();
        while(textscanner.hasNext())
        {
            words.add(textscanner.nextLine());
        }
        String hidden_text= words.get((int)(Math.random()*words.size()));
        int lives=6;
        char[] textArray=hidden_text.toCharArray();
        char[] myAnswers= new char[textArray.length];
        for(int i=0;i<textArray.length;i++)
        {
            myAnswers[i]='?';

        }
        boolean finished=false;
        System.out.println("                                WELCOME TO HANGMAN GAME");
        System.out.println("                               *************************");

        while(finished==false)
        {
            System.out.println("************************************************************************************");
            System.out.print("\t\tPLEASE MAKE YOUR GUESS:- ");
            String letter = input.next();
            while(letter.length()!=1 || Character.isDigit(letter.charAt(0)) )
            {
                System.out.println("\tERROR INPUT PLEASE GIVE CORRECT INPUT");
                letter=input.next();
            }
            boolean found=false;
            for(int i=0;i<textArray.length;i++)
            {
                if(letter.charAt(0)==textArray[i])
                {
                    myAnswers[i]=textArray[i];
                    found=true;
                }
            }
            if(!found){
                lives--;
                System.out.println("\tWRONG LETTER");
            }
            boolean done=true;
            for(int i=0;i< myAnswers.length;i++)
            {
                if(myAnswers[i]=='?')
                {
                    System.out.print("-");
                    done=false;
                }
                else
                {
                    System.out.print(" "+myAnswers[i]);
                }
            }
            System.out.println("\n"+"\tLIVES LEFT : "+lives);
            drawHangman(lives);
            if(done)
            {
                System.out.println("\t\tCONGRATS YOU FOUND THE WORD");
                finished=true;
            }
            if(lives<=0)
            {
                System.out.println("\t\tYOU ARE DEAD! NEED MORE PRACTICE");
                finished=true;
            }
        }
        System.out.println("\t\tTHE WORD IS "+hidden_text);

    }
    void drawHangman(int l) {
        if(l == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 5) {
            System.out.println("|----------");
            System.out.println("|    O ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 4) {
            System.out.println("|----------");
            System.out.println("|    O ");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 2) {
            System.out.println("|----------");
            System.out.println("|    O  |");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 1) {
            System.out.println("|----------");
            System.out.println("|    O _|");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else{
            System.out.println("|----------");
            System.out.println("|    O__|");
            System.out.println("|   -|-");
            System.out.println("|   /\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
    }
}

