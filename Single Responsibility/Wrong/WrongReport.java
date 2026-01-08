public class WrongReport{
    private String text;

    public WrongReport(String text){
        this.text = text;
    }

    public String getReport(){
        return text;
    }
    public String saveReportToReportBase(String base){
        return "Report added to " + base;
    }
    public String printReportToConsole(){
        return "Report: " + getReport();
    }
}