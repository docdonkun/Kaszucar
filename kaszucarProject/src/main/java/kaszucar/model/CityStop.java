package kaszucar.model;
// Generated 4 f�vr. 2016 18:26:01 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CityStop generated by hbm2java
 */
@Entity
@Table(name = "city_stop", schema = "public")
public class CityStop implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CityStopId id;

	public CityStop() {
	}

	public CityStop(CityStopId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idCityStop", column = @Column(name = "id_city_stop", nullable = false) ),
			@AttributeOverride(name = "idCity", column = @Column(name = "id_city", nullable = false) ),
			@AttributeOverride(name = "idCovoiturage", column = @Column(name = "id_covoiturage", nullable = false) ) })
	public CityStopId getId() {
		return this.id;
	}

	public void setId(CityStopId id) {
		this.id = id;
	}

}