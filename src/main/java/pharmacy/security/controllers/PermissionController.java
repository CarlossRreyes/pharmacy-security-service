package pharmacy.security.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pharmacy.security.entities.Permission;
import pharmacy.security.entities.User;
import pharmacy.security.security.services.JwtServices;
import pharmacy.security.services.IPermissionService;
import pharmacy.security.services.IUserService;
import pharmacy.security.utils.RequestResponse;
import pharmacy.security.utils.ResponseMessage;

@RestController
@RequestMapping("/api/pharmacy-security/permission")
@RequiredArgsConstructor
public class PermissionController {

    @Autowired
    private JwtServices jwtServices;

    @Autowired
    private IPermissionService permissionService;

    @Autowired
    private IUserService userService;

    @GetMapping("/userAuthenticate")
    public ResponseEntity<?> getUserAuthenticate( @RequestHeader("Authorization") String authotizationHeader ){
        String token = authotizationHeader.replace( "Bearer ", "" ); 
        User user = new User();
        List<Permission> listPermission = new ArrayList<>();
        
        String email = jwtServices.extractUsername( token );
        try {
           user = userService.searchUserByEmail(email);
           System.out.println("Usuario: " + user.toString() );
           listPermission = permissionService.searchPermissionByIdUserType( user.getUserType().getId_user_type() );
        } catch (DataAccessException e) {
            return new ResponseEntity<RequestResponse>(
                new RequestResponse(false, ResponseMessage.ERROR_QUERY, e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()), null), 
                HttpStatus.INTERNAL_SERVER_ERROR
            );            
        }
        
        if( user == null || listPermission.size() == 0 || listPermission == null){
            return new ResponseEntity<RequestResponse>(
                new RequestResponse(false, ResponseMessage.NO_DATA_FOUND, "", null), 
                HttpStatus.NOT_FOUND
            );     
        }
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("user", user);
        mapa.put("permission", listPermission);
        return new ResponseEntity<RequestResponse>(
            new RequestResponse(true, ResponseMessage.DATA_SUCCESSFULLY_RECOVERED, "", mapa), 
            HttpStatus.OK
        );           
    }



    
}
