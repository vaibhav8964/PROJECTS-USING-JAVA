import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;

public class Tic_Tac_Toe
{
    public int ott=0;
    Scanner sd=new Scanner(System.in);
    String p1;
    String p2;
    char ch;
    char check ;
    char pos[]=new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
    int flag=0;
    void tutorial()              //learn how to play
    {
        System.out.println("                                            HOW TO PLAY?");
        System.out.println("                                           **************");
        System.out.println("\n           1.A TIC TAC TOE TABLE IS SHOWN BELOW.");
        System.out.println("           2.JUST TYPE THE POSITION NUMBER TO WHICH YOU WANT TO ENTER YOUR SYMBOL");
        System.out.println("                           FOR EXAMPLE:- ");
        System.out.println("                                          |      |    ");
        System.out.println("                                       1  |   2  |  3 ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                       4  |   5  |  6 ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                       7  |   8  |  9 ");
        System.out.println("                                          |      |     ");
        System.out.println("         -> IF I WANT TO ENTER AT POSITION 3 I WILL TAP 3 AS MY INPUT.");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |  *  ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |    ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |     ");
        System.out.println("         -> IF I WANT TO ENTER AT POSITION 5 I WILL TAP 5 AS MY INPUT");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |  *  ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |   O  |    ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |    ");
        System.out.println("                                          |      |     ");
        System.out.println("  \n\n           TAKING TO NEW GAME WINDOW!!!!! ");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }

    void intro() throws FileNotFoundException {
        int choice;
        System.out.println("            				       ************************");
        System.out.println("            				       *WELCOME TO TIC TAC TOE*");
        System.out.println("	            			       ************************");
        System.out.println("  \n		                       MENU");
        System.out.println("     		   	              ******");
        System.out.println("		1.TUTORIAL");
        System.out.println("   		2.NEW GAME");
        System.out.print(" 	 choose the option(1/2) :- ");
        choice=sd.nextInt();
        switch(choice)
        {
            case 1 : tutorial();
            case 2 : System.out.println("				       ************************");
                     System.out.println(" 				       *WELCOME TO TIC TAC TOE*");
                     System.out.println("				       ************************");
                     System.out.println("   \n                                         NEW GAME!!");
                     System.out.println("                                           ************\n\n");
                     details();
                     start();
                     break;
        }
    }

    void details()					//TO GET THE DETAILS OF PLAYERS
    {
        System.out.print("ENTER NAME OF PLAYER 1 :- ");
        p1 = sd.next();
        System.out.print("\nENTER NAME OF PLAYER 2 :- ");
        p2 = sd.next();
        System.out.print("\nENTER YOUR SYMBOL(*/O)  :- ");
        ch=sd.next().charAt(0);

        if(ch=='*')
        {
            System.out.println(" THE SYMBOL OF "+p1+" is " +ch);
            System.out.println(" THE SYMBOL OF "+p2+" is O");
        }
        else
        {
            System.out.println(" THE SYMBOL OF "+p1+" is O");
            System.out.println(" THE SYMBOL OF "+p2+" is *");
        }

    }

    void exit() throws FileNotFoundException                            //TO EXIT THE GAME
    {
        int u=0;
        System.out.println(" PLAYED WELLL!!!!!!!!! THANKS FOR PLAYING......\n");
        System.out.println("************************************************");
        System.out.println("WANT TO PLAY AGAIN (Y/N) :- ");
        check=sd.next().charAt(0);
        if(check=='Y'||check=='y')
        {
            while(u<9)
            {
                pos[u]= ' ';
                u++;
            }
            intro();
        }
        else
        {
            System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
            check=sd.next().charAt(0);
            if(check=='Y'||check=='y')
            {
                execute df=new execute();
                String[] hey=new String[]{"hey"};
                execute.main(hey);
            }
            else
            {
                System.exit(0);
            }
        }
    }

