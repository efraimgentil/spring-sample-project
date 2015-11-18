package br.com.efraimgentil.repositories;

import br.com.efraimgentil.models.User;
import java.lang.Integer;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Lazy(true)
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
}