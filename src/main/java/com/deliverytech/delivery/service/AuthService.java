package com.deliverytech.delivery.service;

import com.deliverytech.delivery.dto.request.LoginRequest;
import com.deliverytech.delivery.dto.request.RegisterRequest;
import com.deliverytech.delivery.dto.response.LoginResponse;
//import com.deliverytech.delivery.dto.response.UserResponse;
import com.deliverytech.delivery.model.Usuario;

public interface AuthService {
    
    // Clausula numero 1: Deve saber como processar um login
    LoginResponse login(LoginRequest request);

    // Clausula numero 2: Deve saber como registrar um novo usuário
    Usuario register(RegisterRequest request);

    // Clausula numero 3: Deve saber como obter informações do usuário logado
    //UserResponse getCurrentUser();
}