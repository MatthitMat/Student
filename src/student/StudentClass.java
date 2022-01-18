package student;
/**
 * @author Matthew Cardona at ZenOfProgramming.com
 */
public class StudentClass
{
   private String studentId;
   private String studentName;

   public StudentClass (String studentId, String studentName)
   {
      this.studentId = studentId;
      this.studentName = studentName;
   }

   public String getStudentId ()
   {
      return studentId;
   }

   public String getStudentName ()
   {
      return studentName;
   }

   public void setStudentId (String studentId)
   {
      this.studentId = studentId;
   }

   public void setStudentName (String studentName)
   {
      this.studentName = studentName;
   }


}
