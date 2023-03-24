package program.randit.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id @Column(name ="member_id")
    @GeneratedValue
    private Long id;

    private String name;

    private Long studentNumber;

    private String email;

    private String introduce;

    @Builder
    public Member(String name, Long studentNumber, String email, String introduce){
        this.name = name;
        this.studentNumber = studentNumber;
        this.email = email;
        this.introduce = introduce;
    }

    public void update(String introduce){
        this.introduce = introduce;
    }
}
