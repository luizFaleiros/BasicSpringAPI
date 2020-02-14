package com.example.demo.domain.dto.cliente.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * ClienteResponse
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {

    String nome;

    String senha;

    String email;
}