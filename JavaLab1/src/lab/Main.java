package lab;

public class Main {
        public static void main(String[] args) {
            Landmower kusanoShinigami = new Landmower();
            Landmower modestChoice = new Landmower(40, 400, 3, "midGround");
            Landmower turboPushka9000 = new Landmower(70, 1200, 5, "Luxe",
                    999, 2003, 5);
            Landmower.setAdditionalInfo("this mowers are sold only on a territory of Ukrainian Empire");
            System.out.println(kusanoShinigami.toString());
            System.out.println(modestChoice.toString());
            System.out.println(turboPushka9000);
            Landmower.printStaticAdditionalInfo();
            turboPushka9000.printAdditionalInfo();
            modestChoice.resetValues(52, 777, 4, "coolGround", 400, 2000, 1);
            System.out.println(modestChoice.toString());
        }
}
