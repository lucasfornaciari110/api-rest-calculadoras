package br.com.api.calculadoras.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class Imc {
    private Integer id;
    private Integer codFuncionario;
    private Integer nomeFuncionario;
    private Integer idade;
    private Integer sexo;
    private BigDecimal peso;
    private BigDecimal altura;
    private BigDecimal resultadoImc;
    private String descricaoResultadoImc;
    private LocalDateTime dtResultadoImc = LocalDateTime.now();
    private Integer idOperador;
    private Date dtAlteracao;
    private Date dtExclusao;
}
