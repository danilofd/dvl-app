package com.dvlcube.app.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvlcube.app.manager.data.SkillBean;
import com.dvlcube.app.jpa.BasicRepository;
import com.dvlcube.app.jpa.DvlRepository;

import java.util.List;

/**
 * @since 4 de jun de 2019
 * @author Ulisses Lima
 */
@Repository
public interface SkillRepository extends DvlRepository<SkillBean, Long>, BasicRepository<SkillBean, Long>, JpaRepository<SkillBean, Long> {

    List<SkillBean> findAllByName(String name);
}
