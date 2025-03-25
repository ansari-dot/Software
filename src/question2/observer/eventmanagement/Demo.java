package question2.observer.eventmanagement;
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("sms", new SMSSupportListener("+123456789", "File operation notification: "));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
            editor.sendSMS();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
