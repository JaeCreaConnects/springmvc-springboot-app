package com.appsdeveloperblog.app.ws.repository;

import org.springframework.data.repository.CrudRepository;

import com.appsdeveloperblog.app.ws.security.PasswordResetTokenEntity;

public interface PasswordResetTokenRepository extends CrudRepository<PasswordResetTokenEntity, Long>{
	PasswordResetTokenEntity findByToken(String token);
}
