package MockPrep;

import java.util.*;  
public class RomanToInteger1  
{   
	
  public static void main(String args[])   
  {   
	 Scanner sc=new Scanner(System.in);   
	 System.out.println("Enter the Roman"); 
    String romanStr= sc.next();
    int result=convertRomanToInt(romanStr);
    System.out.println("The corresponding Integer value is: "+result);   
  }
  public static int convertRomanToInt(String s1)   
  {   
    int total = 0;   
    for (int i=0; i<s1.length(); i++)   
    {   
      int a1 = value(s1.charAt(i));   
      if (i+1 <s1.length())   
      {   
        int a2 = value(s1.charAt(i+1));      
        if (a1 >= a2)   
        {    
          total = total + a1;   
        }   
        else  
        {   
          total = total - a1;   
        }   
      }   
      else  
      {   
        total = total + a1;   
      }   
    }    
    return total;   
  } 
  public static int value(char R)   
  {   
    if (R == 'I')   
      return 1;   
    if (R == 'V')   
      return 5;   
    if (R == 'X')   
      return 10;   
    if (R == 'L')   
      return 50;   
    if (R == 'C')   
      return 100;   
    if (R == 'D')   
      return 500;   
    if (R == 'M')   
      return 1000; 
    
    return -1;   
  }
     
}  