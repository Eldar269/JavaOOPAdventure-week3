import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String n = scanner.nextLine();


        Player player = new Player(n);
        Enemy enemy1 = new Enemy(30);

        System.out.println("Hello " + n + ", First Round start NOW!");

        Boolean wonFirstRoundBoolean = fight(player, enemy1, scanner);

        if(wonFirstRoundBoolean) {
            System.out.println("Congrats you won round 1!");
        } else {
            System.out.println("You lost this round");
            return;
        }

        Reward chosenReward = chooseReward(scanner);
        applyReward(player, chosenReward);

        player.cleardefense();

        
        System.out.println("Second round...\n" + player.getname() + " Hp is: " + player.gethp());
        System.out.println(player.getname() + " resource is: " + player.getresource());
        System.out.println(player.getname() + " attack damage is: " + player.getAttackDamage());

        Enemy enemy2 = new Enemy(45);
        Boolean wonSecondRoundBoolean = fight(player, enemy2, scanner);
        
        if(wonSecondRoundBoolean) {
            System.out.println("Congrats you won!");
        } else {
            System.out.println("You lost this round");
        }

        System.out.println("Good game!!");

        scanner.close();

        

    }

    public static Reward chooseReward(Scanner scanner) {
        while (true) {
            System.out.println("\nChoose your reward (only one):");
            System.out.println("1 - RECOVERY (+25 HP, max 100)");
            System.out.println("2 - POWER (+2 Basic Attack damage)");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                return Reward.RECOVERY;
            } else if (choice.equals("2")) {
                return Reward.POWER;
            } else {
                System.out.println("Invalid reward choice");
            }
        }
    }

    public static void applyReward(Player player, Reward reward) {
        if (reward == Reward.RECOVERY) {
            player.recoverHp();
            System.out.println("Reward applied: RECOVERY! Your HP is now " + player.gethp());
        } else if (reward == Reward.POWER) {
            player.upgradeAttack();
            System.out.println("Reward applied: POWER! Your basic attack is now " + player.getAttackDamage());
        }
    }
    

    public static Boolean fight(Player player, Enemy enemy1, Scanner scanner) {

        while (player.gethp() > 0 && enemy1.isAlive()) {
            System.out.println(player.getname() + " has got " + player.gethp() + " HP");
            System.out.println("Enemy has got " + enemy1.gethp() + " HP");
            System.out.println("\nchoose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special");

            String choice = scanner.nextLine().trim();

            switch(choice) {
                case "1":
                enemy1.damage(player.getAttackDamage());
                if (enemy1.gethp() > 0) {
                    player.damage(10);
                }
                break;

                case "2":
                player.defense();
                if (enemy1.gethp() > 0) {
                    player.damage(10);
                }
                break;

                
                case "3":
                player.recover();
                if (enemy1.gethp() > 0) {
                    player.damage(10);
                }
                break;

                case "4":
                boolean works = player.special();
                if (works) {
                    enemy1.damage(15);
                    if (enemy1.gethp() > 0) {
                        player.damage(10);
                    }
                }
                else {
                    System.out.println("You dont have enough resource...");
                }
                break;

                default:
                    System.out.println("Invalid input");
                    break;
            }


        }
        return player.gethp() > 0;
        
    }
}

