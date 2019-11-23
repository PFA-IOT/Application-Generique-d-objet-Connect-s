/***********************************************************************
 * Module:  DocumentSpecifique.java
 * Author:  HP Omen
 * Purpose: Defines the Class DocumentSpecifique
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
public class DocumentSpecifique {
	@Id
   private Long idDocumentation;
   private String description;

}