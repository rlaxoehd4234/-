package program.randit.entity.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import program.randit.entity.Article;

@Getter
@NoArgsConstructor
public class ArticleResponseDto {

    String title;
    String content;


    public ArticleResponseDto(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }




}
