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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
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
    @PersistenceContext
   private EntityManager em;
    
    @ResponseBody
    @Async
    @RequestMapping(value = "/t1", method = RequestMethod.GET, produces = "application/json")
    public List<PolicyModel> asfdString() throws Exception {

        return null;
    }

    @RequestMapping(value = "/a",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public String someMethod(@RequestBody String valueOne) {
        return valueOne;
        //do stuff with valueOne variable here
    }
}
