package com.example.ElasticSearch.repository;

import java.util.UUID;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.example.ElasticSearch.entity.User;

public interface UserRepository extends ElasticsearchRepository<User, UUID> {

}
