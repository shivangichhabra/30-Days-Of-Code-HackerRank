import java.util.Scanner;

/*
Objective
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3

Sample Output 0
Weird

Sample Input 1
24

Sample Output 1
Not Weird

 */
public class Day3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        if(n%2==1){
            ans = "Weird";
        }
        else{
            if(1 < n && n < 6)
            {
                ans = "Not Weird";
            }
            else if(6<= n && n <= 20)
            {
                ans = "Weird";
            }
            else if(n > 20)
            {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}

