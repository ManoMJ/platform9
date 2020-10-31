package kr.co.dmtlabs.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.dmtlabs.platform.domain.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {

}
