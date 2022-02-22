public class Main {

    public static void main(String[] args) {

        boolean isGreenLight = false;
        boolean isRedLight = true;

        int speedOfPlayer1 = 3;
        int speedOfPlayer2 = 5;
        int speedOfPlayer3 = 2;


        if (false) {
            System.out.println("Все игроки могут двигаться");
        }
        if (true) {
            if (speedOfPlayer1 > 0) {
                System.out.println("1");
            }
            if (speedOfPlayer2 > 0) {
                System.out.println("1");
            }
            if (speedOfPlayer3 > 0) {
                System.out.println("1");
            }
        }

    }


    // Допишите здесь логику так, что будет подсчитано и выведено
    // количество игроков, которые выбывают.
    // Если свет зелёный, то проходят все игроки (0 выбывают).
    // Если свет красный, то выбывает каждый, чья скорость не 0.

}




