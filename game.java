
import java.util.Random;
import java.util.Scanner;

class game
{
    int computer;
    public game()
    {
      Random rand = new Random();
      computer = rand.nextInt(100);
      System.out.println("Guess the number form 1 to 100");
    }
    public int computerNo() 
    {return computer;}
    

}class task
{
static int takeuserinput()
{
    int user;
    System.out.println("enter ");
    Scanner sc = new Scanner(System.in);
    user=sc.nextInt();
    return user;
}
static void isCorrectNumber(int i, int j){
    if(i==j){
        System.out.println("correct number guess");

    }
    else if(i>j){
        System.out.println("your number is big than computer number");

    }
    else{
        System.out.println("your number is small than computer number");
    }

    }
    public static void main(String[] args) {
        int user=0, computer=0, itteration=0;
        game g = new game();
        do{
            user = takeuserinput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            itteration++;

        }
        while(user!=computer);
        System.out.println("you guess no in "+  itteration+"  itterations");



    }
}
