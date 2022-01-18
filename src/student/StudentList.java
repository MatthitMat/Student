package student;
/**
 * @author Matthew Cardona at ZenOfProgramming.com
 */
public class StudentList
{
   public static void main (String[] args)
   {
      StudentClass[] studentList = new StudentClass[3];
      studentList[0] = new StudentClass("s1", " Matt Card");
      studentList[1] = new StudentClass("s2", " Jatt Lard");
      studentList[2] = new StudentClass("s3", " Katt Dard");

      for (int i = 0; i < studentList.length; i++) {
         System.out.println(studentList[i].getStudentId() + studentList[i].getStudentName());
      }
   }
}
