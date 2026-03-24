package com.example.SecurityApp.SecurityApplication.services;

import com.example.SecurityApp.SecurityApplication.dto.LoginDto;
import com.example.SecurityApp.SecurityApplication.dto.SignUpDto;
import com.example.SecurityApp.SecurityApplication.dto.UserDto;
import com.example.SecurityApp.SecurityApplication.entities.User;
import com.example.SecurityApp.SecurityApplication.exceptions.ResourceNotFoundException;
import com.example.SecurityApp.SecurityApplication.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper mapper;
    private final PasswordEncoder passwordEncoder;

    /**
     * Locates the user based on the username. In the actual implementation, the search
     * may possibly be case sensitive, or case insensitive depending on how the
     * implementation instance is configured. In this case, the <code>UserDetails</code>
     * object that comes back may have a username that is of a different case than what
     * was actually requested..
     *
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws UsernameNotFoundException if the user could not be found or the user has no
     *                                   GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("User with email : "+ username + " not found"));
    }

    public UserDto signUp(@Valid SignUpDto signUpDto) {
        Optional<User> userOpt = userRepository.findByEmail(signUpDto.getEmail());
        if(userOpt.isPresent()){
            throw new BadCredentialsException("User with email already exists " + signUpDto.getEmail());
        }
        String bcryptPassword = passwordEncoder.encode(signUpDto.getPassword());
        User toBeCreate = mapper.map(signUpDto, User.class);
        toBeCreate.setPassword(bcryptPassword);
        User savedUser = userRepository.save(toBeCreate);

        return mapper.map(savedUser, UserDto.class);

    }
}
