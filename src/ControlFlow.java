public class ControlFlow {
     public static void main(String[] args){
         int age = 14;
         if (age > 18){
             System.out.println("welcome to our bank");
         }else{
             System.out.println("try again when you trun 18");

         }
         int marks = 65;
         if(marks > 90){
             System.out.println("Grade A+");
         }else if (marks>75){
             System.out.println("Grade A");
         }else if(marks >60){
             System.out.println("Grade B+");
         }else{
             System.out.println("Grade D");
         }
         //switch
         String day = "tuesday";
         switch (day){
             case "monday"->System.out.println("start of the week ");
             case "firday"->System.out.println("last day of the week");
             default ->System.out.println("enjoy weekend");
         }
     }

}
