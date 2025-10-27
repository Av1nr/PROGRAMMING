import java.util.regex.*;
public class task2 {
    public static void main(String args[]){
        String logs = "[ERROR] 2024-01-15: Connection failed\n[INFO] 2024-01-15: User logged in\n[DEBUG] 2024-01-15: Processing request\n[ERROR] 2024-01-15: Database timeout";
        Pattern pattern = Pattern.compile("\\[(ERROR){1}\\]\\s{1}\\d{4}\\-\\d{2}\\-\\d{2}\\:\\s{1}\\w+\\s{1}\\w+");
        Matcher matcher = pattern.matcher(logs);
        while (matcher.find()){
            System.out.println("String with Error: " + matcher.group());
        }
    }
}
