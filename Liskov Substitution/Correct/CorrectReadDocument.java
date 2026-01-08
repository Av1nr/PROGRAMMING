public class CorrectReadDocument implements Readable{
    private String text;
    
    public CorrectReadDocument(String text){
        this.text = text;
    }
    @Override
    public String readDocument(){
        return "Кто-то читает документ";
    }
}
