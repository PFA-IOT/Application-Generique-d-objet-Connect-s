package emsi.miage.groupe2.eCommerce.domaine;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class TypeArticleVo {
   private Long idTypeArticle;
   private String libelle;
   private List<ArticleVo> articles;

}