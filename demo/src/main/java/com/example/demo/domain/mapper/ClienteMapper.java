package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.cliente.request.ClienteCreateRequest;
import com.example.demo.domain.dto.cliente.response.ClienteResponse;
import com.example.demo.domain.entity.Cliente;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClienteMapper
 */
@Component
public class ClienteMapper {

    private final ModelMapper mapper;

    @Autowired
    public ClienteMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }

    public ClienteResponse toDto(Cliente input ){
        return mapper.map(input, ClienteResponse.class);
    }

    public Cliente fromDtoCreate(ClienteCreateRequest input) {
        return mapper.map(input, Cliente.class);
    }
}