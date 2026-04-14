package com.example.userregistrationservice.dto;


import java.util.List;

public record UsuarioResponse(
        String nome,
        String email,
        List<EnderecoReponse> enderecos
) {}
