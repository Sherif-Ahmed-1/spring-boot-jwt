package murraco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import murraco.model.LoginResponse;

@Repository
public interface JwtRepository extends CrudRepository<LoginResponse, String> {

}
