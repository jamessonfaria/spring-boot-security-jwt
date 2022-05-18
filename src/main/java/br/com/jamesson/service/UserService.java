package br.com.jamesson.service;

import br.com.jamesson.domain.Role;
import br.com.jamesson.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
