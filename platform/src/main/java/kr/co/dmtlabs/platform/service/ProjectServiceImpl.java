package kr.co.dmtlabs.platform.service;

import kr.co.dmtlabs.platform.domain.Project;
import kr.co.dmtlabs.platform.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Page<Project> findProjectList(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1, pageable.getPageSize());
        return projectRepository.findAll(pageable);
    }

    @Override
    public Project findProjectByIdx(String Project_Code) {
        return projectRepository.findById(Project_Code).orElse(new Project());
    }
}
