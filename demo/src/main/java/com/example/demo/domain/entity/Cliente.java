package com.example.demo.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * Cliente
 */
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id_cliente")
    Integer id;
    
    @Column(name = "nome",nullable = false, length = 250)
    String nome;

    @Column(name = "email",nullable = false, length = 250)
    String email;

    @Column(name = "senha", nullable = false, length = 32)
    String senha;
}