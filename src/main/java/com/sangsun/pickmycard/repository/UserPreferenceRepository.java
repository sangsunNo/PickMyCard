package com.sangsun.pickmycard.repository;

import com.sangsun.pickmycard.entity.UserAccount;
import com.sangsun.pickmycard.entity.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
    List<UserPreference> findByUserAccount(UserAccount user);
}
