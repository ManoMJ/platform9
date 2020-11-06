package kr.co.dmtlabs.platform.service;

import kr.co.dmtlabs.platform.domain.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface ProjectService {
    Page<Project> findProjectList(Pageable pageable);
    Project findProjectByIdx(String Project_Code);
}
