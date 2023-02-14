package com.example.host;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min =2, max=10)
    private String name;

    @NotNull
    @Min(18)
    private Integer Cost;
    @NotNull
    private Integer mealcount;
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.Cost = cost;
    }

    public void setMealcount(Integer mealcount) {
        this.mealcount = mealcount;
    }

    public Integer getMealcount() {
        return mealcount;
    }

    public String getName(){
        return this.name;
    }

    public Integer getCost(){
        return this.Cost;
    }

    public String toString(){
        return "person(name:" +this.name+", Cost:" +this.Cost+", meal count:"+this.mealcount+")";
    }
}
