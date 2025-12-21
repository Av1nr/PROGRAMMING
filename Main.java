public class Main {
    public static void main(String[] args) {
        User[] users = {new User("Avinr", UserRole.USER, 17) , new User("Seleba" , UserRole.ADMIN , 18) , new User("Kazuha" , UserRole.MODERATOR , 20)};
        Action action = new Action(){
            @Override
            public void execute(User newuser){
                try {
                    if (newuser.getAge() < 18){
                        throw new IllegalArgumentException("Ur too young for this " + newuser.getUsername());
                    }
                    else if (newuser.getAge() >= 18 && newuser.getRole() == UserRole.ADMIN) {
                        throw new IllegalArgumentException("Welcome to the club ADMIN: " + newuser.getUsername());
                    }
                    else if (newuser.getAge() >= 18 && newuser.getRole() == UserRole.MODERATOR) {
                        throw new IllegalArgumentException("Welcome to the club MODER: " + newuser.getUsername());
                    }
                    else{
                        System.out.println("Welcome User: " + newuser.getUsername());
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                
            }
        };
        for (User user : users){
            action.execute(user);
        }
    }
}
