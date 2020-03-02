import java.util.Scanner;
public class Power_condit {
   public  static void  power_control(){
       System.out.println("введите '1' для включения питания либо '0' для его отключения");
Scanner input = new Scanner (System.in);
int power =input.nextInt();

    if (power==0) { String condition_power="питание отключено";
        System.out.println(condition_power);
       Condit.power =0;
    }
    if(power==1) {String condition_power="питание включено";
        System.out.println(condition_power);
        Condit.power =1;
    }
    if((power!=0) & (power!=1)) {
        System.out.println("некоректный ввод ");}



    }

    }

