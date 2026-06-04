package day4.bai18;

public class CuocGoi implements Observer{
    @Override
    public void update(String event, Object data) {
        if(event.equals("CUOC_GOI")) {
            System.out.printf("[%s] %s %n", "CuocGoiObserver" ,data.toString());
        }
    }
}
