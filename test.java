public class test {
    public static void main(String[] args) {
        Mage mage = new Mage("Archer", 0, 0, 0, false, 0, 0, "ice");
        GameCharacter[] initialParty = { mage };
        GameParty party = new GameParty(initialParty);
        
        Archer archer = new Archer("Mage", 0, 0, 0, false, 0, 0, "Fire");
        party.addCharacter(archer);
        // party.displayPartyInfo();
        // party.useAllSpecialAbility();
        party.calculatePartyPower();
    }
}