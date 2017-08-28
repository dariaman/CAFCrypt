/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Dao;

import CAF.Hibernate.HibernateUtil;
import CAF.Models.PolicyModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author dariaman.siagian
 */
public class PolicyDaoImpl implements PolicyDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<PolicyModel> getListUser() {
        Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    
    List<PolicyModel> result = (List<PolicyModel>) session.createNativeQuery("SELECT * FROM `policy`").getSingleResult();
    
    session.getTransaction().commit();
    session.close();
//        SessionFactory sess = HibernateUtil.getSessionFactory();
//        Session session;
//        session = HibernateUtil.getSessionFactory().openSession();
//        Criteria crit = session.createCriteria(PolicyModel.class);
//        crit.setMaxResults(50);
//        List cats = crit.list();
        return result;
    }

    @Override
    public PolicyModel findUserById(int id) {
        return (PolicyModel) getSession().get(PolicyModel.class, id);
    }

}
