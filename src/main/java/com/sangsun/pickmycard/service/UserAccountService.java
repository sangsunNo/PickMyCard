package com.sangsun.pickmycard.service;

import com.sangsun.pickmycard.entity.UserAccount;
import com.sangsun.pickmycard.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAccountService {

    private final UserAccountRepository userAccountRepository;

    @Autowired
    public UserAccountService(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    // 모든 사용자 조회
    public List<UserAccount> findAllUsers() {
        return userAccountRepository.findAll();
    }

    // ID로 사용자 조회
    public Optional<UserAccount> findUserById(Long id) {
        return userAccountRepository.findById(id);
    }

    // 사용자 저장
    public UserAccount saveUser(UserAccount user) {
        return userAccountRepository.save(user);
    }

    // 사용자 삭제
    public void deleteUser(Long id) {
        userAccountRepository.deleteById(id);
    }
}