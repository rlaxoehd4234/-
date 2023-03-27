package program.randit.entity.dto;

import lombok.Builder;
import lombok.Getter;
import program.randit.entity.Article;

@Getter
public class ArticleRequestDto {

    String title;
    String content;

    @Builder
    public ArticleRequestDto(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Article toEntity(){
        return Article
                .builder()
                .content(content)
                .title(title)
                .build();

    }
}
