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
public class Chat {
    @Id
    @GeneratedValue
    @Column(name ="chat_id")
    private Long id;

}
