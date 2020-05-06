package com.bae.kudos.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "kudos-feedback", type = "feedback")
public class Feedback {

    private Integer rating;

    private String positiveComment;

    private String negativeComment;

    public Feedback() {

    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getPositiveComment() {
        return positiveComment;
    }

    public void setPositiveComment(String positiveComment) {
        this.positiveComment = positiveComment;
    }

    public String getNegativeComment() {
        return negativeComment;
    }

    public void setNegativeComment(String negativeComment) {
        this.negativeComment = negativeComment;
    }

    

}
