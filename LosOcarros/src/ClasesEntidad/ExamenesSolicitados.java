/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEntidad;

/**
 *
 * @author felipe
 */
public class ExamenesSolicitados {
    private String id_examen_solicitado;
    private String observaciones;
    private String nombreExamen;

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }
    
    
    public String getId_examen_solicitado() {
        return id_examen_solicitado;
    }

    public void setId_examen_solicitado(String id_examen_solicitado) {
        this.id_examen_solicitado = id_examen_solicitado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
}
