package com.dsf.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsf.dao.IBranchDao;
import  com.dsf.model.Branch;
import  com.dsf.service.IBranchService;

@Service
public class BranchService implements IBranchService {
	@Autowired
	private IBranchDao branchDao;
	
	@Override
	public List<Branch> list() {
		return branchDao.list();
	}
}
