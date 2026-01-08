public class CorrectDocument implements Readable , Editable{
     private String text;

    public CorrectDocument(String text){
        this.text = text;
    }
    @Override
    public String editDocument(String newtext){
        //Тут валидацию newtext
        text = newtext;
        return text;
    }
    @Override
    public String readDocument(){
        return "Кто-то читает документ";
    }
}
