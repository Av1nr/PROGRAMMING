import java.util.regex.*;
public class task1 {
    public static void main(String[] args){
        String text = "Она сказала: \"Привет!\", а он ответил: \"Как дела?\",потом: \"Отлично!\"";
        Pattern pattern = Pattern.compile("\".*?\"");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Щас сделаем");
        while (matcher.find()){
            System.out.println("Нашел :" + matcher.group());
        }
    }
}