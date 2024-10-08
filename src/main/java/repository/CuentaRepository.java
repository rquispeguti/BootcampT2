package repository;

import documentos.Cuentas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentaRepository extends MongoRepository<Cuentas, String> {

}
