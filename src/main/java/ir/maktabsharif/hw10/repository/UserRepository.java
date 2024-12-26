package ir.maktabsharif.hw10.repository;

import ir.maktabsharif.hw10.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User,Long>{

    List<User> findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username, String password);
}
