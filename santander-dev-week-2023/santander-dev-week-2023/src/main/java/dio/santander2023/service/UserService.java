package dio.santander2023.service;

import dio.santander2023.domain.model.User;

public interface UserService {
    User findById (Long id);

    User create(User userToCreate);

}
