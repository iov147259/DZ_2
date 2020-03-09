
public class Condit {

    public boolean power = false;
    public boolean work = false;
    public int time = 0;

    public enum Regime {HOT, COLD}

    Regime regime = Regime.COLD;

    public void change_power() {
        if (power = false) {
            power = true;
            System.out.println(" питание включено ");
        }
        if (power = true) {
            if (work = true) {
                work = false;
                System.out.println("работа кондиционера прекращена ");
            }
            power = false;
            time=0;
            System.out.println(" питание выключено ");
        }

    }

    public void change_regime() {
        if (power = true) {
            if (regime == Regime.HOT) {
                regime = Regime.COLD;
                System.out.println("включен холодный режим ");
            } else {
                regime = Regime.HOT;
                System.out.println("включен горячий  режим ");

            }
        } else {
            System.out.println("для изменения режима необходимо включить питание ");
        }
    }

    public void change_work() {
        if (power = true) {
            if (work = false) {
                work = true;
                System.out.println("кондиционер будет работать 60 секунд");
                time = 60;
            } else {
                System.out.println("работа кондиционера продлена еще на 60 секунд ");
                time += 60;

            }
        } else {
            System.out.println("для начала работы кондиционера необходимо подключить питание ");
        }
    }


}
