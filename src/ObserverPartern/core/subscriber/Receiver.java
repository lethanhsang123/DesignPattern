package ObserverPartern.core.subscriber;

public interface Receiver {
    void update(Float temperature, Float humidity, Float pressure);
}
