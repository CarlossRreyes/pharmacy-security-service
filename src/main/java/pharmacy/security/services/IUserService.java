package pharmacy.security.services;

import pharmacy.security.entities.User;

public interface IUserService {

    public User searchUserByEmail( String email );
}
