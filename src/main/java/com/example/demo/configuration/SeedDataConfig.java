package com.example.demo.configuration;


import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repositories.BusinessUserRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class SeedDataConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    private final BusinessUserRepository businessUserRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    @Override
    public void run(String... args) throws Exception {

        if (userRepository.count() == 0) {

            User admin = User
                    .builder()
                    .firstName("admin")
                    .lastName("admin")
                    .email("admin@admin.com")
                    .password(passwordEncoder.encode("123"))
                    .role(Role.ROLE_ADMIN)
                    .build();

            userService.save(admin);
            log.debug("created ADMIN user - {}", admin);
        }
        if (businessUserRepository.count() == 0) {

            User bizUser = User
                    .builder()
                    .firstName("biz")
                    .lastName("biz")
                    .email("biz@biz.com")
                    .password(passwordEncoder.encode("123"))
                    .role(Role.ROLE_BUSINESS_USER)
                    .build();

            userService.save(bizUser);
            log.debug("created BIZ user - {}", bizUser);
        }
    }
}