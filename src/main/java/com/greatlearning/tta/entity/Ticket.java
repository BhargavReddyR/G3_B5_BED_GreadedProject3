package com.greatlearning.tta.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Tickets")

public class Ticket {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @Column(name = "Title")
	    private String title;


	    @Column(name = "Short_Discription")
	    private String shortDiscription;


	    @Column(name = "Created_On")
	    private String createdOn;


	    public Ticket() {

	    }

		public Ticket(Long id, String title, String shortDiscription, String createdOn) {
			this.title = title;
			this.shortDiscription = shortDiscription;
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

		public String getShortDiscription() {
			return shortDiscription;
		}

		public void setShortDiscription(String shortDiscription) {
			this.shortDiscription = shortDiscription;
		}

		public String getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(String createdOn) {
			this.createdOn = createdOn;
		}
}