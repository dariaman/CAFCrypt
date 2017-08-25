/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import CAF.Hibernate.HibernateUtil;
import CAF.Models.Dao.PolicyDao;
import CAF.Models.Dao.PolicyDaoImpl;
import CAF.Models.PolicyModel;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DJ
 */
@RestController
public class TesController {
    
    @ResponseBody
    @Async
    @RequestMapping(value = "/t1", method = RequestMethod.GET, produces = "application/json")
    public List<PolicyModel> asfdString() throws Exception {
//        SessionFactory sessFact = HibernateUtil.getSessionFactory();
//        Session session = sessFact.getCurrentSession();
//        org.hibernate.Transaction tr = session.beginTransaction();
//
//        CriteriaQuery cq = session.getCriteriaBuilder().createQuery(PolicyModel.class);
//        cq.from(PolicyModel.class);
//        List PolisList = session.createQuery(cq).getResultList();
//
//        tr.commit();
////	sessFact.close();

List<PolicyModel> lst = PolicyDao.getListUser();

        return null;
    }

    @RequestMapping(value = "/a",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public String someMethod(@RequestBody String valueOne) {
        return valueOne;
        //do stuff with valueOne variable here
    }
}
