import java.io.FileNotFoundException;
import java.util.Scanner;

public class execute {
    public static void main(String[] args) throws FileNotFoundException {
        char replay = ' ';
        int flag = 0;
        do {
            char check;
            Scanner sd = new Scanner(System.in);
            int choice;
            char b;
            System.out.println("                               *****************************************");
            System.out.println("                               * WELCOME TO THE WORLD OF GAME LIBRARY *");
            System.out.println("                               *****************************************");
            System.out.println("                                        DEVELOP BY:- 1.VAIBHAV KUMAR TIWARI");
            System.out.println("                                                     2.SANIDHYA");
            System.out.println("                                                     3.RUPINDER");
            System.out.println("                                                     4.TRIVENI");
            System.out.println("                  IT IS A WORLD WHERE MULTIPLE GAME ARE UNDER ONE ROOF!!!!! ");
            System.out.println(" \n\n                 PLEASE SELECT THE GAME YOU WANT TO PLAY ");
            System.out.println("                        MENU");
            System.out.println("                       ------ ");
            System.out.println("                    1.GUESS THE NUMBER ");
            System.out.println("                    2.ROCK PAPER SCISSOR");
            System.out.println("                    3.TIC TAC TOE");
            System.out.println("                    4.HANGMAN");
            System.out.println("                    5.SNAKE WATER GUN");
            System.out.println("                    6.SNAKE GAME");
            System.out.println("                    7.LUDO");
            System.out.println("                    8.EXIT");
            System.out.print("        ENTER YOUR OPTION :- ");
            int input = sd.nextInt();
            switch (input) {
                case 1:
                    guess_the_number gs = new guess_the_number();
                    choice = gs.intro();
                    switch (choice) {
                        case 1:
                            gs.tutorial();
                        case 2:
                            gs.user_input();
                            gs.condition();
                            do {
                                gs.recall();
                                gs.condition();
                            } while (!(gs.user_inp == gs.comp_inp));
                            System.out.println("YOU TAKE " + gs.guess + " CHANCES TO GUESS CORRECTLY. ");
                    }
                    System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                    check = sd.next().charAt(0);
                    if (check == 'y' || check == 'Y') {
                        flag++;
                    } else {
                        flag = 0;
                    }
                    break;

                case 2:
                    rock_paper_scissor gm = new rock_paper_scissor();
                    choice = gm.intro();
                    switch (choice) {
                        case 1:
                            gm.tutorial();
                        case 2:
                            do {
                                gm.random_no();
                                gm.userinput();
                                gm.condition();
                                System.out.print("WANT TO PLAY ONCE MORE: -");
                                b = sd.next().charAt(0);
                            } while (b == 'y' || b == 'Y');
                    }
                    System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                    check = sd.next().charAt(0);
                    if (check == 'y' || check == 'Y') {
                        flag++;
                    } else {
                        flag = 0;
                    }
                    break;
                case 3:
                    Tic_Tac_Toe gh = new Tic_Tac_Toe();
                    gh.intro();
                    break;
                case 4:
                    Hangman_game gk = new Hangman_game();
                    choice = gk.intro();
                    switch (choice)
                    {
                        case 1:
                            gk.tutorial();
                        case 2:
                            try {
                                gk.CHALO();
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                        check = sd.next().charAt(0);
                        if (check == 'y' || check == 'Y')
                        {
                                flag++;
                        }
                        else
                        {
                                flag = 0;
                        }
                        break;
                case 5:
                    snake_water_gun gj = new snake_water_gun();
                    choice = gj.intro();
                    switch (choice) {
                        case 1:
                                    gj.tutorial();
                        case 2:
                                    do {
                                        gj.random_no();
                                        gj.userinput();
                                        gj.condition();
                                        System.out.print("WANT TO PLAY ONCE MORE: -");
                                        b = sd.next().charAt(0);
                                    } while (b == 'y' || b == 'Y');
                            }
                            System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                            check = sd.next().charAt(0);
                            if (check == 'y' || check == 'Y')
                            {
                                flag++;
                            }
                            else
                            {
                                flag = 0;
                            }
                            break;
                        case 6:
                            snake_game gv = new snake_game();
                            choice = gv.New();
                            switch (choice) {
                                case 1:
                                    gv.tut();
                                case 2:
                                    gv.new_game();
                            }
                            System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                            check = sd.next().charAt(0);
                            if (check == 'y' || check == 'Y') {
                                flag++;
                            } else {
                                flag = 0;
                            }
                            break;
                        case 7:
                            GameScreen gd = new GameScreen();
                            choice = gd.New();
                            switch (choice) {
                                case 1:
                                    gd.tut();
                                case 2:
                                    gd.initial();
                            }
                            System.out.print("WANT TO PLAY OTHER GAME(Y/N): -");
                            check = sd.next().charAt(0);
                            if (check == 'y' || check == 'Y')
                            {
                                flag++;
                            }
                            else
                            {
                                flag = 0;
                            }
                            break;
                        default:
                            System.out.println("THANKS FOR VISITING US!!!!");
                            System.out.println("\n               EXITING!!!!");
                            System.exit(0);
                    }
                    if (flag > 0) {
                        replay = 'y';
                    } else {
                        replay = 'n';
                    }


        } while (replay == 'y' || replay == 'Y');
    }
}



