package Enums;

public enum Level {
    HIGHT(3),
    MEDIUM(2),
    LOW(4);

    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int getLvl() {
        return this.lvlNum;
    }

    public void setLvl(int num) {
        this.lvlNum = num;
    }
}