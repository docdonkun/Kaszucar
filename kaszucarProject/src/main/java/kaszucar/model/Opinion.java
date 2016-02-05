package kaszucar.model;
// Generated 4 f�vr. 2016 18:26:01 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Opinion generated by hbm2java
 */
@Entity
@Table(name = "opinion", schema = "public")
public class Opinion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OpinionId id;
	private String description;
	private short score;

	public Opinion() {
	}

	public Opinion(OpinionId id, short score) {
		this.id = id;
		this.score = score;
	}

	public Opinion(OpinionId id, String description, short score) {
		this.id = id;
		this.description = description;
		this.score = score;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idOpinion", column = @Column(name = "id_opinion", nullable = false) ),
			@AttributeOverride(name = "idUsersFrom", column = @Column(name = "id_users_from", nullable = false) ),
			@AttributeOverride(name = "idUsersTo", column = @Column(name = "id_users_to", nullable = false) ) })
	public OpinionId getId() {
		return this.id;
	}

	public void setId(OpinionId id) {
		this.id = id;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "score", nullable = false)
	public short getScore() {
		return this.score;
	}

	public void setScore(short score) {
		this.score = score;
	}

}