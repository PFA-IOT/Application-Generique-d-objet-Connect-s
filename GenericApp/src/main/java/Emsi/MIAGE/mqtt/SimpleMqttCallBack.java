package Emsi.MIAGE.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class SimpleMqttCallBack implements MqttCallback {
	
	public void connectionLost(Throwable throwable) {
	    System.out.println("Connection to MQTT broker lost!");
	  }

	  public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
		  System.out.println("---------------------------------------------------------");
		  System.out.println();
	    System.out.println("Message received:\t"+ new String(mqttMessage.getPayload()) );
	    System.out.println("Destinataire est  : \t"+s);
	    System.out.println();
		  System.out.println("---------------------------------------------------------");

	    
	  }

	  public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
	  }

}
