/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 *
 * @author Juan Pedroche Moreno
 */
public class Cliente {
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;

    
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }

        private static int obtenerNumeroCliente() {
        	
        	//añade 1 al numero de cliente anterior
        contadorClientes++;
        return contadorClientes;
    }

    
    public String mostrarInformacion() {
    	//muestra la informacion del cliente
        return "Código: " + codigo + ", Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }
    
    
    //metodos getter y setter
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


}
