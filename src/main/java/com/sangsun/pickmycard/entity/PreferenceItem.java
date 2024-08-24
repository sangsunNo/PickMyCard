package com.sangsun.pickmycard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PreferenceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String categoryOrBrand;
    private boolean isCategory;

    @ManyToOne
    @JoinColumn(name = "preference_id")
    private UserPreference userPreference;
}