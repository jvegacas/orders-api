package com.ricoh.orders.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import io.swagger.annotations.ApiModelProperty;

@MappedSuperclass
public class BaseEntity {

	@ApiModelProperty("Autogenerated ID from Entity")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	
    public Long getId() {
        return id;
    }

}