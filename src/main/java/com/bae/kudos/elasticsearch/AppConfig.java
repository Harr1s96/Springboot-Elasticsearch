package com.bae.kudos.elasticsearch;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchEntityMapper;
import org.springframework.data.elasticsearch.core.EntityMapper;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages = "com.bae.kudos.elasticsearch.persistance")
public class AppConfig extends AbstractElasticsearchConfiguration {

    @Value("${elasticsearch.host}")
    private String elasticHost;

    @Value("${elasticsearch.port")
    private Integer elasticPort;

    @Override
    public RestHighLevelClient elasticsearchClient() {
        return RestClients.create(ClientConfiguration.localhost()).rest();
    }

    @Bean
    @Override
    public EntityMapper entityMapper() {

        ElasticsearchEntityMapper entityMapper = new ElasticsearchEntityMapper(
            elasticsearchMappingContext(), 
            new DefaultConversionService()
        );

        return entityMapper;
    }

    public String getElasticHost() {
        return elasticHost;
    }

    public void setElasticHost(String elasticHost) {
        this.elasticHost = elasticHost;
    }

    public Integer getElasticPort() {
        return elasticPort;
    }

    public void setElasticPort(Integer elasticPort) {
        this.elasticPort = elasticPort;
    }
    
}