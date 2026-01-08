public class WrongCoder implements WrongInterfaceWorker{
    @Override
    public void code(){
        System.out.println("Coding...");
    }
    @Override
    public void test(){
        System.out.println("Testing...");
    }
    @Override
    public void manage(){
        throw new IllegalArgumentException("Coder cant manage");
    }
}