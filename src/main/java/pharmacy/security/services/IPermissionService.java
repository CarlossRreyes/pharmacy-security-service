package pharmacy.security.services;

import java.util.List;

// import org.springframework.stereotype.Service;

import pharmacy.security.entities.Permission;


public interface IPermissionService {

    public List<Permission> searchPermissionByIdUserType( Integer id_user_type );
    
}
