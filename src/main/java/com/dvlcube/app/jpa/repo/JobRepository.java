package com.dvlcube.app.jpa.repo;

import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;
import com.dvlcube.app.manager.data.JobBean;
import com.dvlcube.app.manager.data.SkillBean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @since 17 de mar de 2021
 * @author Danilo Ferreira
 */
@Repository
public interface JobRepository extends DvlRepository<JobBean, Long>, BasicRepository<JobBean, Long> {

}
