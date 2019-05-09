package com.elearning.repository;

import com.elearning.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User , Long> {
}
