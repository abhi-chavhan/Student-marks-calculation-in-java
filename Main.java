public class Main {
 
    public static void main(String args[]) {
        String employeename = "James";
 
        int maths = 90;
        int english = 80;
        int science = 68;
 
        int tot = maths + english + science;
 
        double avg = tot/3;
 
        if(avg <= 100  && avg > 80)
        {
            System.out.println("Distintion");
        }
        else if(avg <= 80  && avg > 70)
        {
            System.out.println("Credit");
        }
        else if(avg <= 70  && avg > 60)
        {
            System.out.println("Simple Pass");
        }
        else if(avg <= 60  && avg > 0)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid Average");
        }
 
    }
 
}
