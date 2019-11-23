/***********************************************************************
 * Module:  Axe.java
 * Author:  HP Omen
 * Purpose: Defines the Class Axe
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
public class Axe {
	@Id
   private Long idAxe;
   private String informationSupp;

}