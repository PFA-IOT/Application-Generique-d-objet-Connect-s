package Emsi.MIAGE.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Publisher {
	
	public static void PublisherMqtt(String messages,String clientName) throws MqttException
	{ 
		 System.out.println("== START PUBLISHER ==");


		    MqttClient client = new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
		    client.connect();
		    MqttMessage message = new MqttMessage();
		    message.setPayload(messages.getBytes());
		    client.publish(clientName, message);

		    System.out.println("\tMessage '"+ messages +"' to "+clientName);

		    client.disconnect();

		    System.out.println("== END PUBLISHER ==");
	}
}
