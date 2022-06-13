// Problem: Given an input string, return an output string such that all the lower case characters should be sorted. 
// Indices of non-lower case characters should remain the same as in the original input string.

// Eg. Input -> 'Test@123 Google'
// Output -> 'Teeg@123 Gloost'



import java.util.Collections;
import java.util.Vector;
class Codechef{
public static String sortLowerCaseCharacter(StringBuilder str)
{
    Vector<Character> lowercaseCharacter = new Vector<>();
    for(int i = 0; i < str.length(); i++)
    {
        if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            lowercaseCharacter.add(str.charAt(i));
    }
    Collections.sort(lowercaseCharacter);
    int i = 0;
    for(int k = 0; k < str.length(); k++)
    {
        if (str.charAt(k) >='a' && str.charAt(k) <= 'z')
        {
            str.setCharAt(k, lowercaseCharacter.elementAt(i));
            ++i;
        }
    }
    return str.toString();
}
  public static void main(String[] args)
  {
      StringBuilder str = new StringBuilder("Test@123 Google");
      System.out.println(sortLowerCaseCharacter(str));
  }
}
