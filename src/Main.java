import Classes.BattleMage;
import Classes.Character;
import Classes.Mage;

public class Main
{
    public static void main(String[] args) {

        Character mage = new Mage();
        Character battle_mage = new BattleMage();

        System.out.println(mage.getDEX());
        System.out.println(mage.getSTR());
        System.out.println(mage.getINT());

        System.out.println(battle_mage.getDEX());
        System.out.println(battle_mage.getSTR());
        System.out.println(battle_mage.getINT());
    }
}