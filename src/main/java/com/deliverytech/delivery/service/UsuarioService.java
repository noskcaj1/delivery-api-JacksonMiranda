package com.deliverytech.delivery.service;

//import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.deliverytech.delivery.dto.request.LoginRequest;
import com.deliverytech.delivery.dto.request.RegisterRequest;
import com.deliverytech.delivery.dto.response.LoginResponse;
import com.deliverytech.delivery.model.Usuario;

public interface UsuarioService {

    Usuario salvar (RegisterRequest usuario);

    UserDetails buscarPorEmail(String email);

    boolean existePorEmail(String email); //melhorar nome

    Object buscarPorId(Long id);

    void inativarUsuario(Long id);

    LoginResponse login(LoginRequest loginRequest);

    void logout(String token);


}
