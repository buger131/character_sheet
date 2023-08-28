class Ancestry extends Character {
    public Ancestry BattleMage(){
        Mage();

        INT += 2;
        return this;
    }


    public Ancestry Warlord(){
        Warrior();

        STR += 2;
        INT += 1;
        return this;
    }

    public Ancestry Ranger(){
        Rogue();

        DEX += 2;
        STR += 1;
        return this;
    }
}
