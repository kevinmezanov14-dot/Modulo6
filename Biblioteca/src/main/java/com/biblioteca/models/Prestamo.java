package com.biblioteca.models;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "prestamos")
public class Prestamo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaSolicitud;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaDevolucion;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaVencimientoM;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Date getFechaVencimientoM() {
		return fechaVencimientoM;
	}

	public void setFechaVencimientoM(Date fechaVencimientoM) {
		this.fechaVencimientoM = fechaVencimientoM;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}
