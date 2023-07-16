package com.baanBaini.commons;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repo extends MongoRepository<String, String> {
}
