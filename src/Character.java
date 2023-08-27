class Character {
    public int INT = 10;
    public int DEX = 10;
    public int STR = 10;

    public Character Rogue(){
        DEX += 2;
        return this;
    }

    public Character Warrior(){
        STR += 2;
        INT -= 2;
        return this;
    }

    public Character Mage(){
        STR -= 2;
        INT += 2;
        return this;
    }
}
