import java.util.Scanner;
import java.util.regex.*;
public class TextAnalyzer {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String text = enter.nextLine();
        System.out.println("1. Words Analyzer");
        System.out.println(wordscounter(text));
        System.out.println(uniquewords(text));
        System.out.println(maxslovo(text));
        System.out.println("2. Number Analyzer");
        System.out.println(task2(text));
        System.out.println("3. Number and Email Analyzer");
        System.out.println(task3(text));
        System.out.println("4. Symbols Analyzer");
        System.out.println(task4(text));
        System.out.println("5. Sentence Analyzer");
        System.out.println(task5(text));

    }
    public static int wordscounter(String x){
        int counter = 1;
        for ( int i = 0 ; i < x.length() ; i++){
            if (x.charAt(i) == ' '){
                counter++;
            }
        }
        return counter;
    }
    public static String trim(String str){
        int counter = 0;
        String konec = "";
        int secondc = str.length();
        while (str.charAt(counter) == ' '){
            konec = "";
            counter++;
        }
        while (str.charAt(secondc) == ' '){
            konec = "";
            secondc--;
        }
        for (int i = counter ; i < secondc + 1 ; i++){
            konec = konec + str.charAt(i);
        }
        return konec;
    }
    public static String[] split(String x){
        String[] massiv = new String[wordscounter(x)];
        x+=" ";
        int counter = 0;
        String slovo = "";
        for (int i = 0 ; i < x.length() ; i++){
            if (x.charAt(i) != ' '){
                slovo += x.charAt(i);
            }
            else{
                massiv[counter] = slovo;
                counter++;
                slovo = "";
            }
        }
        return massiv;
    }
    public static String maxslovo(String x){
        String maxislovo = " ";
        String[] slova = split(x);
        for (int i = 0 ; i < wordscounter(x) ; i++){
            if (slova[i].length() > maxislovo.length()){
                maxislovo = slova[i];
            }
        }
        return maxislovo;
    }
    public static String task2(String x){
        String number = "Number:";
        int summaprodaj = 0;
        double srznach = 0;
        int kolvocifr = 0;
        double obshsumma = 0;
        Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]*");
        Matcher matcher = pattern.matcher(x);
        Pattern secondpattern = Pattern.compile("\\$[0-9]+");
        Matcher secondmatcher = secondpattern.matcher(x);
        while(matcher.find()){
            number += "\n" + matcher.group();
            kolvocifr++;
            obshsumma += Double.valueOf(matcher.group());
        }
        while(secondmatcher.find()){
            String newstr = "";
            for (int i = 1 ; i < secondmatcher.group().length() ; i++){
                newstr += secondmatcher.group().charAt(i);
            }
            summaprodaj += Double.valueOf(newstr);
        }
        srznach = obshsumma / kolvocifr;
        String itog = "Srznach: "+ srznach +"\n" +number +" " +  "\nSumma prodaj: " + summaprodaj;
        return itog;
    }
    public static String task3(String x){
        Pattern patternemail = Pattern.compile("\\w+\\@\\w+\\.(ru|com)");
        Pattern patternnumber = Pattern.compile("(\\+7||8)\\d{10}");
        Matcher matcheremail = patternemail.matcher(x);
        Matcher matchernumber = patternnumber.matcher(x);
        String numbers = "Number: ";
        String email = "Email: ";
        while(matcheremail.find()){
            email += (" \n" + matcheremail.group());
        } while(matchernumber.find()){
            numbers += ("\n" + matchernumber.group());
        }
        String itog = numbers +"\n" +email;
        return itog;
    }
    public static String task4(String x){
        int kolvosimv = 0;
        int kolvobukvcifrprobel = 0;
        int specsimv = 0;
        for (int i = 0 ; i < x.length() ; i++){
            String bukva = "" + x.charAt(i);
            if (bukva.matches("[0-9]") || bukva.matches("[A-Za-z]") || bukva.matches("\\s")){
                kolvosimv++;
                kolvobukvcifrprobel++;
            }
            else{
                kolvosimv++;
                specsimv++;
            }
        }
        String itog = "Kolvosimv: " + kolvosimv + "\nKolvobukvcifrprob: " + kolvobukvcifrprobel + "\nSpecsimv: " + specsimv;
        return itog;
    }
    public static String task5(String x){
        double kolvopred = 1;
        double srdlina = 0;
        double simvol = 0;
        for (int i = 0 ; i < x.length() ; i++){
            String bukva = "" + x.charAt(i);
            if (bukva.matches("[A-Za-z0-9]")){
                simvol++;
            }
            if (bukva.matches("(\\.|\\?|\\!)")){
                kolvopred++;
            }
        }
        srdlina = simvol / kolvopred;
        String itog = "Kolvopred: " + kolvopred + "\nSrdlina: " + srdlina;
        return itog;
    }
    public static String uniquewords (String x){
        String[] iznslova = split(x);
        String uniquewords = "";
        int uniquebutint = 0;
        for(int i = 0 ; i < wordscounter(x) ;i++){
            int counter = 0;
            for(int j = 0 ; j < wordscounter(x) ; j++){
                if (!(iznslova[i].equals(iznslova[j]))){
                    counter++;
                }
            }
            if(wordscounter(x) - 1 == counter){
                uniquewords += iznslova[i] + " ";
                uniquebutint++;
            }
        }
        String itog = "There is " + uniquebutint + " unique words: " +uniquewords;
        return itog;
    }
}
