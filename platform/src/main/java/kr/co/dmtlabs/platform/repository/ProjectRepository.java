package kr.co.dmtlabs.platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.dmtlabs.platform.domain.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

}
