import java.util.Scanner;

public class Condit {
    public static void main(String[] args) {

        System.out.println("сейчас питание отключено, режим выбран холодный ");

        int i = 5;
        int regime = 0;
        int power = 0;
        String power_con1 = "питание отключено";
        int work = 0;
        while (i != 4) {
            System.out.println("Данный кондиционер имеет следующие кнопки :");
            System.out.println("1-кнопка питания (включает питание, при поворном нажатии отключает )");
            System.out.println("2-кнопка работы(приводит кондиционер в работу на одну минуту)");
            System.out.println("3-кнопка смены режима( холодный 1/горячий воздух 2 ");
            System.out.println("4-выход из симуляции кондционера");
            System.out.println("выберите кнопку и введи её номер ");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            if (i == 1) {
                Power_condit power_condit = new Power_condit();
                power_condit.power_control();
                if (power_condit.equals(power_con1) == true) {
                    power = 0;
                }
                else {
                    power = 1;
                }
                System.out.println("power is " + power);
            }

            if (i == 3) {

                if (power==0){
                    System.out.println("для изменения режима, пожалуйста, включите питание ");
                }
                else { Regime_condit regime_condit= new Regime_condit();
                regime_condit.regime_control();


                }
            }


        }
        System.out.println("до встречи!");
    }
}
