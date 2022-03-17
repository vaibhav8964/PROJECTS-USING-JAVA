import javax.swing.JFrame;
import java.awt.Color;
import java.util.Scanner;

public class snake_game {
     int New()
    {
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("                                WELCOME TO SNAKE GAME");
        System.out.println("                               ***********************");
        System.out.println("                        MENU");
        System.out.println("                       ------ ");
        System.out.println("                    1. TUTORIAL");
        System.out.println("                    2. NEW GAME\n");
        System.out.print("        ENTER YOUR OPTION(1/2) :- ");
        input = sc.nextInt();
        return input;
    }
    void tut()
    {
        System.out.println("\n                                        HOW TO PLAY");
        System.out.println("                                       *************");
        System.out.println("                   -> USE THE FOUR ARROW KEYS TO MOVE THE SNAKE UP, DOWN, RIGHT, LEFT RESP.");
        System.out.println("                   -> EAT THE ENEMY BALLS TO GET BIGGER AND SCORE MORE");
        System.out.println("                   -> TRY NOT TO TOUCH YOURSELF OTHERWISE YOU WILL GET OUT");
                System.out.println("             TAKING TO NEW GAME WINDOW ");
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }
    public  void new_game()
    {
        JFrame jframe = new JFrame();
        Gameplay gameplay=new Gameplay();
        jframe.setBounds(10,10,905,700);
        jframe.setTitle("SNAKE GAME");
        jframe.setBackground(Color.DARK_GRAY);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jframe.add(gameplay);

    }
}