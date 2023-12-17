package pharmacy.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pharmacy.security.entities.User;




public interface IUserRepository extends JpaRepository<User, Integer> {


    // Optional<User> findOneByEmail( String email );
    

    // Optional<User> findByUsername(String email);

    @Query(" SELECT u from User u WHERE u.state = 'A' AND u.email = ?1 ")
    public User searchUserByEmail( String email );

}
