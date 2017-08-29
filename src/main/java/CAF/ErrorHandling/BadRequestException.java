/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.ErrorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author dariaman.siagian
 */
@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Bad Request")
public class BadRequestException extends RuntimeException{
    
}
