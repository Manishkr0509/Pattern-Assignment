import java.util.Scanner;

class Guesser
{
    int guessnum;
    int guessingnumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser : Enter Number");
        guessnum=sc.nextInt();
    
        return guessnum;
    }
}


class Player
{
    int guessnum;
    int guessingnumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player : Enter Number");
        guessnum=sc.nextInt();
    
        return guessnum;
    }
}

class Umpire
{
    int numOfGuesser;
    int numOfPlayer1;
    int numOfPlayer2;
    int numOfPlayer3;
    void umpireGuessingNumber()
    {
        Guesser g=new Guesser();
        numOfGuesser=g.guessingnumber();
        System.out.println("Guesser number "+numOfGuesser);
    }

    void umpirePlayerNumber(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numOfPlayer1=p1.guessingnumber();
        numOfPlayer2=p2.guessingnumber();
        numOfPlayer3=p3.guessingnumber();
        System.out.println("Player-1 Number "+numOfPlayer1);
        System.out.println("Player-2 Number "+numOfPlayer2);
        System.out.println("Player-3 Number "+numOfPlayer3);
    }

    void compare()
    {
        if(numOfGuesser==numOfPlayer1)
        {
            System.out.println("Player1 won and may be player2 and player3");
        }
        else if (numOfGuesser==numOfPlayer2) 
        {
            System.out.println("player 2 won and may be player 3 also but not player 1");
        }
        else if(numOfGuesser==numOfPlayer3)
        {
            System.out.println("only player3 won");
        }
        else{
            System.out.println("no one wins");
        }
    }
}

class LaunchGame 
{
    public static void main(String[] args) 
    {
       Umpire u=new Umpire();
       u.umpireGuessingNumber();
       u.umpirePlayerNumber();
       u.compare();
    }
}
