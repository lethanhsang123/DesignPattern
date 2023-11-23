package ObserverPartern;

import ObserverPartern.core.publisher.Sender;
import ObserverPartern.core.publisher.impl.WeatherData;
import ObserverPartern.core.subscriber.impl.CurrentCondition;
import ObserverPartern.core.subscriber.impl.ForecastDisplay;
import ObserverPartern.core.subscriber.impl.StatisticsDisplay;

public class Main {

    public static void main(String[] args) {
        // before
        Sender sender = new WeatherData();
        CurrentCondition receiver1 = new CurrentCondition();
        ForecastDisplay receiver2 = new ForecastDisplay();
        StatisticsDisplay receiver3 = new StatisticsDisplay();
        receiver1.show();
        receiver2.show();
        receiver3.show();
        System.out.println("======================================");
        sender.registerSender(receiver1, receiver2, receiver3);
        sender.notification();
        receiver1.show();
        receiver2.show();
        receiver3.show();
        System.out.println("========================================");
        // after
        sender.changeData(12F, 11F, 0F);
        receiver1.show();
        receiver2.show();
        receiver3.show();
    }

}
