/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Dao;

import CAF.Models.PolicyModel;
import java.util.List;

/**
 *
 * @author dariaman.siagian
 */
public interface PolicyDao {
    public List<PolicyModel> getListUser();    
//    public void saveOrUpdate(PolicyModel PolicyM);
//    public void deleteUser(int id);
    public PolicyModel findUserById(int id);    
}
