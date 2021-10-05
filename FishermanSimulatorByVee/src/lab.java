import java.util.Date;

public class lab {

    public static void main(String[] args) {

        String[] fish = { "Kinmedai", "Salmon", "Sardine", "Saba" };

        System.out.println("| " + "  Fish" + "  |" + "   Quest" + "   |" + "  Your" + "  |");
        System.out.println("-------------------------------");
        int[] quest = { 1, 2, 3, 4, 5 };
        int[] inventory = { 1, 2, 3, 4, 5 };

        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {}

        for (int i = 0; i <= 3; i++) {

            System.out.format("%10s", fish[i]);
            System.out.format("%7d", i);
            System.out.format("%11d", i);

            if (quest[i] <= inventory[i]) {
                System.out.format("%3s", "\u2713");
            } else {
                System.out.format("%3s", "\u0FBE");
            }
            System.out.println();

        }

        // switch (fish) {
        // case 0:
        // System.out.println("Congrats, you just got a Kinmedai fish");
        // break;
        // case 1:
        // System.out.println("Congrats, you just got a Salmon fish");
        // break;
        // case 2:
        // System.out.println("Congrats, you just got a Sardine fish");
        // break;
        // case 3:
        // System.out.println("Congrats, you just got a Saba fish");
        // break;
        // case 4:
        // System.out.println("So pity, you got just an old sneaker");
        // break;
        // }

    }
}
