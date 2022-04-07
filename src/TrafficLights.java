public class TrafficLights {

    private static boolean isGreenLight;

    public static boolean speedOfPlayer(int speedOfPlayerx) {

        if (!isGreenLight) {
            return  speedOfPlayerx > 0;
        }
        else {
            //System.out.println("Все игроки передвигаются.");
            return speedOfPlayerx >= 0;

    }

}

    public static void  setIsGreenLight(boolean isGreenLight) {
        TrafficLights.isGreenLight = isGreenLight;
    }
    public static void getIsGreenLight() {
//        if (isGreenLight) {
//            System.out.println("Светофор зеленый!");
//        }
//        else
//            System.out.println("Светофор красный!");
    }
}
