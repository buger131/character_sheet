class Ancestry extends Character {
    public Ancestry BattleMage(){
        Mage().INT += 2;
        return this;
    }


    public Ancestry Warlord(){
        Warrior().STR += 2;
        INT++;
        return this;
    }

    public Ancestry Ranger(){
        Rogue().DEX += 2;
        STR++;
        return this;
    }
}
