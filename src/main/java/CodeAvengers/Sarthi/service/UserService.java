package CodeAvengers.Sarthi.service;

import CodeAvengers.Sarthi.entity.User;
import CodeAvengers.Sarthi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get all Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Update User
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElse(null);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setPassword(userDetails.getPassword());
            user.setConfirmPassword(userDetails.getConfirmPassword());
            user.setEmail(userDetails.getEmail());
            user.setDob(userDetails.getDob());
            user.setContact(userDetails.getContact());
            user.setGender(userDetails.getGender());
            user.setCity(userDetails.getCity());
            user.setEmergencyContactName(userDetails.getEmergencyContactName());
            user.setRelationship(userDetails.getRelationship());
            user.setEmergencyContactNumber(userDetails.getEmergencyContactNumber());
            return userRepository.save(user);
        }
        return null;
    }

    // Delete User
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}