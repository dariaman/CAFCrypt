/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Services;

import CAF.Models.PolicyModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author dariaman.siagian
 */

public interface PolicyService {
    List<PolicyModel> listPolicy();
}
