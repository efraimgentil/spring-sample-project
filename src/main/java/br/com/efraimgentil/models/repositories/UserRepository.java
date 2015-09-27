package br.com.efraimgentil.models.repositories;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.efraimgentil.models.User;

@Lazy(true)
public interface UserRepository extends JpaRepository<User, Integer> {

}
