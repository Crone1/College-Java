public class printStudentsArray
{
   public static void printName(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].name);
   }
   
   public static void printStudent(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark + " (" + student[i].name + ")");
   }
  
   public static void printMark(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].mark);
   }

}
