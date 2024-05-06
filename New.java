public class New {
   public static void main(String[] args) {

    gfc(5);

   } 

   public static void gfc(int c) {

       if(c >10) return;

       else {

           ++c;

           gfc(c);

           System.out.println(c);



       }

   }



}