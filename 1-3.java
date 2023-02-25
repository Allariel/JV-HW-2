/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;


class Result
{
    public Integer simple_num(int[] array)
    {
     int sum=0;
     for (int i = 0; i < array.length ; i++)
		{
		    int flag = 1;
		    if(array[i]==2)
		    {
		        flag=0;
		        continue;
		    }
		    for (int j = 2; j < array[i] ; j++)
		    {
		        if((array[i] % j) == 0)
		        {
		            flag = 0;
		        }
		    }
		    if(flag==1)
		    {
		        sum += array[i];
		    }
		}
	return sum;
    }
    
    public String grown(int[] array)
    {
        
        for (int i = 0; i < array.length-1 ; i++)
        {
            if(array[i]>=array[i+1])
            {
               return "Последовательность не возрастает"; 
            }
        }
        return "Последовательность возрастает";
    }
    
    public int[] change_num(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length ; i++)
        {
            if(array[i]>9 || array[i]<-9)
            {
               sum+=i;
            }
        }
        for (int i = 0; i < array.length ; i++)
        {
            if(array[i]<0)
            {
               array[i]=sum;
            }
        }
        
        return array;
    }
}





public class Main
{
	public static void main(String[] args) {
	    Result sol = new Result();
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("N");
        int N = keyboard.nextInt();
		int[] myArray;
		myArray = new int[N];
		for (int i = 0; i < N ; i++)
		{
           myArray[i] = keyboard.nextInt();
        }
        int res = sol.simple_num(myArray);
        System.out.println("Cумма простых чисел " + res);
        String grown = sol.grown(myArray);
        System.out.println(grown);
        int [] new_array = sol.change_num(myArray);
        System.out.println(Arrays.toString(new_array));
	}
}
