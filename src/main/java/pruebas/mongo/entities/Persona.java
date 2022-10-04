package pruebas.mongo.entities;


import org.springframework.data.annotation.Id;

public class Persona {

    @Id
    private String id;
    private String nombre;
    private Integer documento;
}
