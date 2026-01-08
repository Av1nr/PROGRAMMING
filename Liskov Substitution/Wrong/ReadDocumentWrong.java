public class ReadDocumentWrong extends DocumentWrong{

    public ReadDocumentWrong(String text){
        super(text);
    }
    @Override
    public String editDocument(String newtext){
        throw new IllegalArgumentException("Прости , мы не можем редактировать файл для чтения");
    }
}