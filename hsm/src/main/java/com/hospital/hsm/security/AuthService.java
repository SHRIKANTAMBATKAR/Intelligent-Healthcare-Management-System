package com.hospital.hsm.security;

import com.hospital.hsm.dto.LoginRequestDto;
import com.hospital.hsm.dto.LoginResponseDto;
import com.hospital.hsm.dto.SignUpRequestDto;
import com.hospital.hsm.dto.SignupResponseDto;
import com.hospital.hsm.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthenticationManager authenticationManager;
    private final AuthUtil authUtil;

    public LoginResponseDto login(LoginRequestDto loginRequestDto){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequestDto.getUsername(), loginRequestDto.getPassword())
        );
        User user= (User)authentication.getPrincipal();
        String token = authUtil.generateAccessToken(user);
        return new LoginResponseDto();
    }

    public SignupResponseDto signup(SignUpRequestDto signupRequestDto) {
        User user = signUpInternal(signupRequestDto, AuthProviderType.EMAIL, null);
        return new SignupResponseDto(user.getId(), user.getUsername());
    }
}


