package com.example.demo.user;

import com.example.demo.user.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("커스텀 UserDetailsService");

        Users findUser = userRepository.findByUsername(username);
        if (findUser != null) {
            return User.builder()
                    .username(username)
                    .password(findUser.getPassword())
                    .build();
        }

        return null;
    }

}
