package ObserverPartern.core.subscriber.impl;

import ObserverPartern.core.business.BusinessDisplay;
import ObserverPartern.core.subscriber.Receiver;

public class StatisticsDisplay implements Receiver, BusinessDisplay {
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public StatisticsDisplay() {
        this.temperature = 0F;
        this.humidity = 0F;
        this.pressure = 0F;
    }

    @Override
    public void show() {
        System.out.println(String.format("STATISTICS DISPLAY\nTemperature: %s\nHumidity: %s\nPressure:%s ", temperature, humidity, pressure));
    }

    @Override
    public void update(Float temperature, Float humidity, Float pressure) {
        if (temperature != null) { this.temperature = temperature; }
        if (humidity != null) { this.humidity = humidity; }
        if (pressure != null) { this.pressure = pressure; }
    }
}
