/***********************************************************************
 * Module:  Objet.java
 * Author:  HP Omen
 * Purpose: Defines the Class Objet
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Objet {
	@Id
   private Long idObjet;
   private String nomObjet;
   private String description;

}