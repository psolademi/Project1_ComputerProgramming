import java.util.*;
import java.text.*;
public class Ass02CrapsGame {
    public static void main(String[] args) {
        //For dice1 value
        int dice1 = 0;
        //For dice2 value
        int dice2 = 0;
        //For sum of two dice
        int score=0;
        //For new score
        int newscore = 0;
        //For point value
        int point = 0;
        //No of wins
        int wins = 0;
        //No of loss
        int loss = 0;
        //For choice
        char ch;
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        do
        {
            // Print the rolling dice 1
            System.out.println ("Rolling the Dice 1");
            dice1=rnd.nextInt(6)+1;
            System.out.println("Dice1: "+dice1);
            System.out.println ("Rolling the Dice 2");
            dice2=rnd.nextInt(6)+1;
            System.out.println("Dice2: "+dice2);
            score=dice1+dice2;
            System.out.println("Sum of two dices: "+score);
            if(score==2||score==3||score==12)
            {
                System.out.println ("Crapped Out!");
                System.out.println ("You Lose!");
                loss++;
            }
            else if(score==7 || score==11)
            {
                System.out.println ("Natural!");
                System.out.println ("You Win!");
                wins++;
            }
            else
            {
                point=score;
                System.out.println("Point: "+point);
                do
                {
                    System.out.println ("\tRolling the Dice 1");
                    dice1=rnd.nextInt(6)+1;
                    System.out.println("\tDice1: "+dice1);
                    System.out.println ("\tRolling the Dice 2");
                    dice2=rnd.nextInt(6)+1;
                    System.out.println("\tDice2: "+dice2);
                    newscore=dice1+dice2;
                    System.out.println("\tSum of two dices: "+newscore);

                    if(newscore==point)
                    {
                        System.out.println ("\nNatural!");
                        System.out.println ("You Win!");
                        wins++;

                    }
                    else if(newscore==7)
                    {
                        System.out.println ("\nCrapped Out!");
                        System.out.println ("You Lose!");
                        loss++;

                    }

                }
                while(newscore!=point && newscore!=7);
            }
            System.out.print("Do you want to continue to play (y for Yes/n for No): ");
            ch=sc.next().toLowerCase().charAt(0);
        }
        while(ch!='n');

        // Print the No of Wins
        System.out.println("No of Wins: "+wins);
        // Print the No of loss
        System.out.println("No of Loss: "+loss);
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Probability of winning game: "+df.format((double)wins/(wins+loss)));

    }
}