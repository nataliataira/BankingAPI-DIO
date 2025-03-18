package dio.me.bank_api.service;

import dio.me.bank_api.domain.model.User;

public interface UserService {

    User create(User user);
    User findById(Long id);

}
