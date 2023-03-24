package program.randit.entity.dto;

import lombok.Builder;
import program.randit.entity.Member;

public class MemberRequestDto {

    private String name;
    private Long studentNumber;
    private String introduce;

    @Builder
    public MemberRequestDto(String name, Long studentNumber, String introduce){
        this.name = name;
        this.studentNumber = studentNumber;
        this.introduce = introduce;

    }

    public Member toEntity(){
        return Member
                .builder()
                .name(name)
                .studentNumber(studentNumber)
                .introduce(introduce)
                .build();

    }

}
