package com.bae.kudos.elasticsearch;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;


@Configuration
public class AppConfig {

    @Value("${elasticsearch.host}")
    private String elasticHost;

    @Value("${elasticsearch.port}")
    private Integer elasticPort;

    @Bean
    public RestHighLevelClient client() {
        
        RestHighLevelClient client = new RestHighLevelClient(
            RestClient.builder(
                new HttpHost(this.elasticHost, this.elasticPort, "http")
            )
        );

        return client;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws Exception {
        return new ElasticsearchRestTemplate(this.client());                    
    }
}