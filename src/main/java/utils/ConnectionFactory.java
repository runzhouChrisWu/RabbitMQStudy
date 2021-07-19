package utils;

import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionFactory {
    private static Connection connection;

    static{
        try {
            com.rabbitmq.client.ConnectionFactory factory = new com.rabbitmq.client.ConnectionFactory();
            factory.setHost(Constants.HOST);
            factory.setPort(Constants.PORT);
            factory.setUsername(Constants.USERNAME);
            factory.setPassword(Constants.PASSWORD);
            factory.setVirtualHost(Constants.VIRTUAL_HOST);
            connection = factory.newConnection();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
