/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.entities;

import java.sql.Date;

/**
 *
 * @author admin1
 */
public class SubGrupoProductos {

    private Long id_subgrupo;
    private Long id_grupo;
    private Long id_empresa;
    private String nombre;
    private String estado;
    private Long usuario_creacion;
    private Date fecha_creacion;
    private Long usuario_actualizacion;
    private Date fecha_actualizacion;

    public SubGrupoProductos() {
    }

    public SubGrupoProductos(Long id_subgrupo, Long id_grupo, Long id_empresa, String nombre, String estado, Long usuario_creacion, Date fecha_creacion, Long usuario_actualizacion, Date fecha_actualizacion) {
        this.id_subgrupo = id_subgrupo;
        this.id_grupo = id_grupo;
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.estado = estado;
        this.usuario_creacion = usuario_creacion;
        this.fecha_creacion = fecha_creacion;
        this.usuario_actualizacion = usuario_actualizacion;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public Long getId_subgrupo() {
        return id_subgrupo;
    }

    public void setId_subgrupo(Long id_subgrupo) {
        this.id_subgrupo = id_subgrupo;
    }

    public Long getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Long id_grupo) {
        this.id_grupo = id_grupo;
    }

    public Long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Long id_empresa) {
        this.id_empresa = id_empresa;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Long getUsuario_actualizacion() {
        return usuario_actualizacion;
    }

    public void setUsuario_actualizacion(Long usuario_actualizacion) {
        this.usuario_actualizacion = usuario_actualizacion;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    
}
