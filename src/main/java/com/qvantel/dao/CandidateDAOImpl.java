package com.qvantel.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.qvantel.model.Candidate;


@Repository
public class CandidateDAOImpl extends HibernateDAOImpl<Candidate, Integer> implements CandidateDAO {
	@Autowired
	public CandidateDAOImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory, Candidate.class);
	}
}
