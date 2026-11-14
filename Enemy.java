public class Enemy {
    private int hp;

    public Enemy(int hp) {
        this.hp = hp;
    }

    public int gethp() {return this.hp;}

    public boolean isAlive() {
        if (this.hp > 0) {
            return true;
        }
        return false;
    }

    public void damage(int amount) {
        this.hp = Math.max(0, this.hp - amount);
    }
    
}