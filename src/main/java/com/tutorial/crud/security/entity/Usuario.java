package com.tutorial.crud.entity;

import javax.oresistence.Entity;
import java.util.HashSet;
import java.util.Set

@entity
public class Usuario {
    private int id;
    private  string nombre;
    private  string nombreUsuario;
    private  string email;
    private  string password;
    private set<Rol> roles = new HashSet<>();


}