public class Chef extends Employee{
    
    private int workExperience;

    public Chef(double salary , String work , int age , int workExperience){
        super(salary, work, age);
        this.workExperience = setworkExperience(workExperience);
    }
    public int setworkExperience(int newworkExperience){
        while(newworkExperience < 0){
            System.out.print("Write new work experience: ");
            newworkExperience = enter.nextInt();
        }
        workExperience = newworkExperience;
        return workExperience;
    }
    @Override
    public void dowork(){
        if(workExperience < 5){
            System.out.println("Cooking something strange");
        }
        else if ( workExperience < 10){
            System.out.println("Cooking good dish");
        }
        else{
            System.out.println("LET HIM COOOOOK");
        }
    }
    public String speakonkitchen(String speech){
        return "Chef told everyone: " + speech;
    }
}
