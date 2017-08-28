/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import CAF.Models.Dao.PolicyDaoImpl;
import CAF.Models.PolicyModel;
import com.google.gson.Gson;
import java.util.List;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import CAF.Config.AppConfig;
import CAF.Models.Services.PolicyService;

/**
 *
 * @author DJ
 */
@RestController
public class TesController {

    @ResponseBody
    @Async
    @RequestMapping(value = "/t1", method = RequestMethod.GET, produces = "application/json")
    public String asfdString() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolicyService polis = context.getBean(PolicyService.class);
        List<PolicyModel> persons = polis.listPolicy();

//        List<PolicyModel> lst;
//        lst= polisDao.getListUser();
        String gson = new Gson().toJson(persons);
//        return gson;
        return gson;
    }

    @RequestMapping(value = "/a", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String someMethod(@RequestBody String valueOne) {
        return valueOne;
        //do stuff with valueOne variable here
    }
}
