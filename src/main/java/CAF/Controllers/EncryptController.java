/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Controllers;

import CAF.Crypt.TripleDES;
import org.json.JSONObject;
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
public class EncryptController {
    
    @RequestMapping(value = "/tes", method=RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String TestString() throws Exception
    {
        return "dariaman";
    }
    
    @RequestMapping(value = "/Encrypt/{PlainText}", method=RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String EncString(@PathVariable("PlainText") String PlainText) throws Exception
    {
        String ChiperText = new TripleDES().encrypt3DES(PlainText);
        return JSONObject.quote(ChiperText);
    }
    
    @RequestMapping(value = "/ReadPostCCJson", method=RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public String EncryptPostString() throws Exception
    {
        return JSONObject.quote("");
    }
    
}
