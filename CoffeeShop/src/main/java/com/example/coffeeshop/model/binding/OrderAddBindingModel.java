package com.example.coffeeshop.model.binding;

import com.example.coffeeshop.model.entity.CategoryNameEnum;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderAddBindingModel {

    public Long id;

    @Size(min=3, max = 20)
    public String name;

    @NotNull
    @Positive
    public BigDecimal price;

    @PastOrPresent
    @DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
    public LocalDateTime orderTime;

    @NotNull
    public CategoryNameEnum category;

    @Size(min = 5)
    public String description;

    public OrderAddBindingModel() {
    }

    public Long getId() {
        return id;
    }

    public OrderAddBindingModel setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public OrderAddBindingModel setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrderAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OrderAddBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CategoryNameEnum getCategory() {
        return category;
    }

    public OrderAddBindingModel setCategory(CategoryNameEnum category) {
        this.category = category;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
