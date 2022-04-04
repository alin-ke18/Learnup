public class TrafficLights {

    private static boolean isGreenLight;

    public static boolean speedOfPlayer(int speedOfPlayerx) {

        if (!isGreenLight) {
//            System.out.println("Red");
            if (speedOfPlayerx > 0) {
                System.out.println("Игрок выбывает.");
            }
            if (speedOfPlayerx == 0) {
                System.out.println("Игрок остается.");
            }
        }
        else
            System.out.println("Все игроки передвигаются.");
                return speedOfPlayerx > 0;
            }

    public static void  setIsGreenLight(boolean isGreenLight) {
        TrafficLights.isGreenLight = isGreenLight;
    }
    public static void getIsGreenLight() {
        if (isGreenLight) {
            System.out.println("Светофор зеленый!");
        }
        else
            System.out.println("Светофор красный!");
    }
}
