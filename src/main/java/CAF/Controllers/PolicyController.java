/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import CAF.Config.AppConfig;
import CAF.Models.Services.PolicyService;
import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author dariaman.siagian
 */
@RestController
public class PolicyController {

    @ResponseBody
    @Async
    @RequestMapping(value = "/GetPolicyIDByPolicyNo/{PolicyNo}", method = RequestMethod.GET, produces = "application/json")
    public String GetPolicyByID(@PathVariable("PolicyNo") String PolicyNo) {
        String polisno = PolicyNo.replaceAll("[^0-9]", "");

        return new Gson().toJson(polisno);
    }

    @ResponseBody
    @Async
    @RequestMapping(value = "/update_polis_by_polisno_json", method = RequestMethod.POST,
            consumes="application/json",
            produces = "application/json")
    public String UpdatePolisByPolisNo(HttpServletRequest request,
            @RequestParam(value="PolicyID", required=false) String PolicyID, 
            @RequestParam(value="CCNo", required=false) String CCNo) {

//        String polis_no = PolicyNo.replaceAll("[^0-9]", "");
//        
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        PolicyService polisServ = context.getBean(PolicyService.class);
//        String gson = new Gson().toJson(polisServ.findPolicyByPolicyNo(polis_no));
        return new Gson().toJson("dariaman 1");
    }

}
