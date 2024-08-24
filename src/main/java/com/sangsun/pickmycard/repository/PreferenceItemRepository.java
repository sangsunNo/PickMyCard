package com.sangsun.pickmycard.repository;

import com.sangsun.pickmycard.entity.PreferenceItem;
import com.sangsun.pickmycard.entity.UserPreference;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PreferenceItemRepository extends JpaRepository<PreferenceItem, Long> {
    List<PreferenceItem> findByUserPreference(UserPreference userPreference);
}
