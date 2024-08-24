package com.sangsun.pickmycard.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private String cardName;
    private String benefits;  // JSONB 형식으로 저장
    private String conditions;
    private BigDecimal annualFee;
}