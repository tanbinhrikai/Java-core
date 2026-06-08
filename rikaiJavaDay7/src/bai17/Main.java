package bai17;

public class Main {
    public static void main(String[] args) {
        Message message = null;


    }

    public void instanceOfPattern(Message message) {
        if (message instanceof TextMsg text) {
            System.out.println(text.content());
        }
    }

    public void switchPattern(Message message) {
        switch (message) {
            case TextMsg t ->
                    System.out.println(t.content());

            case ImageMsg i ->
                    System.out.println(i.caption());

            case VideoMsg v ->
                    System.out.println(v.fileName());
        }

    }

    public void recordPattern(Message message) {
        switch (message){
            case TextMsg(String content, User sender) ->
                    System.out.println(content);
            case ImageMsg i ->
                    System.out.println(i.caption());

            case VideoMsg v ->
                    System.out.println(v.fileName());
        }

    }

    public void guardCondition(Message message) {
        switch (message){
            case TextMsg(String content, User sender)
                    when content.length() > 0 ->
                    System.out.println(content);
            default -> System.out.println("default");
        }
    }
}
