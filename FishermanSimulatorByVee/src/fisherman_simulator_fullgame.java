import java.util.Scanner;

public class fisherman_simulator_fullgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // just greeting
        System.out.println();
        System.out.println("███████╗██╗░██████╗██╗░░██╗███████╗██████╗░███╗░░░███╗░█████╗░███╗░░██╗");
        System.out.println("██╔════╝██║██╔════╝██║░░██║██╔════╝██╔══██╗████╗░████║██╔══██╗████╗░██║");
        System.out.println("█████╗░░██║╚█████╗░███████║█████╗░░██████╔╝██╔████╔██║███████║██╔██╗██║");
        System.out.println("██╔══╝░░██║░╚═══██╗██╔══██║██╔══╝░░██╔══██╗██║╚██╔╝██║██╔══██║██║╚████║");
        System.out.println("██║░░░░░██║██████╔╝██║░░██║███████╗██║░░██║██║░╚═╝░██║██║░░██║██║░╚███║");
        System.out.println("╚═╝░░░░░╚═╝╚═════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝");

        delayTime(500);
        System.out.println("░██████╗██╗███╗░░░███╗██╗░░░██╗██╗░░░░░░█████╗░████████╗░█████╗░██████╗░");
        System.out.println("██╔════╝██║████╗░████║██║░░░██║██║░░░░░██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗");
        System.out.println("╚█████╗░██║██╔████╔██║██║░░░██║██║░░░░░███████║░░░██║░░░██║░░██║██████╔╝");
        System.out.println("░╚═══██╗██║██║╚██╔╝██║██║░░░██║██║░░░░░██╔══██║░░░██║░░░██║░░██║██╔══██╗");
        System.out.println("██████╔╝██║██║░╚═╝░██║╚██████╔╝███████╗██║░░██║░░░██║░░░╚█████╔╝██║░░██║");
        System.out.println("╚═════╝░╚═╝╚═╝░░░░░╚═╝░╚═════╝░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
        System.out.println();

        delayTime(9000);

        int day = 1;
        int heart = 3;

        while (true) { // maingame start here

            boolean questcheck = false;

            if (day == 1) { // only for first day
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("####################################################");
                System.out.println("##                day " + day + "                           ##");
                System.out.println("####################################################");
                System.out.println();
                System.out.println("It's a good day for fishing, isn't it?");
                System.out.println();
            } else {

                System.out.println("####################################################");
                System.out.println("##                day " + day + "                           ##");
                System.out.println("####################################################");
                System.out.println();
                System.out.println("It's a good day for fishing too, isn't it?");
                System.out.println();

            }

            delayTime(1000);
            System.out.println("Woh, today has a lot of quest coming");
            System.out.println("mhhm, Let's see");

            int quest[] = questfish(day); // difficult will increase every day

            delayTime(3000);
            System.out.println();
            System.out.println("you have to collect : ");

            System.out.println();
            System.out.println(quest[0] + " : Kinmedai fish ");
            System.out.println(quest[1] + " : Salmon fish ");
            System.out.println(quest[2] + " : Sardine fish ");
            System.out.println(quest[3] + " : Saba fish ");
            System.out.println();

            // on car
            System.out.println("Where do you wanna go today?");
            System.out.println();
            System.out.println("type 100 : Sea");
            System.out.println("type 200 : Go home today quest is too hard");
            System.out.println("type 88 : Menu");
            System.out.println();
            System.out.println("Input here >> ");

            int inputWhere = input.nextInt();
            int chanceleft = 15 + (day * 3);
            int[] inventory = new int[4];

            if (inputWhere == 100) {

                while (chanceleft > 0) {
                    // sea
                    System.out.println();
                    System.out.println("What you want to do here?");
                    System.out.println();
                    System.out.println("type 10 : Fishing");
                    System.out.println("type 20 : Leave this place and go home");
                    System.out.println();
                    System.out.println("Input here >> ");

                    int inputSea = input.nextInt();

                    if (inputSea == 10) {

                        // 0 1 2 3

                        while (chanceleft > 0) {
                            // sit at habor
                            System.out.println();
                            System.out.println("type 1 : Catch a fish ");
                            System.out.println("type 2 : Menu");
                            System.out.println("type 3 : Leave this place ");
                            System.out.println();
                            System.out.println("Input here >> ");

                            int inputFisherman = input.nextInt();

                            if (inputFisherman == 1) { // mainthingggggggggggggggggggggggggggggggggggggggggggggggggggg

                                System.out.println();
                                System.out.println("I think something got your baits");

                                delayTime(1200);
                                switch (fishing()) {
                                    case 0:
                                        inventory[0] += 1;
                                        break;

                                    case 1:
                                        inventory[1] += 1;
                                        break;

                                    case 2:
                                        inventory[2] += 1;
                                        break;

                                    case 3:
                                        inventory[3] += 1;
                                        break;

                                }
                                chanceleft -= 1;

                                if (quest[1] <= inventory[1] && quest[0] <= inventory[0] && quest[2] <= inventory[2]
                                        && quest[3] <= inventory[3]) {

                                    System.out.println();
                                    System.out.println("Congrat, Your today quest are all done");
                                    System.out.println();
                                    questcheck = true;
                                }

                                System.out.println();
                                System.out.println("You have " + chanceleft + " chances left");
                            }

                            if (inputFisherman == 2) {

                                menu(quest, inventory, heart, chanceleft);
                            }

                            if (inputFisherman == 3) {

                                break;
                            }

                            if (questcheck == true) {

                                System.out.println();
                                break;
                            }
                        }
                    }

                    if (questcheck == true) {

                        break;
                    }

                    if (inputSea == 20) {

                        break;
                    }

                }

            }
            if (inputWhere == 200 || chanceleft <= 0 && questcheck == false) {

                System.out.println("I though you will have more brave");
                System.out.println("!! You just got -1 hear !!");
                heart -= 1;
                System.out.println("You have " + heart + " heart left");
                day += 1;
            }

            if (inputWhere == 88) {

                menu(quest, inventory, heart, chanceleft);
            }

            if (questcheck == true) {

                System.out.println();
                System.out.println("Today you did very well hear your reward");
                System.out.println("!! You just got 1 heart !!");
                heart += 1;
                System.out.println("You have " + heart + " heart left");
                day += 1;

            }

            if (heart <= 0) {

                System.out.println();
                System.out.println("████████████████████████");
                System.out.println("█▄─▄███─▄▄─█─▄▄▄▄█▄─▄▄─█");
                System.out.println("██─██▀█─██─█▄▄▄▄─██─▄█▀█");
                System.out.println("▀▄▄▄▄▄▀▄▄▄▄▀▄▄▄▄▄▀▄▄▄▄▄▀");
                System.out.println();
                System.out.println("Thanks for playing my game that's mean a lot to me");
                System.out.println();
                System.exit(0);

            }
            if (heart >= 5) {

                System.out.println();
                System.out.println("███████████████████████");
                System.out.println("█▄─█▀▀▀█─▄█▄─▄█▄─▀█▄─▄█");
                System.out.println("██─█─█─█─███─███─█▄▀─██");
                System.out.println("▀▀▄▄▄▀▄▄▄▀▀▄▄▄▀▄▄▄▀▀▄▄▀");
                System.out.println();
                System.out.println("Thanks for playing my game that's mean a lot to me");
                System.out.println();
                System.exit(0);

            }

        }
    }

    public static void menu(int[] quest, int[] inventory, int heart, int chanceleft) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("How many times do I have to tell you!?");
        System.out.println("Menu :");
        System.out.println("type 1 : Quest");
        System.out.println("type 2 : Inventory");
        System.out.println("type 3 : Do nothing");
        System.out.println("type 99 : Exitgame");
        System.out.println();
        System.out.println("input here >> ");

        int num = input.nextInt();

        if (num == 1) {
            showQuest(quest);
        }

        if (num == 2) {
            showInventory(quest, inventory, heart, chanceleft);
        }

        if (num == 99) {

            System.out.println("Thanks for play my game that's mean a lot to me");
            System.out.println();
            System.exit(0);
        }
    }

    public static int fishing() {

        int max = 5;
        int min = 0;
        int range = max - min + 1;

        int fish = (int) ((Math.random() * (max - min)) + min);

        switch (fish) {
            case 0:
                System.out.println();
                System.out.println("█▄▀ █ █▄░█ █▀▄▀█ █▀▀ █▀▄ ▄▀█ █");
                System.out.println("█░█ █ █░▀█ █░▀░█ ██▄ █▄▀ █▀█ █");
                System.out.println("Congrats, you just got a Kinmedai fish");
                break;
            case 1:
                System.out.println();
                System.out.println("█▀ ▄▀█ █░░ █▀▄▀█ █▀█ █▄░█");
                System.out.println("▄█ █▀█ █▄▄ █░▀░█ █▄█ █░▀█");
                System.out.println("Congrats, you just got a Salmon fish");
                break;
            case 2:
                System.out.println();
                System.out.println("█▀ ▄▀█ █▀█ █▀▄ █ █▄░█ █▀▀");
                System.out.println("▄█ █▀█ █▀▄ █▄▀ █ █░▀█ ██▄");
                System.out.println("Congrats, you just got a Sardine fish");
                break;
            case 3:
                System.out.println();
                System.out.println("█▀ ▄▀█ █▄▄ ▄▀█");
                System.out.println("▄█ █▀█ █▄█ █▀█");
                System.out.println("Congrats, you just got a Saba fish");
                break;
            case 4:
                System.out.println();
                System.out.println("█▄░█ █ █▄▀ █▀▀");
                System.out.println("█░▀█ █ █░█ ██▄");
                System.out.println("So pity, you just got an old sneaker. it doesn't count");
                break;
        }

        return fish;
    }

    public static void delayTime(int num) {
        try {
            Thread.sleep(num);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void showQuest(int[] anylist) {

        // objective left print not finished
        System.out.println();
        System.out.println("you have to collect : ");
        System.out.println();
        System.out.println(anylist[0] + " : Kinmedai fish ");
        System.out.println(anylist[1] + " : Salmon fish ");
        System.out.println(anylist[2] + " : Sardine fish ");
        System.out.println(anylist[3] + " : Saba fish ");
        System.out.println();

    }

    public static void showInventory(int[] quest, int[] inventory, int heart, int chanceleft) {

        System.out.println("You have " + chanceleft + "chances left");
        System.out.println("You have " + heart + "heart left");
        System.out.println();
        System.out.println("Your quest status :");
        System.out.println();

        String[] fish = { "Kinmedai", "Salmon", "Sardine", "Saba" };

        System.out.println("| " + "  Fish" + "  |" + "   Quest" + "   |" + "  Your" + "  |");
        System.out.println("-------------------------------");

        for (int i = 0; i <= 3; i++) {

            System.out.format("%10s", fish[i]);
            System.out.format("%7d", quest[i]);
            System.out.format("%11d", inventory[i]);

            if (quest[i] <= inventory[i]) {
                System.out.format("%3s", "\u2713");
            } else {
                System.out.format("%3s", "\u0FBE");
            }
            System.out.println();
        }

        System.out.println();

    }

    public static int[] questfish(int day) {

        int[] quest = new int[4];

        int max = 2 + day;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < quest.length; i++) {
            quest[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return quest;
    }
}
