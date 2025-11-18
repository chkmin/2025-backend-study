package com.example.shop.member.repository;

import com.example.shop.member.Member;

public interface MemberRepository {
    Member findById(Long id);
    List<Member> findAll();
    Member findByLoginId(String loginId);
    void save(Member member);
    void deleteById(Long id);
}
