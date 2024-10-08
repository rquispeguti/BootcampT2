package Controller;

import documentos.Cuentas;
import documentos.Transferencias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.TransferenciasRepository;

import javax.xml.crypto.dsig.TransformService;
import java.util.List;

@RestController
@RequestMapping ("/api/Transferencia")

public class TransferenciasController {

    @Autowired
    private TransferenciasRepository transferenciasRepository;

    @PostMapping("/Deposito")
    public  ResponseEntity<?> saveDeposito(@ResponseBody Transferencias transferencias){
        Transferencias saveDep =  transferenciasRepository.save(transferencias);
        return new ResponseEntity<Transferencias>(saveDep, HttpStatus.OK);
    }

    @PostMapping("/Retiro")
    public ResponseEntity<?> saveRetiro(@RequestBody Transferencias transferencias) {
        Transferencias saveRet = transferenciasRepository.save(transferencias);
        return new ResponseEntity<Transferencias>(saveRet, HttpStatus.OK);
    }

    @PostMapping("/Transferencia")
    public ResponseEntity<?> saveTransfer(@RequestBody Transferencias transferencias) {
        Transferencias saveTransfer = transferenciasRepository.save(transferencias);
        return new ResponseEntity<Transferencias>(saveTransfer, HttpStatus.OK);
    }

    @GetMapping ("/Historial")
    public ResponseEntity<?> findUsuario(){
        List<Transferencias> transferencias = transferenciasRepository.findAll();
        return new ResponseEntity<List<Transferencias>>(transferencias, HttpStatus.OK);
    }
}
