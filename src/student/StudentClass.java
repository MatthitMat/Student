package student;
/**
 * @author Matthew Cardona at ZenOfProgramming.com
 */
public class StudentClass
{
   /*
   Jan 22
   Matt Cardona
   */
   private String studentId;
   private String studentName;
   private String address;

   public StudentClass (String studentId, String studentName)
   {
      this.studentId = studentId;
      this.studentName = studentName;
   }

   public void setAddress (String address)
   {
      this.address = address;
   }

   public String getAddress ()
   {
      return address;
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
