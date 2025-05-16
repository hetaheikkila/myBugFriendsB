package com.com.mybugfriends.domain;
import org.springframework.data.repository.CrudRepository;

public interface BugRepository extends CrudRepository<Bug, Long> {
    Bug findByName(String name);
}