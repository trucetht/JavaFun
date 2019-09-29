import java.util.Scanner;

public class ZombieKiller {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies[] = {"Close-range zombie", "Mid-range Zombie", "Long-range Zombie"};

        System.out.println("Backpack items");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);

        System.out.println("Zombie Types");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);

        System.out.println("Zombies are approaching your house!");
        System.out.println("There are 2 long-range zombies and 1 close-range zombie, Who do you kill first?");

        int i = scan.nextInt();


            if (i == 0) {
                System.out.println("Correct: BOOM, You blew his head off with the Shotgun");
            } else  {
                System.out.println("Sorry, you were supposed to kill the close-range zombie first.\nYour face has been eaten off");
                System.exit(0);
            }

            System.out.println("Now lets kill the long-ranged zombies, Please choose the correct weapon: ");

            int a = scan.nextInt();


            if (a == 2) {
                System.out.println("Nice Shot, Now Reload");
            }else {
                System.out.println("Good try but you're not that good of a shot");
                System.exit(0);
            }

            System.out.println("Press '4' to reload");

            int b = scan.nextInt();

            if (b == 4) {
                System.out.println("Alright, Locked and Loaded!");
            }else {
                System.out.println("Dang, You do not know how to follow instructions");
                System.exit(0);
            }

            System.out.println("Now lets pull the trigger,\n Press '5' to Fire!");

            int c = scan.nextInt();

            if (c == 5) {
                System.out.println("Congratulations, you survived the Zombie Attack");
            } else {
                System.out.println("Wow, you are gonna die now because you are out of ammo");
                System.exit(0);
            }

            System.exit(0);


    }
}

