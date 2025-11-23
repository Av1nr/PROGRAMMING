public class GameParty {
    private GameCharacter[] partyMembers;

    public GameParty(GameCharacter[] partyMembers){
        this.partyMembers = partyMembers;
    }
    public void addCharacter(GameCharacter character){
        GameCharacter[] newpartyMembers = new GameCharacter[partyMembers.length + 1];
        for (int i = 0 ; i < partyMembers.length ; i++){
            newpartyMembers[i] = partyMembers[i]; 
        }
        newpartyMembers[partyMembers.length] = character;
        partyMembers = newpartyMembers;
    }
    public void displayPartyInfo(){
        for(int i = 0 ; i < partyMembers.length ; i++){
            if(partyMembers[i] instanceof Mage mage1){
                mage1.displayInfo();
            }else if(partyMembers[i] instanceof Warrior warrior1){
                warrior1.displayInfo();
            }else{
                Archer  archer1 = (Archer) partyMembers[i];
                archer1.displayInfo();
            }
        }
    }
    public void useAllSpecialAbility(){
        for(int i = 0 ; i < partyMembers.length; i++){
            if(partyMembers[i] instanceof Mage mage1){
                mage1.useSpeacialAbility();
            }else if(partyMembers[i] instanceof Warrior warrior1){
                warrior1.useSpeacialAbility();
            }else{
                Archer  archer1 = (Archer) partyMembers[i];
                archer1.useSpeacialAbility();
            }
        }
    }
    public void findCharacterByClass(Class<?> className){
        for (int i = 0 ; i < partyMembers.length ; i++){
            if(partyMembers[i].getClass().equals(className)){
                 if(partyMembers[i] instanceof Mage mage1){
                    mage1.displayInfo();
                }else if(partyMembers[i] instanceof Warrior warrior1){
                    warrior1.displayInfo();
                }else{
                    Archer  archer1 = (Archer) partyMembers[i];
                    archer1.displayInfo();
                }
            }
        }
    }
    public void calculatePartyPower(){
        double power = 0;
        for(int i = 0 ; i < partyMembers.length ; i++){
            if(partyMembers[i] instanceof Mage mage1){
                power += mage1.getspellPower();
            }else if(partyMembers[i] instanceof Warrior warrior1){
                power += warrior1.getstrength();
            }else{
                Archer  archer1 = (Archer) partyMembers[i];
                power += archer1.getaccuracy();
            }
        }
        System.out.println("Общая сила: " + power);
    }
}
