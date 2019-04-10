/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities;

/**
 *
 * @author usuario
 */
public class PresentacionProducto {

    private Long id_tipo_presentacion;
    private String nombre;
    private String estado;
    private Long usuario_creacion;
    private String fecha_creacion;
    private Long usuario_actualizacion;
    private String fecha_actualizacion;

    public PresentacionProducto() {
    }

    public PresentacionProducto(Long id_tipo_presentacion, String nombre, String estado, Long usuario_creacion, String fecha_creacion, Long usuario_actualizacion, String fecha_actualizacion) {
        this.id_tipo_presentacion = id_tipo_presentacion;
        this.nombre = nombre;
        this.estado = estado;
        this.usuario_creacion = usuario_creacion;
        this.fecha_creacion = fecha_creacion;
        this.usuario_actualizacion = usuario_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Long getId_tipo_presentacion() {
        return id_tipo_presentacion;
    }

    public void setId_tipo_presentacion(Long id_tipo_presentacion) {
        this.id_tipo_presentacion = id_tipo_presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getUsuario_creacion() {
        return usuario_creacion;
    }

    public void setUsuario_creacion(Long usuario_creacion) {
        this.usuario_creacion = usuario_creacion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Long getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public void setUsuario_actualizacion(Long usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }

    public String getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(String fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

}
