package com.upc.babyhealth.models.entity;

import java.time.ZonedDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Celular {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCelular;
	private Long numero;
	private Long imei;
	private String operador;
	private ZonedDateTime fechaCreacion;
	private ZonedDateTime fechaMoificacion;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private String estado;
	private String firebaseToken;

}
