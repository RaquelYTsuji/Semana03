package onboard.raquel.Semana03.repository;

import onboard.raquel.Semana03.domain.OnboardUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnboardUserRepository extends JpaRepository<OnboardUser, Long> {
    OnboardUser findByUsername(String username);
}
