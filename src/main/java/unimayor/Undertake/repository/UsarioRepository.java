package unimayor.Undertake.repository;

import unimayor.Undertake.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    // Métodos personalizados (opcional)
    Usuario findByEmail(String email);
}
