import java.util.Scanner;
public class ProjectAnyaBudrevich{
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String text = enter.nextLine();
        System.out.println("Email-Адреса :");
        System.out.println(findEmails(text));
        System.out.println("Даты: ");
        System.out.println(findDates(text));
        System.out.println("Слова с заглавной буквы :");
        System.out.println(findCapitalizedWords(text));
        System.out.println("Общее кол-во цифр: " + countDigits(text));
        enter.close();
    }
    public static String findDates(String text){
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = ownspliter(text)[i];
                if (slovo.matches("(0[1-9]|[1-2][0-9]|3[0-1])\\.(0[1-9]|1[0-2])\\.((19|20)\\d{2}\\.?)")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
    public static int countDigits(String x){
        int counter = 0;
        for (int i = 0 ; i < x.length() ; i++){
            String bukva = "" + x.charAt(i);
            if (bukva.matches("[0-9]")){
                counter++;
            }
        }
        return counter;
    }
    public static int counterslov(String x){
        int counterslov = 1;
        for (int i = 0 ; i < x.length() ; i++){
            
            if (x.charAt(i) == ' '){
                counterslov++;
            }
        }
        return counterslov;
    }
    public static String[] ownspliter(String x){
        String[] splited = new String[counterslov(x)];
        int schetslov = 0;
        String slovo = "";
        for (int i = 0 ; i < x.length() ; i ++){
            if (x.charAt(i) != ' '){
                slovo += x.charAt(i);
            }
            else{
                splited[schetslov] = slovo;
                schetslov++;
                slovo = "";
            }
        }
        splited[schetslov] = slovo;
        return splited;
    }
    public static String findCapitalizedWords(String text){
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = deleter(ownspliter(text)[i]);
                if (slovo.matches("[A-ZА-Я]{1}[a-zа-я]+")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
    public static String findEmails(String text){
        String slova = "";
        int counter = 1;
        for (int i = 0 ; i < counterslov(text) ; i++){
                String slovo = ownspliter(text)[i];
                if (slovo.matches("\\w+\\@\\w+\\-*\\w+\\.(com|ru)")){
                    slova += counter + "." + slovo +"\n";
                    counter++;
            }
        }
        return slova;
    }
    public static String deleter (String text){
        String newstring = "";
        for (int i = 0 ; i < text.length() ; i++){
                String bukva = "" + text.charAt(i);
                if (bukva.matches("[A-Za-zА-Яа-я]")){
                    newstring += bukva;
            }
        }
        return newstring;
    }
    
}