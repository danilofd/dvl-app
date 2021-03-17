package com.dvlcube.app.rest;

import com.dvlcube.app.interfaces.MenuItem;
import com.dvlcube.app.jpa.repo.JobRepository;
import com.dvlcube.app.jpa.repo.SkillRepository;
import com.dvlcube.app.manager.data.JobBean;
import com.dvlcube.app.manager.data.SkillBean;
import com.dvlcube.app.manager.data.vo.MxRestResponse;
import com.dvlcube.utils.interfaces.MxService;
import com.dvlcube.utils.interfaces.rest.MxFilterableBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.dvlcube.app.manager.data.e.Menu.CONFIGURATION;

/**
 * @since 17 de mar de 2021
 * @author Danilo Ferreira
 */
@RestController
@MenuItem(value = CONFIGURATION)
@RequestMapping("${dvl.rest.prefix}/jobs")
public class JobService {

	@Autowired
	private JobRepository repo;

	@GetMapping
	public Iterable<JobBean> get(@RequestParam Map<String, String> params) {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public Optional<JobBean> get(@PathVariable Long id) {
		return repo.findById(id);
	}

	@PostMapping
	public MxRestResponse post(@Valid @RequestBody JobBean body) {
		JobBean save = repo.save(body);
		return GenericRestResponse.ok(save.getId());
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repo.deleteById(id);
	}
}
