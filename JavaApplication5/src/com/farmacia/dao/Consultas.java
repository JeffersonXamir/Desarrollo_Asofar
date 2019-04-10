/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Consultas {

   // Conectar con = new Conectar();
    Connection conect = null;
    java.sql.Statement st = null;
    ResultSet rs = null;
    String query;
    java.sql.Statement jss = null;
    Conexion con = new Conexion();
   
}
