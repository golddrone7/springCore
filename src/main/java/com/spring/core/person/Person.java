package com.spring.core.person;

import lombok.*;


@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
//@Data   // 실무는 절대 쓰면 안됨, 상황에 따라 몇개 필드는 빼고 ToString이 필요하고 Setter를 없애야 될 때도 있음
        // 즉 커스텀이 안됨, 실무에선 욕먹음
public class Person {
    private String nickName;
    private String address;
    private int age;

}
