package program.randit.entity.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberUpdateDto {

    private String introduce;

    @Builder
    public MemberUpdateDto(String introduce){
        this.introduce = introduce;
    }
}
