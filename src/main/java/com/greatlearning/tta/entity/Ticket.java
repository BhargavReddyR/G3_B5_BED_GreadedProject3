package com.greatlearning.tta.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name="Tickets")

public class Ticket {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @Column(name = "Title")
	    private String title;


	    @Column(name = "Short_Description")
	    private String shortDescription;
	    
	    @CreationTimestamp
	    @Column(name = "createdOn")
	    private Date createdOn;


	    @Column(name = "Content")
	    private String content;


	    public Ticket() {

	    }

		public Ticket(Long id, String title, String shortDescription, Date createdOn, String content) {
			this.title = title;
			this.shortDescription = shortDescription;
			this.content = content;
			this.createdOn = createdOn;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getShortDescription() {
			return shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
}