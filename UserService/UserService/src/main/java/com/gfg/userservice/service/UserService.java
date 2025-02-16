package com.gfg.userservice.service;

import com.gfg.userservice.domain.dto.RegisterRequest;
import com.gfg.userservice.domain.dto.UserDTO;
import com.gfg.userservice.domain.dto.account.ChangePasswordRequest;
import com.gfg.userservice.domain.dto.account.LoginRequest;
import com.gfg.userservice.domain.dto.account.LoginResponse;

import java.util.List;

public interface UserService {

    List<UserDTO> findAll();
    UserDTO findById(final Integer userId);
    UserDTO save(final UserDTO userDTO);
    UserDTO update(final UserDTO userDTO);
    UserDTO update(final Integer userId, final UserDTO userDTO);
    void deleteById(final Integer userId);
    UserDTO findByUsername(final String username);
// Account
    void activateAccount(String token);
    void forgotPassword(String email);
    void resetPassword(String token, String newPassword);

    void register(RegisterRequest registerRequest);

    LoginResponse login(LoginRequest loginRequest);

    void changePassword(ChangePasswordRequest request);
// Profile
    UserDTO getUserProfile(String userName);

    void updateUserProfile(String userName, UserDTO userDTO);

    public long getUserCount();

    List<UserDTO> getAllUsers();

}
