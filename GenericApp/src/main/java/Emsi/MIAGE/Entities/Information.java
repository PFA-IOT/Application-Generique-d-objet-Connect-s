/***********************************************************************
 * Module:  Information.java
 * Author:  HP Omen
 * Purpose: Defines the Class Information
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
public class Information {
	@Id
   private Long idInfo;
   private String entireFrame;
   private int control;
   private int lenght;
   private int protocalName;
   private int protocalLevel;
   private int connectFlags;
   private int keepAlive;
   private int clientId;

}