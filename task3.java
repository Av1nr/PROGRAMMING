import java.util.regex.*;
public class task3 {
    public static void main(String[] args) {
        String html = "<div class=\"product\">\n<h3>Телефон</h3>\n<p>Цена: 20000 руб</p>\n</div>\n<div class=\"product\"\n><h3>Ноутбук</h3>\n<p>Цена: 50000 руб</p>\n</div>";
        Pattern pattern = Pattern.compile("<h3>[A-Za-zА-Яа-я]+</h3>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()){
            System.out.println("Find : " + matcher.group());
        }
    }
}