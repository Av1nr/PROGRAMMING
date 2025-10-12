import java.util.Scanner;
public class task2ifsplitnekruto{
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String stroka = enter.nextLine();
        stroka = stroka.trim();
        //String[] words = stroka.split(" ");
        int counterprobel = 0;
        for (int i = 0; i < stroka.length(); i++){
            if (stroka.charAt(i) == ' '){
                counterprobel++;
            }
        }
        String[] words = new String[counterprobel + 1];
        int counter = 0;
        int start = 0;
        for (int i = 0; i <= stroka.length(); i++) {
            if (i == stroka.length() || stroka.charAt(i) == ' ') {
                String word = stroka.substring(start, i);
                words[counter] = word;
                start = i + 1;
                counter++;
            }
        }
        String maxslovo = "";
        int maxcount = 0;
        int count = 0;
        for (String word : words){
            word = word.toLowerCase();
            for (int i = 0 ; i < word.length() ; i++){
                char bukva = word.charAt(i);
                if (bukva == 'a' || bukva == 'i' || bukva == 'e' || bukva == 'o' || bukva == 'u' || bukva == 'y'){
                    count += 1;
                }
                if (bukva == 'а' || bukva == 'е' || bukva == 'ё' || bukva == 'и' || bukva == 'о' || bukva == 'у' || bukva == 'ы' || bukva == 'э' || bukva == 'ю' || bukva == 'я' ){
                    count += 1;
                }
            }
            if (count > maxcount){
                maxcount = count;
                maxslovo = word;
                count = 0;
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxslovo);
        enter.close();
    }
}
