package liga.medical.messageconsumer.service;

import liga.medical.messageconsumer.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {
    @RabbitListener(queues = RabbitConfig.DAILY_QUEUE_NAME)
    public void listenDailyQueue(String message) {
        System.out.println("Было получено сообщение: " + message + " источник - очередь: " + RabbitConfig.DAILY_QUEUE_NAME);
    }
    @RabbitListener(queues = RabbitConfig.ALERT_QUEUE_NAME)
    public void listenAlertQueue(String message) {
        System.out.println("Было получено сообщение: " + message + " источник - очередь: " + RabbitConfig.ALERT_QUEUE_NAME);
    }
    @RabbitListener(queues = RabbitConfig.ERROR_QUEUE_NAME)
    public void listenErrorQueue(String message) {
        System.out.println("Было получено сообщение: " + message + " источник - очередь: " + RabbitConfig.ERROR_QUEUE_NAME);
    }
}
