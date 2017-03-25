    import java.util.Scanner;

public class hangman
{

    public hangman()
    {

    }

   

    public static void ampleMethod()
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word = scan.next();
        String [] gueses=new String[10];
        System.out.println("Enter a guess");
        String guess = scan.next();
        int y=0;
        int c=1;
        int x=0;
        int counter=0;
        int l = word.length(); 
        String str[]= word.split("");
        for( int i=0; i <10;i++)
        {
            for( int f=0; f < l; f++)
            {

                if(str[f].equals(guess))
                {
                    x++;
                    counter++;
                    System.out.println("letter found at");
                    System.out.println(word.indexOf(guess));
                    gueses[i]=guess;

                }
                
                if(str[f].equals(word))
                {

                    System.out.println("Correct you found the letter!");
                    

                }

            }

            if(x==0)
            {
                System.out.println(" incorrect");
                counter++;

                gueses[i]=guess;

            }
            System.out.println("enter another guess");
            guess = scan.next();
            x=0;
        }

        for(int v=0;v<counter;v++)
        {
            System.out.println("Your guesses are:");
            System.out.println(gueses[v]);
        }
    }
}

