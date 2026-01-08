public class DocumentWrong{
    private String text;

    public DocumentWrong(String text){
        this.text = text;
    }
    public String editDocument(String newtext){
        //Тут валидацию newtext
        text = newtext;
        return text;
    }
    public String readDocument(){
        return "Кто-то читает документ";
    }
}