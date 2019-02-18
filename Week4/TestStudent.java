public class TestStudent{
    public static void printHonours(Student [] student){
        for(int i=0;i<student.length;i++){
            if(student[i].getMark() >= 55){
                System.out.print(student[i].getMark());
                System.out.print(" (");
                System.out.print(student[i].getName());
                System.out.println(")");
            }
        }
    }
    public static void printForties(Student [] student){
        for(int i=0;i<student.length;i++){
            if(student[i].getMark() >= 40 && student[i].getMark() <= 49){
                System.out.print(student[i].getMark());
                System.out.print(" (");
                System.out.print(student[i].getName());
                System.out.println(")");
            }
        } 
    }

    public static int numberPassed(Student [] student){
        int numPassed = 0;
        for(int i=0;i<student.length;i++){
            if(student[i].getMark()>=40){
                numPassed = numPassed + 1;
            }
        }
        return numPassed;
    }

    public static Student getBestStudent(Student [] student){
        Student bestStudent = student[0];
        int best = 0;
        for(int i=1;i<student.length;i++){
            if(student[i].getMark()>student[best].getMark()){
                best = i;
            }
        }
        bestStudent = student[best];
        return bestStudent;
    }

    public static double getPassingAverage(Student [] student){
        double total = 0;
        double number = 0;
        for(int i=0;i<student.length;i++){
            if(student[i].getMark()>=40){
                total = total + student[i].getMark();
                number++;
            }
        }
        double average = total / number;
        return average;
    }
}
