class Ancestry extends Character{
    public Ancestry BattleMage(){
        Mage().INT += 2;
        return this;
    }

    public Ancestry Warlord(){
        Warrior().STR += 2;
        Warrior().INT += 1;
        return this;
    }

    public Ancestry Ranger(){
        Rogue().DEX += 2;
        Rogue().STR += 1;
        return this;
    }
}
