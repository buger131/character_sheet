class Character {
    public int DEX;
    public int STR;
    public int INT;


    public Character Rogue(){
        DEX = 12;
        INT = 10;
        STR = 10;
        return this;
    }

    public Character Warrior(){
        DEX = 10;
        INT = 9;
        STR = 12;
        return this;
    }

    public Character Mage(){
        DEX = 10;
        INT = 12;
        STR = 8;
        return this;
    }
}
