package pharmacy.security.services.servicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pharmacy.security.entities.Menu;
import pharmacy.security.repositories.IMenuRepository;
import pharmacy.security.services.IMenuService;

@Service
public class IMenuServiceImpl implements IMenuService {

    @Autowired
    private IMenuRepository menuRepository;

    @Override
    public List<Menu> searchMenuByIdMenuParent() {
        return menuRepository.searchMenuByIdMenuParent();
    }

    @Override
    public List<Menu> searchMenuByIdMenuParentId( Integer id_menu_parent ) {
        return menuRepository.searchMenuByIdMenuParentId( id_menu_parent );
    }

    

    
}
