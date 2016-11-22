package org.hrSolution.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hrSolution.dao.CompanyDepartmentDao;
import org.hrSolution.model.CompanyDepartmentModel;
import org.hrSolution.service.CompanyDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Abhimanyu Baranwal
 *
 */

@Service("compDeptService")
@Transactional
public class CompanyDepartmentImpl implements CompanyDepartmentService {

	private static final Logger logger = LogManager.getLogger(CompanyDepartmentImpl.class);

	@Autowired
	CompanyDepartmentDao compDeptDao;

	/**
	 * This is the implementation class of Service class and it provides
	 * implementation of all method of service class.
	 * 
	 **/
	public Boolean addDepartment(CompanyDepartmentModel compDeptModel) {

		try {
			compDeptDao.saveDepartment(compDeptModel);
		} catch (Exception exception) {
			logger.debug("Exception occured " + exception);
			return false;
		}

		return true;
	}

}
