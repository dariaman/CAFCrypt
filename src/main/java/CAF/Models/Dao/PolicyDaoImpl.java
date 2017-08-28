/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Dao;

import CAF.Models.PolicyModel;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

/**
 *
 * @author dariaman.siagian
 */
public class PolicyDaoImpl implements PolicyDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<PolicyModel> getListPolicy() {
        CriteriaQuery<PolicyModel> criteriaQuery = em.getCriteriaBuilder().createQuery(PolicyModel.class);
        @SuppressWarnings("unused")
        Root<PolicyModel> root = criteriaQuery.from(PolicyModel.class);
        return em.createQuery(criteriaQuery).getResultList();

    }

//    @Override
//    public PolicyModel findUserById(int id) {
//        return null;
//    }

}
