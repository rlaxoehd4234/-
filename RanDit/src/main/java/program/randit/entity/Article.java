package program.randit.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Article {

    @Id @Column(name = "Article_id")
    @GeneratedValue
    Long id;

    String content;

    String title;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;



}
