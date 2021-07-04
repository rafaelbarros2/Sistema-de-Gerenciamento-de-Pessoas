package com.gerenciamentopessoas.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class BancoHorasId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public long idBancoHoras;
    public long idMovimentacao;
    public long idUsuario;
}
