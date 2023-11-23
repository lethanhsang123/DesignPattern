package ObserverPartern.core.publisher;

import ObserverPartern.core.subscriber.Receiver;

public interface Sender {
    void registerSender(Receiver receiver);
    void registerSender(Receiver... receivers);
    void removeSender(Receiver receiver);
    void removeSender(Receiver... receiver);
    void notification();
    void changeData(Float temperature, Float humidity, Float pressure);

}
