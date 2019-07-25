package patterns.structural.bridge;

/**
 * Общий интерфейс всех устройств
 */
public interface Device {

    boolean isEnabled();

    void setEnabled(boolean enabled);

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();

}
