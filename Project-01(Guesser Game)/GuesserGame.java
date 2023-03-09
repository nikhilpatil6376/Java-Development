import java.util.Scanner;

class Player
{
    int numGuess;
    public void guessNum() 
    {
        System.out.println("Hey,Player Guess the numbetr");
        Scanner sc=new Scanner(System.in);
        numGuess=sc.nextInt();
    }
   

}

class Guesser
{
    int numGuess;
    public void guessNum() 
    {
        System.out.println("Hey,Guesser guess the number");
        Scanner sc=new Scanner(System.in);
        numGuess=sc.nextInt();
    }

}

class Umpire
{
    Guesser guesser;
    Player p1;
    Player p2;
    Player p3;
    
    public void getNumFromGuesser()
    {
        guesser=new Guesser();
        guesser.guessNum();

    }

    public void collectNumFromPlayer()
    {
        p1=new Player();
        p2=new Player();
        p3=new Player();

       p1.guessNum();
       p2.guessNum();
       p3.guessNum();


    }

    public void declareResult()
    {
        if(guesser.numGuess==p1.numGuess)
        {
            if(guesser.numGuess==p2.numGuess && guesser.numGuess==p3.numGuess)
            {
                System.out.println("All Player are WINNER");
            }
            else if(guesser.numGuess==p2.numGuess)
            {
                System.out.println("Player1 and Player 2 are WINNER");
            }
            else if(guesser.numGuess==p3.numGuess)
            {
                System.out.println("Player 1 and Player 3 are WINNER");
            }
            else
            {
                System.out.println("Player 1 is WINNER");
            }
        }
        else if(guesser.numGuess==p2.numGuess)
        {
            if(guesser.numGuess==p3.numGuess)
            {
                System.out.println("Player 2 and Player 3 are WINNER");
            }
            else
            {
                System.out.println("Player 2 is WINNER");
            }
            
        }
        else if(guesser.numGuess==p3.numGuess)
        {
           
            System.out.println("Player 3 is WINNER");
        }
        else
        {
            System.out.println("All are looser, try aggain");
        }
    }

}

public class GuesserGame
{
    public static void main(String [] args)
    {
        Umpire umpire=new Umpire();
        umpire.getNumFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.declareResult();

    }
}