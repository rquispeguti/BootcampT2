package repository;

import documentos.Transferencias;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransferenciasRepository extends MongoRepository<Transferencias, String> {
}
