package student;

/**
 *
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Student
{
   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      char[] myWord = new char[7];
      myWord[0] = 's';
      myWord[1] = 't';
      myWord[2] = 'u';
      myWord[3] = 'd';
      myWord[4] = 'e';
      myWord[5] = 'n';
      myWord[6] = 't';

      for (int i = 0; i < myWord.length; i++) {
         System.out.print(myWord[i]);
      }
      System.out.println();
      for (int i = myWord.length - 1; i >= 0; i--) {
         System.out.print(myWord[i]);
      }
      System.out.println();
   }
}
