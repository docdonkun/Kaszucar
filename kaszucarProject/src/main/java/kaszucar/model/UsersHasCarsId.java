package kaszucar.model;
// Generated 4 f�vr. 2016 18:26:01 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsersHasCarsId generated by hbm2java
 */
@Embeddable
public class UsersHasCarsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idUsersHasCarl;
	private int idCars;
	private int idUsers;

	public UsersHasCarsId() {
	}

	public UsersHasCarsId(int idUsersHasCarl, int idCars, int idUsers) {
		this.idUsersHasCarl = idUsersHasCarl;
		this.idCars = idCars;
		this.idUsers = idUsers;
	}

	@Column(name = "id_users_has_carl", nullable = false)
	public int getIdUsersHasCarl() {
		return this.idUsersHasCarl;
	}

	public void setIdUsersHasCarl(int idUsersHasCarl) {
		this.idUsersHasCarl = idUsersHasCarl;
	}

	@Column(name = "id_cars", nullable = false)
	public int getIdCars() {
		return this.idCars;
	}

	public void setIdCars(int idCars) {
		this.idCars = idCars;
	}

	@Column(name = "id_users", nullable = false)
	public int getIdUsers() {
		return this.idUsers;
	}

	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}

	public boolean equals(Object other) {
		if ((this == other)) return true;
		if ((other == null)) return false;
		if (!(other instanceof UsersHasCarsId)) return false;
		UsersHasCarsId castOther = (UsersHasCarsId) other;

		return (this.getIdUsersHasCarl() == castOther.getIdUsersHasCarl())
				&& (this.getIdCars() == castOther.getIdCars())
				&& (this.getIdUsers() == castOther.getIdUsers());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdUsersHasCarl();
		result = 37 * result + this.getIdCars();
		result = 37 * result + this.getIdUsers();
		return result;
	}

}