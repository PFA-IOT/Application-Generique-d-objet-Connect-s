/***********************************************************************
 * Module:  TypeCapteur.java
 * Author:  HP Omen
 * Purpose: Defines the Class TypeCapteur
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
public class TypeCapteur {
	@Id
   private Long typeCapteur;
   private String libelle;

}