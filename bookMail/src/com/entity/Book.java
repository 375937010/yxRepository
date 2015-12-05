package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="tb_book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String cover;
	
	@ManyToOne(fetch=FetchType.EAGER,targetEntity=Category.class,cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	private Category category;
	
	@Transient
	private Integer categoryid;
	
	
	public Book(Integer id, String name,String cover) {
		super();
		this.id = id;
		this.name = name;
		this.cover = cover;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", description="
				+ description + ", cover=" + cover + ", category=" + category
				+ ", categoryid=" + categoryid + "]";
	}


	
}
