/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Services;

import CAF.Models.Dao.PolicyDao;
import CAF.Models.PolicyModel;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dariaman.siagian
 */
@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyDao Polis;

    @Transactional(readOnly = true)
    @Override
    public List<PolicyModel> listPolicy() {
        return Polis.getListPolicy();
    }

    @Override
    public int findPolicyIDByPolicyNo(String PolicyNo) {
        return Polis.findPolicyIDByPolicyNo(PolicyNo);
    }

    @Override
    public PolicyModel findPolicyByPolicyNo(String PolicyNo) {
        return Polis.findPolicyByPolicyNo(PolicyNo);
    }

    @Override
    public PolicyModel findPolicyByPolicyID(int PolicyID) {
        return Polis.findPolicyByPolicyID(PolicyID);
    }

}
