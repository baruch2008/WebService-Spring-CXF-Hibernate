package com.baruch.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.baruch.dao.IBookDao;
import com.baruch.model.Book;
import com.baruch.util.DBOperationUtil;

public class BookDaoImpl implements IBookDao {
	private Log logger = LogFactory.getLog(BookDaoImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getBooks() {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query<Book> query = session.createQuery("from Book");
			List<Book> results = query.getResultList();
			return results;
		} catch (Exception e) {
			logger.error("Getting books failed.", e);
		} finally {
			DBOperationUtil.closeSession(session);
		}
		return new ArrayList<Book>();
	}

	@Override
	public Book getBookByISBN(String isbn) {
		return null;
	}

	@Override
	public Book getBookByName(String name) {
		return null;
	}

	@Override
	public void addBook(Book book) {

	}

	@Override
	public void modifyBook(Book book) {

	}

	@Override
	public void deleteBookByISBN(String isbn) {

	}
}
