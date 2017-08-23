/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Crypt;

import javax.crypto.BadPaddingException;
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
public class DecryptController {
    @RequestMapping(value = "/tesD", method=RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String testString() throws Exception
    {
        return "dariaman";
    }
    
    @RequestMapping(value = "/Decrypt/{CipherText}", method=RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public String DecString(@PathVariable("CipherText") String CipherText) throws Exception
    {
        try{
            String PlainText = new TripleDES().decrypt3DES(CipherText);
            return JSONObject.quote(PlainText);
        }catch(BadPaddingException bpe){
            return JSONObject.quote("Wrong Key");
        }
    }
}
