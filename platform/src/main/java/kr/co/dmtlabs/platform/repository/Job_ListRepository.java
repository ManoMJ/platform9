package kr.co.dmtlabs.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.dmtlabs.platform.domain.Job_List;

@Repository
public interface Job_ListRepository extends JpaRepository<Job_List, String> {

}
