import java.util.regex.*;
public class task5 {
    public static void main(String[] args){
        String post = "Сегодня был в #парке и #кино #отдых #выходные";
        Pattern pattern = Pattern.compile("\\#[A-Za-zА-Яа-я]+");
        Matcher matcher = pattern.matcher(post);
        while(matcher.find()){
            System.out.println("Write this to boomer: " + matcher.group());
        }
    }
}