    void test_condition() throws FileNotFoundException                    //WINNING TESTING CONDITION
    {
        if(((( pos[0]==pos[1]&&pos[0]==pos[2]) ||(pos[0]==pos[3]&&pos[0]==pos[6]))|| (pos[0]==pos[4]&&pos[0]==pos[8]))==true)
        {
            if(ch=='*')
            {

                if(pos[0]=='*')
                {
                    System.out.println("          "+p1+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[0]=='O')
                    {
                        System.out.println("          "+p2+" WIN THE GAME...");
                        exit();
                    }
                }
            }
            else
            {
                if(pos[0]=='*')
                {
                    System.out.println("          "+p2+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[0]=='O')
                    {
                        System.out.println("          "+p1+" WIN THE GAME...");
                        exit();
                    }
                }
            }
        }
        else if((((pos[6]==pos[7]&&pos[6]==pos[8]) ||(pos[6]==pos[4]&&pos[6]==pos[2]))|| (pos[6]==pos[3]&&pos[6]==pos[0]))==true)
        {
            if(ch=='*')
            {

                if(pos[6]=='*')
                {
                    System.out.println("          "+p1+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[6]=='O')
                    {
                        System.out.println("          "+p2+" WIN THE GAME...");
                        exit();
                    }
                }
            }
            else
            {
                if(pos[6]=='*')
                {
                    System.out.println("          "+p2+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[6]=='O')
                    {
                        System.out.println("          "+p1+" WIN THE GAME...");
                        exit();
                    }
                }
            }
        }
        else if(((pos[2]==pos[5]&&pos[2]==pos[8]))==true)
        {
            if(ch=='*')
            {
                if(pos[2]=='*')
                {
                    System.out.println("          "+p1+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[2]=='O')
                    {
                        System.out.println("          "+p2+" WIN THE GAME...");
                        exit();
                    }
                }
            }
            else
            {
                if(pos[2]=='*')
                {
                    System.out.println("          "+p2+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[2]=='O')
                    {
                        System.out.println("          "+p1+" WIN THE GAME...");
                        exit();
                    }
                }
            }
        }
        else if(((pos[1]==pos[4]&&pos[1]==pos[7]))==true)
        {
            if(ch=='*')
            {
                if(pos[1]=='*')
                {
                    System.out.println("          "+p1+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[1]=='O')
                    {
                        System.out.println("          "+p2+" WIN THE GAME...");
                        exit();
                    }
                }
            }
            else
            {
                if(pos[1]=='*')
                {
                    System.out.println("          "+p2+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[1]=='O')
                    {
                        System.out.println("          "+p1+" WIN THE GAME...");
                        exit();
                    }
                }
            }
        }
        else if(((pos[3]==pos[4]&&pos[3]==pos[5]))==true)
        {
            if(ch=='*')
            {
                if(pos[3]=='*')
                {
                    System.out.println("          "+p1+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[3]=='O')
                    {
                        System.out.println("          "+p2+" WIN THE GAME...");
                        exit();
                    }
                }
            }
            else
            {
                if(pos[3]=='*')
                {
                    System.out.println("          "+p2+" WIN THE GAME...");
                    exit();
                }
                else
                {
                    if(pos[3]=='O')
                    {
                        System.out.println("          "+p1+" WIN THE GAME...");
                        exit();
                    }
                }
            }
        }
        else
        {
            System.out.println("ITS A DROW NO ONE WINS");
            exit();
        }
    }

    void updation() throws FileNotFoundException                            //TIC TAC TOE TABLE UPDATE AS PER INSTRUCTION
    {
        System.out.println("                                          |      |    ");
        System.out.println("                                      "+pos[0]+"   |  "+pos[1]+"   |  "+pos[2]+"  ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                      "+pos[3]+"   |  "+pos[4]+"   |  "+pos[5]+" ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                      "+pos[6]+"   |  "+pos[7]+"   |  "+pos[8]+"  ");
        System.out.println("                                          |      |     \n\n");
        test_condition();
    }


    void start() throws FileNotFoundException                                //REAL STARTER OF GAME
    {
        int num;
        int i;
        System.out.println("\nTHE MATRIX IS :");
        System.out.println("                                          |      |    ");
        System.out.println("                                       1  |   2  |  3 ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                       4  |   5  |  6 ");
        System.out.println("                                    ______|______|______");
        System.out.println("                                          |      |    ");
        System.out.println("                                       7  |   8  |  9 ");
        System.out.println("                                          |      |     \n\n");
        //if(flag>0)
        //{
        //    System.out.println("\nTHE PREVIOUS STEP UPDATED MATRIX IS :-");
        //    updation();
        //}
        while(true)
        {
            System.out.println("  AVAILABLE SPACES ARE :- ");
            for (i = 0; i < 9; i++) {
                if (pos[i] == ' ') {
                    System.out.print(i + 1 + "  ");
                }
            }
            System.out.println("\n");
            System.out.print(p1 + " ENTER YOUR POSITION NUMBER :- ");
            num = sd.nextInt();
            if (ch == '*')
            {
                pos[num - 1] = '*';
                updation();
                System.out.println("  AVAILABLE SPACES ARE :- ");
                for (i = 0; i < 9; i++) {
                    if (pos[i] == ' ') {
                        System.out.print(i + 1 + "  ");
                    }
                }
                System.out.println("");
                System.out.print(p2 + " ENTER YOUR POSITION NUMBER :- ");
                num = sd.nextInt();
                pos[num - 1] = 'O';
                updation();
            }
            else
            {
                pos[num - 1] = 'O';
                updation();
                System.out.println("  AVAILABLE SPACES ARE :- ");
                for (i = 0; i < 9; i++) {
                    if (pos[i] == ' ') {
                        System.out.print(i + 1 + "  ");
                    }
                }
                System.out.println("\n");
                System.out.print(p2 + " ENTER YOUR POSITION NUMBER :- ");
                num = sd.nextInt();
                pos[num - 1] = '*';
                updation();
            }
        }

       //System.out.println("				       ************************"<;
        //System.out.println(" 				       *WELCOME TO TIC TAC TOE*"<<endl;
        //System.out.println("				       ************************"<<endl<<endl<<endl;
        //System.out.println("                                            NEW GAME!!"<<endl;
        //System.out.println("                                           ************"<<endl<<endl<<endl;


    }
}



