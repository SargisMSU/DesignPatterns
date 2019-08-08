package patterns.behavioral.state;

/**
 * Это наш контекст.
 * */
public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * делегируем выполнение на activity
     * */
    public void justDoIt(){
        activity.justDoIt();
    }
}
