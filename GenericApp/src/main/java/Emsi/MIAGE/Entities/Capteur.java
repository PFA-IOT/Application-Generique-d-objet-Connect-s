/***********************************************************************
 * Module:  Capteur.java
 * Author:  HP Omen
 * Purpose: Defines the Class Capteur
 ***********************************************************************/
package Emsi.MIAGE.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Capteur {
	@Id
   private Long idCapteur;
   private String nomCapteur;
   private String nomConstructeur;
   private String typeSignale;
   private int realTimeSignal;
   private int batteryLife;

}