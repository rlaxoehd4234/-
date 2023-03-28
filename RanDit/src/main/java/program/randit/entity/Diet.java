package program.randit.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Diet {
    @Id @Column(name = "diet_id")
    @GeneratedValue
    private Long id;

    private String Date;

    private String content;



}
