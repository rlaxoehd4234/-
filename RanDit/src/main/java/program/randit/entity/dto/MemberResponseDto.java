package program.randit.entity.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;


public class MemberResponseDto {

    String name;
    Long studentNumber;
    String Email;

    @QueryProjection
    public MemberResponseDto(String name, Long studentNumber, String email) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.Email = email;
    }
}
