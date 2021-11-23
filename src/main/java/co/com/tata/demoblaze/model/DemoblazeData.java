package co.com.tata.demoblaze.model;

public class DemoblazeData {

    private String usuarioRegistro;
    private String claveRegistro;
    private String usuario;
    private String clave;
    private String emailContacto;
    private String nombreContacto;
    private String mensaje;
    private String categoria;
    private String producto;

    public DemoblazeData(String usuarioRegistro, String claveRegistro, String usuario, String clave, String emailContacto, String nombreContacto, String mensaje, String categoria, String producto) {
        this.usuarioRegistro = usuarioRegistro;
        this.claveRegistro = claveRegistro;
        this.usuario = usuario;
        this.clave = clave;
        this.emailContacto = emailContacto;
        this.nombreContacto = nombreContacto;
        this.mensaje = mensaje;
        this.categoria = categoria;
        this.producto = producto;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public String getClaveRegistro() {
        return claveRegistro;
    }

    public void setClaveRegistro(String claveRegistro) {
        this.claveRegistro = claveRegistro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
