/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Hibernate;

import CAF.Models.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONObject;
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

    @RequestMapping(value = "/t", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Employee> asfdString() throws Exception {
        SessionFactory sessFact = HibernateUtil.getSessionFactory();
	Session session = sessFact.getCurrentSession();
	org.hibernate.Transaction tr = session.beginTransaction();
	
	CriteriaQuery cq = session.getCriteriaBuilder().createQuery(Employee.class);
	cq.from(Employee.class);
	List employeeList = session.createQuery(cq).getResultList();

	tr.commit();
	sessFact.close();

        return (employeeList);
    }
}
