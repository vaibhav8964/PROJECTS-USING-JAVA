import java.util.Scanner;
public class library_system
{
    Scanner sc = new Scanner(System.in);
    String [] books=new String [10];
    String []issued_books=new String [10];
    String book="";
    int isbn_no[]=new int[10];
    int issued_isbn[]=new int[10];
    int h=0, input,isbn;

    int intro()                          //the introduction window of user sees
    {
        System.out.println("                                WELCOME TO LIBRARY");
        System.out.println("                               ********************");
        System.out.println("                                        DEVELOP BY VAIBHAV");
        System.out.println("                                       ********************");
        System.out.println("                        MENU");
        System.out.println("                       ------ ");
        System.out.println("                    1.ADD BOOKS");
        System.out.println("                    2.SHOW AVAILABLE BOOKS");
        System.out.println("                    3.ISSUE BOOKS");
        System.out.println("                    4.RETURN BOOKS");
        System.out.println("                    5.SHOW ISSUED BOOK");
        System.out.println("                    -> PRESS ANY OTHER KEY TO RETURN\n");
        System.out.print("        ENTER YOUR OPTION(1/2/3/4/5) :- ");
        input = sc.nextInt();
        return input;

    }
    void available_book()                   //shows the available book in library
    {
        System.out.println("                                AVAILABLE BOOK SECTION");
        System.out.println("                               ************************");
        for (int i = 0; i < 10; i++)
        {
            if(books[i]==null || isbn_no[i]==0)
            {
                continue;
            }
            System.out.println("ISBN             TITLE  ");
            System.out.println(isbn_no[i] +"             " +books[i]);
        }
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }
    void add_book()                         // if user want to enter the book in library
    {
        System.out.println("                                ADD BOOK SECTION");
        System.out.println("                               ********************");
        System.out.println("ENTER THE ISBN NUMBER OF BOOK YOU WANT TO ADD:- ");
        isbn=sc.nextInt();
        this.isbn_no[h]=isbn;
        System.out.println("ENTER THE NAME OF BOOK YOU WANT TO ISSUE:- ");
        book=sc.next();
        this.books[h]=book;
        h++;
        System.out.println("YOUR BOOK HAS BEEN ADDED TO LIBRARY");
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {        }
    }
    void issue_book()                   //to issue book from library
    {
        int k=0;
        System.out.println("                                ISSUE BOOK SECTION");
        System.out.println("                               ********************");
        System.out.println("THESE ARE THE BOOKS AVAILABLE :-");
        for (int i = 0; i < 10; i++)
        {
            if(books[i]==null || isbn_no[i]==0)
            {
                continue;
            }
            System.out.println("ISBN             TITLE  ");
            System.out.println(isbn_no[i] +"             " +books[i]);
        }
        System.out.println("ENTER THE ISBN NUMBER OF BOOK YOU WANT TO ISSUE:- ");
        isbn=sc.nextInt();
        for (int i = 0; i < 10; i++)
        {
            if(isbn==isbn_no[i])
            {
                isbn_no[i]=0;
                issued_books[k]=books[i];
                books[i]=null;
                issued_isbn[k]=isbn;
                k++;
            }
        }
        System.out.println("THANK YOU TO ISSUE BOOK ...!!! ");
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {        }
    }
    void return_book()                          //to return book to the library
    {
        System.out.println("                                ISSUE BOOK SECTION");
        System.out.println("                               ********************");
        System.out.println("ENTER THE ISBN OF BOOK YOU WANT TO RETURN:- ");
        isbn=sc.nextInt();
        isbn_no[h]=isbn;
        System.out.println("ENTER THE NAME OF BOOK YOU WANT TO RETURN:- ");
        book=sc.next();
        books[h]=book;
        h++;
        for (int i = 0; i < 10; i++)
        {
            if(isbn==issued_isbn[i])
            {
                issued_books[i]=null;
                issued_isbn[i]=0;
            }
        }
        System.out.println("YOUR BOOK HAS BEEN RETURNED..!! THANK YOU TO RETURN IT!!");
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {        }
    }
    void see_issued_book()                  //to see the issued book list
    {
        System.out.println("                                SHOW ISSUE BOOK SECTION");
        System.out.println("                               *************************");
        for (int i = 0; i < 10; i++)
        {
            if(issued_books[i]==null || issued_isbn[i]==0)
            {
                continue;
            }
            System.out.println("ISBN             TITLE  ");
            System.out.println(issued_isbn[i] +"             " +issued_books[i]);
        }
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {        }
    }
}
class start                 //to run the main function
{
    public static void main(String[]args)
    {
        int b=0;
        int choice;
        library_system central=new library_system();
        do
        {
            choice= central.intro();
            switch (choice)
            {
                case 1 : central.add_book();
                         b++;
                         break;
                case 2 : central.available_book();
                         b++;
                         break;
                case 3 : central.issue_book();
                         b++;
                         break;
                case 4 : central.return_book();
                         b++;
                         break;
                case 5 : central.see_issued_book();
                         b++;
                         break;
                default: System.out.println(" EXITING FROM LIBRARY!!! VISIT AGAIN!!");
                         System.exit(0);
            }
        }while(b<10);
    }
}

