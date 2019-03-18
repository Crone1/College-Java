public class FindBestStudent
{
   public static Student getBestStudent(Student [] student)
   {
      Student best = student[0];
      for(int i = 1; i < student.length; i++)
      {
            if (student[i].getMark() > best.getMark())
            {
                best = student[i];
            }
      }
      return best;      
   }
}
