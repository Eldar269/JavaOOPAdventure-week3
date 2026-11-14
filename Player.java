
public class Player {
    private static final int MAX_HP = 100;
    private static final int MAX_RESOURCE = 10;


    private int hp;
    private int resource;
    private int attackDamage;
    private boolean isDefending;
    private String name; 

    public Player(String name) {
        this.hp = 100;
        this.resource = 5;
        this.attackDamage = 10;
        this.isDefending = false;
        this.name = name;
    }

    public int gethp() {return this.hp;}
    public int getresource() {return this.resource;}
    public String getname() {return this.name;}
    public int getAttackDamage() {return this.attackDamage;}

    public void damage(int amount) {
        int damage = amount;

        if (this.isDefending == true) {
            damage = Math.max(0, amount - 5);
            isDefending = false; 
        }

        this.hp = Math.max(0, this.hp - damage);
    }

    public boolean special() {
        if (this.resource < 3) {
            return false;
        }
        this.resource = this.resource - 3;
        return true;
    }


    public void defense() {
        this.isDefending = true;
    }

    public void recover() {
        this.resource = Math.min(10, this.resource + 3);
    }


    public void recoverHp() {
        this.hp = Math.min(MAX_HP, this.hp + 25);
    }

    public void upgradeAttack() {
        this.attackDamage = attackDamage + 2;
    }


    public void cleardefense() {
        this.isDefending = false;
    }
}



