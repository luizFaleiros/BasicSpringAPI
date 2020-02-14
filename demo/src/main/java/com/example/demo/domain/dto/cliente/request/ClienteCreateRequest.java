package com.example.demo.domain.dto.cliente.request;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * ClienteCreateRequest
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCreateRequest {
    @NotEmpty
    String nome;

    @NotEmpty 
    String senha;

    @NotEmpty
    String email;
    
}