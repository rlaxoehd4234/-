package program.randit.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import program.randit.entity.Member;
import program.randit.entity.dto.MemberRequestDto;
import program.randit.entity.dto.MemberUpdateDto;
import program.randit.repository.MemberRepository;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    //member register
    public Long save(MemberRequestDto memberRequestDto){
        return memberRepository.save(memberRequestDto.toEntity()).getId();
    }


    //member information update
    public void update(Long id, MemberUpdateDto updateDto){
        Member member = memberRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("멤버가 존재하지 않습니다."));
        member.update(updateDto.getIntroduce());
    }


    public Long delete(Long id){
       Member findMember = memberRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("존재하지 않는 회원입니다."));

       memberRepository.delete(findMember);

       return id;
    }


}
