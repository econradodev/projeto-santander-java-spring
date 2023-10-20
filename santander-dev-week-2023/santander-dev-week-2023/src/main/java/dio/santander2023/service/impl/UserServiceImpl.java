package dio.santander2023.service.impl;

import dio.santander2023.domain.model.User;
import dio.santander2023.domain.repository.UserRepository;
import dio.santander2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByDados(userToCreate.getDados().getMatricula())) {
            throw new IllegalArgumentException("Já existe um usuário com a MATRÍCULA informada.");
        }
        return userRepository.save(userToCreate);
    }
}
