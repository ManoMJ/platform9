package kr.co.dmtlabs.platform.repository;

import kr.co.dmtlabs.platform.domain.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

}
