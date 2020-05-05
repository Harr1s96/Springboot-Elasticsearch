package com.bae.kudos.elasticsearch.persistance;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRepository extends ElasticsearchRepository<Feedback, Long> {
    
}