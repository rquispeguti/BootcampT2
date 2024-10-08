package documentos;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document (collection = "Cuenta")
public class Cuentas {
    @Id
    private String id;
    private String ctaid;
    private String saldo;

    public Cuentas(String id, String ctaid, String saldo) {
        this.id = id;
        this.ctaid = ctaid;
        this.saldo = saldo;
    }

    public Cuentas() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCtaid() {
        return ctaid;
    }

    public void setCtaid(String ctaid) {
        this.ctaid = ctaid;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
