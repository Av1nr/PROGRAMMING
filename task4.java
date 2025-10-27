import java.util.regex.*;
public class task4 {
    public static void main(String[] args) {
        String csv = "Вика,18,Альметьевск;Анна,24,Казань;Аскар,6,Бугульма";
        csv += ";";
        Pattern pattern = Pattern.compile("[A-ZА-Яa-zа-я]+.*?\\;");
        Matcher matcher = pattern.matcher(csv);
        while(matcher.find()){
            System.out.println("Find : " + matcher.group());
        }
    }
}