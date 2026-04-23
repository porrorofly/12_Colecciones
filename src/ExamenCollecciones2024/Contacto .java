package ExamenCollecciones2024;

import java.util.Objects;


// --- CLASE CONTACTO ---
class Contacto {
    private String nombre;
    private Integer telefono;

    public Contacto(String nombre, Integer telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res=false;
        if(this.getNombre().equals(((Contacto)obj).getNombre())){
            res=true;
        }
        
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}

