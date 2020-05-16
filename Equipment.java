public class Equipment extends Item{
    int attack;
    int defense;
    int level;
    boolean isUsing;

    public Equipment(String iName, String iDescription,int iAttack,int iDefense,int iLevel) {
        super(iName, iDescription);
        attack=iAttack;
        defense=iDefense;
        level=iLevel;
        isUsing = false;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
