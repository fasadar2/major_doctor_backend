package org.backend.dispatcher.repository;


import org.backend.dispatcher.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> , PagingAndSortingRepository<User, Integer> {
    User getUserById(int id);

}
