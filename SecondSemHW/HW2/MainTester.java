
public class MainTester {
    public static void main(String[] args) {
        //СЦЕНАРИЙ 1
        ResearchHub<ResearchSample<Double>> test = new ResearchHub<>();
        MedicalDevice device = new MedicalDevice(null, 0, null, null, 0);
        test.register(device);
        //Не дает добавить , хахах, что еще написать, Нельзя привести MedicalDevice к ResearchSample<Double>



        //СЦЕНАРИЙ 2
        ResearchHub<LabaratoryItem> array = new ResearchHub<>();
        ResearchSample<Double> sample21 = new ResearchSample<>("001", 2 , 1, "DNA", 0.95);
        ResearchSample<Integer> sample22 = new ResearchSample<>("002", 5, 2,"Protein", 85);
        MedicalDevice sample23 = new MedicalDevice("003", 5,3, "Centrifuge", 0.1);
        array.register(sample21);
        array.register(sample22);
        array.register(sample23);
        System.out.println("Сейчас у нас столько элемнтов в массиве: " + array.getCount());
        array.release(1);
        System.out.println("Сейчас у нас столько элемнтов в массиве: " + array.getCount());
        LabUtils.generateReport(array.getStorage());


        //СЦЕНАРИЙ 3
        ResearchHub<LabaratoryItem> array3 = new ResearchHub<>();
        ResearchSample<Double> sample31 = new ResearchSample<>("001", 2 , 1, "DNA", 0.5);
        ResearchSample<Integer> sample32 = new ResearchSample<>("002", 5, 2,"Protein", 50);
        ResearchSample<RationalFraction> sample33 = new ResearchSample<>("002", 5, 2,"Protein", new RationalFraction(1 , 2));
        array3.register(sample31);
        array3.register(sample32);
        array3.register(sample33);
        array3.adjustPurity(10 , 0.5);
        System.out.println(array3.getAveragePurity());
        //0.5 + 10 + 50 + 10 + 1/2 + 10 = 81; 81 * 0.5 = 40.5 ; 40.5 / 3 = 13.5


        //СЦЕНАРИЙ 4
        ResearchSample<Double> sample41 = new ResearchSample<>("001", 2 , 100, "DNA", 0.5);
        ResearchHub<LabaratoryItem> array4 = new ResearchHub<>();
        System.out.println(array4.checkSession(sample41 ,100));
        ResearchSample<Integer> sample42 = new ResearchSample<>("002", 5, 250,"Protein", 50);
        System.out.println(array4.checkSession(sample42 , 250));
        //Это все из-за кеширования, тк объекты от -128 до 127 имеют кеширование, а другие числа создают новые объекты :3

        //СЦЕНАРИЙ 5
        LabaratoryItem [] items = new LabaratoryItem[5];
        items[0] = new ResearchSample<Double>("001", 2 , 1, "DNA", 0.95);
        items[1] = new ResearchSample<Integer>("002", 9, 2,"Protein", 85);
        items[2] = new ResearchSample<Double>("003", 4 , 3, "DNA", 0.95);
        items[3] = new ResearchSample<Integer>("004", 10, 4,"Protein", 85);
        items[4] = new ResearchSample<Double>("005", 3, 5, "DNA", 0.95);
        System.out.println(LabUtils.getMaxBioHazardFromArray(items));
        ResearchHub<LabaratoryItem> hub5 = new ResearchHub<>();
        for (LabaratoryItem item : items){
            hub5.register(item);
        }
        hub5.clearByHazardLevel(5);
        LabUtils.generateReport(hub5.getStorage());
        ResearchHub<MedicalDevice> hub52 = new ResearchHub<>();
        MedicalDevice help  = new MedicalDevice(null, 0, null, null, 0);
        hub52.register(help);
        System.out.println(LabUtils.isSame(hub5 , hub52));
        //Это из-за того , что в момент компиляции они оба являются по факту Object
    }
}
