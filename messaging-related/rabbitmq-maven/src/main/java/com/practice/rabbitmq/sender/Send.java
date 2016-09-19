package com.practice.rabbitmq.sender;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created by rbhogati on 15/9/16.
 */
public class Send {
    private static final String QUEUE_NAME = "practice.rabbitmq.hello";
    public static void main(String args[]){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("172.17.0.3");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        Connection connection = null;
        Channel channel = null;
        try {
            connection = connectionFactory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME, true, false,false, null);
            String message = "Hello World! Hi Ramakrishna. ";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
            System.out.println(" [X] Sent '"+message+"'");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                channel.close();
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
