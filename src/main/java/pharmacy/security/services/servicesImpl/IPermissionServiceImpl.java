package pharmacy.security.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pharmacy.security.entities.Menu;
import pharmacy.security.entities.Permission;
import pharmacy.security.repositories.IPermissionRepository;
import pharmacy.security.services.IMenuService;
import pharmacy.security.services.IPermissionService;
@Service
public class IPermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionRepository permissionRepository;

    @Autowired
    private IMenuService menuService;

    @Override
    public List<Permission> searchPermissionByIdUserType(Integer id_user_type) {
        // return this.permissionRepository.searchPermissionByIdUserType(id_user_type);
        List<Permission> listPermission = this.permissionRepository.searchPermissionByIdUserType(id_user_type);
        
        for (Permission p : listPermission) {            
            List<Menu> listaMenuParentByChild = menuService.searchMenuByIdMenuParentId( p.getMenu().getId_menu() );
            p.getMenu().setChild(listaMenuParentByChild);       
                 
        }
        return listPermission;
    }
    
}
