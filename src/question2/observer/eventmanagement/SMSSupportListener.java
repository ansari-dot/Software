package question2.observer.eventmanagement;

import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private String defaultSMS;

    public SMSSupportListener(String phoneNumber, String defaultSMS) {
        this.phoneNumber = phoneNumber;
        this.defaultSMS = defaultSMS;
    }

    @Override
    public void update(String eventType, File file) {
        if (eventType.equals("sms")) {
            if (defaultSMS.length() > 160) {
                System.out.println("Warning: Default SMS length exceeds 160 characters. Please define a valid SMS.");
            } else {
                System.out.println("SMS sent to " + phoneNumber + ": " + defaultSMS);
                System.out.println("File involved: " + file.getName());
            }
        }
    }
}
