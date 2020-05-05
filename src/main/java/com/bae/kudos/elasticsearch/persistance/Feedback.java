package com.bae.kudos.elasticsearch.persistance;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "kudos-feedback", type = "feedback")
public class Feedback {

    

}
