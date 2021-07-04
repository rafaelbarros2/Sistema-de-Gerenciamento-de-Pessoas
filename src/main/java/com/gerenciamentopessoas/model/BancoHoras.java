package com.gerenciamentopessoas.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @EmbeddedId
    public BancoHorasId id;
    @ManyToOne
    public Usuario usuario;
    public LocalDateTime dataTrabalhada;
    public BigDecimal quantidadeHoras;
    public BigDecimal saldoHoras;

}
