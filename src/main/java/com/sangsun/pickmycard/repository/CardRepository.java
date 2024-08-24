package com.sangsun.pickmycard.repository;

import com.sangsun.pickmycard.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByCardNameContainingIgnoreCase(String name);

    @Query("SELECT c From Card c WHERE " +
            "LOWER(c.benefits) LIKE %:category% OR " +
            "LOWER(c.benefits) LIKE %:brand%")

    List<Card> findByCategoryOrBrand(@Param("category") String category, @Param("brand") String brand);

}


