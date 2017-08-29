/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import CAF.Models.PolicyModel;
import com.google.gson.Gson;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import CAF.Config.AppConfig;
import CAF.ErrorHandling.BadRequestException;
import CAF.Models.Services.PolicyService;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;

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
        String gson = new Gson().toJson(persons);
        return gson;
    }

    @ResponseBody
    @Async
    @RequestMapping(value = "/t2/{PolicyNo}", method = RequestMethod.GET, produces = "application/json")
    public String dgfsdfg(@PathVariable("PolicyNo") String PolicyNo) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolicyService polis = context.getBean(PolicyService.class);
        int PolisID = polis.findPolicyIDByPolicyNo(PolicyNo);
        String gson = new Gson().toJson(PolisID);
        return gson;
    }

    @ResponseBody
    @Async
    @RequestMapping(value = "/t3/{PolicyNo}", method = RequestMethod.GET, produces = "application/json")
    public String dfgds(@PathVariable("PolicyNo") String PolicyNo) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolicyService polis = context.getBean(PolicyService.class);
        String gson = new Gson().toJson(polis.findPolicyByPolicyNo(PolicyNo));
        return gson;
    }

    @ResponseBody
    @Async
    @RequestMapping(value = "/t4/{PolicyID}", method = RequestMethod.GET, produces = "application/json")
    public String dsfgsdf(@PathVariable("PolicyID") String PolicyID) throws Exception {
        String gson ;
        if(!StringUtils.isNumeric(PolicyID)){
            return new Gson().toJson("Format Data request salah");
        }
        int polisid = Integer.parseInt(PolicyID);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PolicyService polis = context.getBean(PolicyService.class);
        gson = new Gson().toJson(polis.findPolicyByPolicyID(polisid));
        return gson;
    }

    @RequestMapping(value = "/a", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String someMethod(@RequestBody String valueOne) {
        return valueOne;
        //do stuff with valueOne variable here
    }

    @ResponseBody
    @ExceptionHandler(IOException.class)
    public String handleIOException(IOException ex, HttpServletRequest request) {
        return "Dariaman : salah";
    }
}
