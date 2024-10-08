package documentos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@Document(collection = "Transferencias")

public class Transferencias {
    @Id
    private String id;
    private String monto;
    private String fecha;
    private String ctaOrigen;
    private String ctaDestino;
    private String tipo;

    public Transferencias(String id, String monto, String fecha, String ctaOrigen, String ctaDestino, String tipo) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.ctaOrigen = ctaOrigen;
        this.ctaDestino = ctaDestino;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCtaOrigen() {
        return ctaOrigen;
    }

    public void setCtaOrigen(String ctaOrigen) {
        this.ctaOrigen = ctaOrigen;
    }

    public String getCtaDestino() {
        return ctaDestino;
    }

    public void setCtaDestino(String ctaDestino) {
        this.ctaDestino = ctaDestino;
    }
}
