package CodeAvengers.Sarthi.service;

import CodeAvengers.Sarthi.entity.User;
import CodeAvengers.Sarthi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String email, String password) {
        // Find the user by email
        User user = userRepository.findByEmail(email);

        // If the user exists and the password matches, return true
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }

        return false; // If either user doesn't exist or password doesn't match
    }
}
