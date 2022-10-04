package pruebas.mongo.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pruebaaaa")
public class Persona {

    @Id
    private String id;
    private String nombre;
    private Integer documento;

    public Persona(String nombre, Integer documento) {
        this.nombre = nombre;
        this.documento = documento;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return this.documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
}
