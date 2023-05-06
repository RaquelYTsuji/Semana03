package onboard.raquel.Semana03.service;

import lombok.RequiredArgsConstructor;
import onboard.raquel.Semana03.repository.OnboardUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OnboardUserDetailsService implements UserDetailsService {
    private final OnboardUserRepository onboardUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {
        return Optional.ofNullable(onboardUserRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("Onboard User not found"));
    }
}
