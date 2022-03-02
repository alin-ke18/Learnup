public class TrafficLights {

    public static boolean isRedLight = true;

    public static int speedOfPlayer(int speedOfPlayerx) {

//        int speedOfPlayer1 = x;
//        int speedOfPlayer2 = y;
//        int speedOfPlayer3 = z;


//        if (false) {
//            System.out.println("Все игроки могут двигаться");
//        }
        if (isRedLight) {
            if (speedOfPlayerx > 0) {
//                System.out.println("1");
                return (1);
            }
//            if (y > 0) {
////                System.out.println("1");
//                return (1);
//            }
//            if (z > 0) {
////                System.out.println("1");
//                return (1);
//            }

//            if (y > 0) {
//                System.out.println("1");
//            }
//            if (z > 0) {
//                System.out.println("1");
        }
        return speedOfPlayerx;
    }
}

