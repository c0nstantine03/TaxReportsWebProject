package org.project.taxreportswebapp.db.dao;

import org.project.taxreportswebapp.db.entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface UserDao extends DAO<User> {

	List<User> getAll();

	Optional<User> findByLogin(String login);

	Optional<User> findByLoginAndPassword(String login, String password);

	void changeEnable(String login, Boolean enable) throws SQLException;
}