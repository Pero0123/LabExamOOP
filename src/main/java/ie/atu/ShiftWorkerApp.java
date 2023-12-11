package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShiftWorkerApp {
    public static void main(String[] args) {
       ShiftWorkerClass worker1 = new ShiftWorkerClass("Pero Schwitalla", "Man", 2, 20);

       System.out.println("Worker 1 Details: ");
       System.out.println("Name: "+worker1.getName());
       System.out.println("Gender "+ worker1.getGender());
       if(worker1.getShift()==1) {
           System.out.println("Shift: Day");
       }
       else{
           System.out.println("Shift: Night");
       }
       System.out.println("Age: " + worker1.getAge()+"\n\n");

        ShiftWorkerClass worker2 = new ShiftWorkerClass("Lisa Mchugh", "jj", 1, 20);

        System.out.println("Worker 2 Details: ");
        System.out.println("Name: "+worker2.getName());
        System.out.println("Gender "+ worker2.getGender());
        if(worker1.getShift()==1) {
            System.out.println("Shift: Day");
        }
        else{
            System.out.println("Shift: Night");
        }
        System.out.println("Age: " + worker2.getAge()+"\n\n");

        ShiftWorkerClass worker3 = new ShiftWorkerClass("Lisa Mchugh", "Woman", 1, 16);

        System.out.println("Worker 3 Details: ");
        System.out.println("Name: "+worker3.getName());
        System.out.println("Gender "+ worker3.getGender());
        if(worker1.getShift()==1) {
            System.out.println("Shift: Day");
        }
        else{
            System.out.println("Shift: Night");
        }
        System.out.println("Age: " + worker3.getAge()+"\n\n");

        }


}