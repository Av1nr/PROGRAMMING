import java.util.Random;
public class LabUtils{
    public static LabaratoryItem getMaxBioHazardFromArray(LabaratoryItem[] labarray){
        int max = -1;
        LabaratoryItem t = new LabaratoryItem(null, max, null);
        for (int i = 0 ; i < labarray.length ; i++){
            if(labarray[i].getBiohazardLevel() > max){
                max = labarray[i].getBiohazardLevel();
                t = labarray[i];
            }
            if(max == 10){
                return t;
            }
        }
        return t;
    }
    public static boolean isSame(ResearchHub<?> first , ResearchHub<?> second){
        return first.getClass().isInstance(second);
    }
    //Знаю , что shuffle (мешать) и  shuffle(как танец разное) , но может вас улыбнет :3
    //Второе но , я искал как сделать без рандома думаю не нашел бы , это единственный способ , что мне понравился, также и у Янара была крутая идея
    //Работает по принципу , чем больше мешаю , тем лучше мешаю , можно давать пользователю еще выбор сколько раз перемешать пару элементов
    //Можно делать и тройную перемешку, да хоть пятерную , но это очень долго , думаю и такая уже круто
    public static void everyDayImShufflling(Object[] arr){
        Random random = new Random();
        for(int i = 0 ; i < 100 ; i++){
            int a = random.nextInt(arr.length);
            int b = random.nextInt(arr.length);
            Object temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    //Странно немного по ТЗ , у нас как бы нет имени , да и как такого id , есть ток SessionID(пусть будет он тогда) , а вместо имени возьму то, что 
    //Еще есть у LabItem , пусть будет serialnumber = name;
    public static void generateReport(LabaratoryItem[] labarray){
        for(int i = 0 ; i < labarray.length ; i++){
            System.out.println("Class: [" + labarray[i].getClass() + "]  ; ID: " + labarray[i].getSessionID() + " ; Name: " + labarray[i].getSerialNumber());
        }
    }
}