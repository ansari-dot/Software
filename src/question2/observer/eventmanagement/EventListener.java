package question2.observer.eventmanagement;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
