package com.freshvotes.domain;

import java.io.Serializable;



import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
@Embeddable
public class Votes_MtoM implements Serializable{
	
//	EmbeddedId is for instance level relationship
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1381166803755357341L;
	private VoteId id_pk;
	
	

	@EmbeddedId
	public VoteId getId_pk() {
		return id_pk;
	}
	public void setId_pk(VoteId id_pk) {
		this.id_pk = id_pk;
	}

	private Boolean upvote;

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	

}
