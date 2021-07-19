package direct;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import utils.ConnectionFactory;
import utils.Constants;

import java.io.IOException;

public class MQ01 {
    public static void main(String[] args) throws IOException {
        Connection connection = ConnectionFactory.getConnection();
        Channel channel = connection.createChannel();
    }
}
