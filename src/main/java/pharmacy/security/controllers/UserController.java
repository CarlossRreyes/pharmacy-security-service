package pharmacy.security.controllers;




import java.util.Map;

// import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

// import pharmacy.security.security.services.JwtServices;
// import pharmacy.security.services.IPermissionService;
// import pharmacy.security.services.IUserService;



@RestController
@RequestMapping("/api/pharmacy-security/user")
@RequiredArgsConstructor
public class UserController {

    // @Autowired
    // private JwtServices jwtServices;

    // @Autowired
    // private IPermissionService permissionService;

    // @Autowired
    // private IUserService userService;


    // @PostMapping("/userAuthenticate")
    // public ResponseEntity<?> getUserAuthenticate(@RequestBody Map<String, String> token ){

    //     RequestResponse response = new RequestResponse();
    //     User user = new User();
    //     List<Permission> listPermission = new ArrayList<>();
        
    //     String email = jwtServices.extractUsername( token.get("token") );
    //     try {
    //        user = userService.searchUserByEmail(email);
    //        listPermission = permissionService.searchPermissionByIdUserType( user.getUserType().getId_user_type() );
    //     } catch (DataAccessException e) {
    //         response.setError(e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));  
    //         response.setMessage(ResponseMessage.ERROR_QUERY);  
    //         return new ResponseEntity<RequestResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);            
    //     }
        
    //     if( user == null || listPermission.size() == 0 || listPermission == null){
    //         response.setMessage(ResponseMessage.NO_DATA_FOUND);  
    //         return new ResponseEntity<RequestResponse>(response, HttpStatus.NOT_FOUND);     
    //     }
    //     Map<String, Object> mapa = new HashMap<>();
    //     mapa.put("user", user);
    //     mapa.put("´permission", listPermission);
    //     response.setMessage(ResponseMessage.DATA_SUCCESSFULLY_RECOVERED);
    //     response.setStatus(true);
    //     response.setData(mapa);
    //     return new ResponseEntity<RequestResponse>(response, HttpStatus.OK);   

        
    // }

    @PostMapping("/test")
    public ResponseEntity<?> test( @RequestBody Map<String, String> token ){
        System.out.println("TOKEN: " + token.get("token"));
        // String present = token;
        return new ResponseEntity<String>("Holaaa", HttpStatus.OK );
    }

    
}
