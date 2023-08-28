public class Main
{
    public static void main(String[] args) {

        Character newChar = new Character().Warrior();
        Ancestry newAncestry = new Ancestry().Ranger();

        System.out.println(newChar.DEX);
        System.out.println(newChar.STR);
        System.out.println(newChar.INT);

        System.out.println(newAncestry.DEX);
        System.out.println(newAncestry.STR);
        System.out.println(newAncestry.INT);
    }
}