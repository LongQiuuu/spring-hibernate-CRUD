package lab01.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lab01.dao.MemberDao;
import lab01.model.MemberBean;
import lab01.service.MemberService;
//Transactional讓spring 取代交易
@Transactional
@Service
public class MemberServiceHiberImpl implements MemberService {
	
	MemberDao memberDao = null;
	SessionFactory factory;
	
	@Autowired
	public MemberServiceHiberImpl(MemberDao memberDao, SessionFactory factory) {
		super();
		this.memberDao = memberDao;
		this.factory = factory;
	}

//	public MemberServiceHiberImpl() {
//		memberDao = new MemberHibernateDaoImpl();
//		factory =HibernateUtils.getSessionFactory();
//	}	

	public MemberBean findById(Integer id) {
		
		MemberBean memberBean =null;
		//Transactional 我啟動這個屬性後 就只需要打memberBean=memberDao.findById(id); 其他交易程式碼就可以註解掉了
//		Session session =factory.getCurrentSession();
//		Transaction tx =null;
//		
//		try {
//			
//			tx = session.beginTransaction();
			memberBean=memberDao.findById(id);
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		return memberBean;
	}
	
	
	public List<MemberBean> findAll() {
		List<MemberBean> memberBeans =new ArrayList<>();
		Session session =factory.getCurrentSession();
		Transaction tx =null;
		
//		try {
//			
//			tx = session.beginTransaction();
			memberBeans=memberDao.findAll();
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		
		return memberBeans;
	}

	
	public void save(MemberBean bean) {
		Session session =factory.getCurrentSession();
		Transaction tx =null;
		
//		try {
//			
//			tx = session.beginTransaction();
			memberDao.save(bean);
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		 
	}


	public void deleteById(Integer id) {
//		Session session =factory.getCurrentSession();
//		Transaction tx =null;
//		
//		try {
//			
//			tx = session.beginTransaction();
			memberDao.deleteById(id);
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		
	}

	@Override
	public boolean existsByMemberId(String memberId) {
		boolean exist=false;
//		Session session =factory.getCurrentSession();
//		Transaction tx =null;
//		
//		try {
//			
//			tx = session.beginTransaction();
			exist=memberDao.existsByMemberId(memberId);
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		
		return exist;
	}

	@Override
	public void update(MemberBean memberBean) {
//		Session session =factory.getCurrentSession();
//		Transaction tx =null;
//		
//		try {
//			
//			tx = session.beginTransaction();
			memberDao.update(memberBean);
//			tx.commit();
//			
//		}catch(Exception e) {
//			
//			if(tx!=null) {
//				
//				tx.rollback();
//			}
//			e.printStackTrace();
//			
//			throw new RuntimeException(e.getMessage());
//		}
		
		
	}
}