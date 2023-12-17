package pharmacy.security.services.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pharmacy.security.entities.User;
import pharmacy.security.repositories.IUserRepository;
import pharmacy.security.services.IUserService;

@Service
public class IUserServiceImpl implements IUserService  {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User searchUserByEmail(String email) {
        return userRepository.searchUserByEmail(email);
    }

  
}
