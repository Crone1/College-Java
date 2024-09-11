public class AvgOfPassingStudents
{
   public static double getPassingAverage(Student [] student)

   {
      double counter = 0;
      double total = 0;
      for(int i = 0; i < student.length; i++)
      {
            if (student[i].getMark() >= 40)
            {
                counter++;
                total += student[i].getMark();
            }
      }
    return total/counter;      
   }
}
