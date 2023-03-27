package program.randit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import program.randit.entity.Article;
import program.randit.entity.dto.ArticleRequestDto;
import program.randit.entity.dto.ArticleResponseDto;
import program.randit.repository.ArticleRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Long save(ArticleRequestDto articleRequestDto){

        return articleRepository.save(articleRequestDto.toEntity()).getId();
    }

    public void update(Long id, ArticleRequestDto articleRequestDto){
        Article article = articleRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("존재하지 않는 게시물 입니다."));
        article.update(articleRequestDto.getContent(),articleRequestDto.getTitle());
    }

    public Long delete(Long id){
        Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 게시물 입니다."));
        articleRepository.delete(article);

        return id;
    }

    public Page<ArticleResponseDto> findAll(Pageable pageable){
        Page<Article> result = articleRepository.findAll(pageable);

        Page<ArticleResponseDto> map = result.map(ArticleResponseDto::new);

        return map;

    }



}
