package com.dsf.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dsf.dao.IBranchDao;
import com.dsf.model.Branch;

@Repository
public class BranchDao extends SqlSessionDaoSupport implements IBranchDao {

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	};

	@Override
	public List<Branch> list() {
		return getSqlSession().getMapper(IBranchDao.class).list();
	}

}
