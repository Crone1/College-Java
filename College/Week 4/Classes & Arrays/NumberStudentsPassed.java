public class NumberStudentsPassed
{
   public static int numberPasses(Student [] student)

   {
      int counter = 0;
      for(int i = 0; i < student.length; i++)
      {
            if (student[i].getMark() >= 40)
            {
                counter++;
            }
      }
    return counter;      
   }
}
