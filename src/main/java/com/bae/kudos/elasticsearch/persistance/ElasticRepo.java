package com.bae.kudos.elasticsearch.persistance;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRepo extends ElasticsearchRepository<Feedback, String> {
    
}