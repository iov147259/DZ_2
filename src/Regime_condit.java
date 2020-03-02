import java.util.Scanner;
public class Regime_condit {
    public static void  regime_control(){
        System.out.println("введите '1' для включения горячего режима либо  '0' для включения холодного режима ");
        Scanner input = new Scanner (System.in);
        int regime =input.nextInt();
        String condition_regime="включен холодный режим";
        if (regime==0) { condition_regime="включен холодный режим";}
        if(regime==1) { condition_regime="включен горячий режим";}
        if(regime!=0 & regime!=1) {
            System.out.println("некоректный ввод ");}
        System.out.println(condition_regime);
    }
}
