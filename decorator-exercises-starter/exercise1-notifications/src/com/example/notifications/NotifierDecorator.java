import com.example.notifications.EmailNotifier;
import com.example.notifications.Notifier;

public class NotifierDecorator implements Notifier{

    private final Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    
    @Override
    public void notify(String text){
        this.notifier.notify(text);
    }

    
}
