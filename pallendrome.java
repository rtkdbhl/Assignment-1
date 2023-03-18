import java.util.Scanner;
class pallendrome{
    public static void main(String[] args){
        int n, r, m = 0, temp;
        System.out.println("Enter any number\n");
        Scanner ref=new Scanner(System.in); 
        n=ref.nextInt();
        temp = n;
        while(n>0)
        {
        r = n % 10;
        n = n/10;
        m = (m * 10) + r;
        }
        if(temp == m)
        {
            System.out.println("This number is pallendrome");
        }
        else
        {
            System.out.println("This number is not pallendrome\n");
        }
        return ;
    }
}