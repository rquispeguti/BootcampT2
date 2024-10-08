package Controller;

import documentos.Cuentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.CuentaRepository;

import java.util.List;

@RestController
@RequestMapping ("/api/Cuenta")

public class UsuariosController {

    @Autowired
    private CuentaRepository cuentaRepository;

    @PostMapping
    public ResponseEntity<?> saveCuenta(@RequestBody Cuentas cuenta) {
        Cuentas ctasave = cuentaRepository.save(cuenta);
        return new ResponseEntity<Cuentas>(ctasave, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAllCuentas(){
        List<Cuentas> cuentasList = cuentaRepository.findAll();
        return new ResponseEntity<List<Cuentas>>(cuentasList, HttpStatus.OK);
    }



}
