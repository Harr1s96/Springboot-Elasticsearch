package com.bae.kudos.elasticsearch.controller;

import com.bae.kudos.elasticsearch.model.Feedback;

import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ElasticController {
    
    private  ElasticsearchOperations elasticsearchOperations;
    
    public ElasticController(ElasticsearchOperations elasticsearchOperations) { 
        this.elasticsearchOperations = elasticsearchOperations;
    }
    
    @PostMapping("/feedback")
    public String saveFeedback(@RequestBody Feedback feedback) {                         
        
        IndexQuery indexQuery = new IndexQueryBuilder()
            .withObject(feedback)
            .build();
        
        String documentId = elasticsearchOperations.index(indexQuery);
        
        return documentId;
    }

}