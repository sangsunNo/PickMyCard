package com.sangsun.pickmycard.service;

import com.sangsun.pickmycard.entity.Card;
import com.sangsun.pickmycard.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    // 모든 카드 조회
    public List<Card> findAllCards() {
        return cardRepository.findAll();
    }

    // ID로 카드 조회
    public Optional<Card> findCardById(Long id) {
        return cardRepository.findById(id);
    }

    // 카드 저장
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }

    // 카드 삭제
    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}