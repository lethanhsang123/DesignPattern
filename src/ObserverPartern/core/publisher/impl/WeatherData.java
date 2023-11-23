package ObserverPartern.core.publisher.impl;

import ObserverPartern.core.subscriber.Receiver;
import ObserverPartern.core.publisher.Sender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeatherData implements Sender {

    private List<Receiver> receivers;

    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherData() {
        this.receivers = new ArrayList<>();
        this.temperature = 30F;
        this.humidity = 31F;
        this.pressure = 32F;
    }

    @Override
    public void registerSender(Receiver receiver) {
        if (this.receivers == null) {this.receivers = new ArrayList<>();}
        this.receivers.add(receiver);
    }

    @Override
    public void registerSender(Receiver... receivers) {
        if (this.receivers == null) {this.receivers = new ArrayList<>();}
        this.receivers.addAll(Arrays.asList(receivers));
    }

    @Override
    public void removeSender(Receiver receiver) {
        if (this.receivers != null && this.receivers.size() > 0) {
            this.receivers.remove(receiver);
        }
    }

    @Override
    public void removeSender(Receiver... receivers) {
        if (this.receivers != null && this.receivers.size() > 0) {
            Arrays.stream(receivers).forEach(receiver -> this.receivers.remove(receiver));
        }
    }

    @Override
    public void notification() {
        if (this.receivers != null && this.receivers.size() > 0) {
            System.out.println("Notification......");
            receivers.forEach(receiver -> receiver.update(temperature, humidity, pressure));
        }
    }

    @Override
    public void changeData(Float temperature, Float humidity, Float pressure) {
        if (temperature != null) { this.temperature = temperature; }
        if (humidity != null) { this.humidity = humidity; }
        if (pressure != null) { this.pressure = pressure; }
        this.notification();
    }
}
