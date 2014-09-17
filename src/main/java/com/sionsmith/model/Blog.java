package com.sionsmith.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sionsmith on 20/05/2014.
 */
@DynamoDBTable(tableName = "blog")
public class Blog {

    public static DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    private String blogId;
    private String title;
    private String url;
    private String publishedOn = DATE_FORMAT.format(new Date());

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId()
    {
        return blogId;
    }

    @DynamoDBAttribute
    public String getTitle()
    {
        return title;
    }

    @DynamoDBAttribute
    public String getUrl()
    {
        return url;
    }

    @DynamoDBAttribute
    public String getPublishedOn() {
        return publishedOn;
    }

    public Blog() {
    }

    public Blog(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void setId(String id) {
        this.blogId = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
    }
}
