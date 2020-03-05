import java.util.Scanner;

public class Condit  {

   static public  boolean power = false;
    static public  boolean work = false;
   static public  boolean hot_regime = false;

   public static void change_power(){
       if (power= false){
       power=true;
       System.out.println(" питание включено ");
       }
       if (power=true){
           if(work= true){
               work= false;
               System.out.println("работа кондиционера прекращена ");}
           power=false;
           System.out.println(" питание выключено ");
       }

   }

    public static void change_regime() {
        if (power = true) {
            if (hot_regime = true) {
                hot_regime = false;
                System.out.println("включен холодный режим ");
            }
            else {
                hot_regime = true;
                System.out.println("включен горячий  режим ");

            }
        }
       else{
                System.out.println("для изменения режима необходимо включить питание ");
            }
        }
    public static void change_work() {
       if (power=true) {
           if (work = false) {
               work = true;
               System.out.println("кондиционер будет работать 1 минуту");
           } else {
               System.out.println("работа кондиционера продлена еще на минуту ");
           }
       }
           else {
           System.out.println("для начала работы кондиционера необходимо подключить питание ");
           }
    }





}
