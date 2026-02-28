public class CustomsTerminal {
    
    public static void inspectCargo(CargoBay<? extends Cargo> cargo){
        for(int i = 0 ;  i < cargo.getSize() ; i++){
            if(cargo.get(i) != null){
                System.out.println(cargo.get(i).getName());
            }
        }
    }
    public static void loadHumanitarianApples(CargoBay<? super Fruit> cargo){
        cargo.add(new Fruit("Apple"));
    }
    public static <T extends Cargo> void transferCargo(CargoBay<? extends T> source , CargoBay<?  super T> destination){
        for(int i = 0 ; i < source.getSize() ; i++){
            destination.add(source.get(i));
        }
    }
}
