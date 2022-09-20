package com.epicmerch.fgm.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "post")
public class PostModel {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(nullable = false)
	    private Long id;

	    @Column(nullable = false, length = 255)
	    private String title;

	    @Column(columnDefinition = "text")
	    private String content;

	    @ManyToOne
	    @JoinColumn(nullable = false, name = "direccion")
	    @JsonProperty(access = Access.WRITE_ONLY)
	    private ClientesModel user;

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

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public ClientesModel getUser() {
			return user;
		}

		public void setUser(ClientesModel user) {
			this.user = user;
		}
	    
	    
}
