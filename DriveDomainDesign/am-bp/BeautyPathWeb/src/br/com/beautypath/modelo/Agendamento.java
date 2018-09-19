package br.com.beautypath.modelo;

import java.util.Calendar;

/**
 * 
 * @author YURIBreion
 * @version 1.0 Classe de agendamento de serviços
 */

public class Agendamento {

	private Calendar data;
	private Calendar hora;
	private String obs;
	private int idAgendamento;
	private Profissional idProfissional;
	private Catalogo idCatalogo;
	private Cliente idCliente;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getHora() {
		return hora;
	}

	public void setHora(Calendar hora) {
		this.hora = hora;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public int getIdAgendamento() {
		return idAgendamento;
	}

	public Profissional getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Profissional idProfissional) {
		this.idProfissional = idProfissional;
	}

	public Catalogo getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(Catalogo idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Agendamento(Calendar data, Calendar hora, String obs, int idAgendamento, Profissional idProfissional,
			Catalogo idCatalogo, Cliente idCliente) {
		setData(data);
		setHora(hora);
		setObs(obs);
		setIdProfissional(idProfissional);
		setIdCatalogo(idCatalogo);
		setIdCliente(idCliente);
	}

	public Agendamento() {

	}

	public String getAll() {
		return "Hora: " + hora + "\nData: " + data + "\nObs: " + obs + "\nCod. agendamento: " + idAgendamento
				+ "\nCod. Cliente: " + idCliente + "\nCod. Catalogo: " + idCatalogo + "\nCod. Profissional: "
				+ idProfissional;
	}
	
	public void setAll(Calendar data, Calendar hora, String obs, Profissional idProfissional,
			Catalogo idCatalogo, Cliente idCliente) {
		setData(data);
		setHora(hora);
		setObs(obs);
		setIdProfissional(idProfissional);
		setIdCatalogo(idCatalogo);
		setIdCliente(idCliente);
	}
}
