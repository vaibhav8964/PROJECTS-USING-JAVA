

import javax.swing.JFrame;
import java.util.Scanner;

public class GameScreen {
	int New()
	{
		int input;
		Scanner sc=new Scanner(System.in);
		System.out.println("                                WELCOME TO LUDO GAME");
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
		System.out.println("                   -> PRESS THE ENTER KEY TO START PLAY GAME");
		System.out.println("                   -> AS PER YOUR USER CHANCE CLICK WITH MOUSE ON THE SELECTED COLOUR KEYS TO MOVE YOUR PAWN");
		System.out.println("                   -> RULES:- 1.THREE 6 MEANS NO MOVEMENT AND IF MOVED THAN GO BACK. ");
		System.out.println("                   			  2.KEYS OPEN WITH 6 ONLY. AND GETS CAUGHT WHEN ANOTHER COLOUR PLAYER OVERLAPS YOUR KEYS. ");
		System.out.println("             				  3. REST IS CONVENTIONAL RULES FOLLOWED IN YOUR REGION.. ");
		System.out.println("			 TAKING YOU TO NEW WINDOW.");
		try
		{
			Thread.sleep(10000);
		}
		catch (Exception e)
		{        }
	}
	   public  void initial()
		{
	        JFrame jframe = new JFrame();
	        jframe.setBounds(10,10,1000,600);
	        jframe.setTitle("LUDO");
	        jframe.setResizable(false);
	        jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        GameMoves gm = new GameMoves();
	        gm.setFocusable(true);
	        gm.addKeyListener(gm);
	        gm.addMouseListener(gm);
	        jframe.add(gm);
	        jframe.setVisible(true);
	   }
}
