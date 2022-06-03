package TP_Final;



public class Main {

    public static void main(String[] args) {


        Gold avionGold1 = new Gold(true,false,"G-1212");
        Silver avionSilver1 = new Silver(true, "SL-2490");
        Bronze avionBronze1 = new Bronze("BZ-5017");

        System.out.println(avionGold1.toString());
        System.out.println("_______________________");
        System.out.println(avionSilver1.toString());
        System.out.println("_______________________");
        System.out.println(avionBronze1.toString());


    }
}
