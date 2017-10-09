package com.rosinante24.androidcleanarchitecture.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CityListData {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("vote_count")
    @Expose
    private int vote_count;
    @SerializedName("title")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private String description;
    @SerializedName("poster_path")
    @Expose
    private String background;

    /**
     * @return The id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The background
     */
    public String getBackground() {
        return background;
    }

    /**
     * @param background The background
     */
    public void setBackground(String background) {
        this.background = background;
    }

}