/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import com.google.gson.Gson;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dariaman.siagian
 */
@RestController
public class PolicyController {
    
    @ResponseBody
    @Async
    @RequestMapping(value = "/GetPolicyIDByPolicyNo/{PolicyNo}", method = RequestMethod.GET, produces = "application/json")
    public String GetPolicyByID(@PathVariable("PolicyNo") String PolicyNo){
        String polisno = PolicyNo.replaceAll("[^0-9]", "");
        
        return new Gson().toJson(polisno);
    }
    
}
