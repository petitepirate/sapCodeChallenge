import java.io.*;
import java.util.*;
public class Main
{
    static boolean checkFav(long n)
    {
        int len=0;
        long temp=n;
        while(temp!=0)//to find the digits in the number
        {
            len++;
            temp=temp/10;
        }
      
      
        int firstarr[]=new int[len];//will store the digits of the number entered
        int secondarr[]=new int[len];//will store the sorted digits of the number in ascending order
      
        for(int i=len-1;i>=0;i--)
        {
            int digit=(int)n%10;//the last digit
            firstarr[i]=digit;
            secondarr[i]=digit;
            n=n/10;//removing the last digit
          
        }
        Arrays.sort(secondarr);//sorted array
      
        boolean equalCheck = true;//checks if both arrays are same
       
        if(firstarr.length == secondarr.length)
        {
            for (int i = 0; i < firstarr.length; i++)
            {
                if(firstarr[i] != secondarr[i])
                {
                    equalCheck = false;
                }
            }
        }
        else
        {
            equalCheck = false;
        }
      
        for(int i=0;i<len-1;i++)// to check no two numbers are same
        {
            if(secondarr[i]==secondarr[i+1])
            {
                equalCheck=false;
            }
        }
       
        if (equalCheck)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void findFav(long n)
    {

        if(checkFav(n)==true)
        System.out.println("Mona likes the number:"+n);
        else
        findFav(n-1);//recursive call till we find favorite number
      
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,favNum;
        System.out.println("Enter the number");
        n=sc.nextLong();
        if(checkFav(n)==true)
        {
            favNum=n;
            System.out.println("Mona likes the number:"+favNum);
        }
        else
        findFav(n);
      
   }
}
