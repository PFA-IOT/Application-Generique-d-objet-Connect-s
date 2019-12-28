package Emsi.MIAGE.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;


public class Subsciber {
	
	public static void SubscriberMqtt(String clientName) throws MqttException {
		
	
	 System.out.println("== START SUBSCRIBER ==");

	    MqttClient client=new MqttClient("tcp://localhost:1883", MqttClient.generateClientId());
	    client.setCallback( new SimpleMqttCallBack() );
	    client.connect();

	    client.subscribe(clientName);
	    
	}

}
