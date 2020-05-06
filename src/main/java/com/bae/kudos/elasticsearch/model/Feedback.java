package com.bae.kudos.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "kudos-feedback", type = "feedback")
public class Feedback {

    private Integer rating;

    private String feedbackBody;

    public Feedback() {

    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getFeedbackBody() {
        return feedbackBody;
    }

    public void setFeedbackBody(String feedbackBody) {
        this.feedbackBody = feedbackBody;
    }

}
