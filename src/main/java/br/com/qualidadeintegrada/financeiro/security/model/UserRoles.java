package br.com.qualidadeintegrada.financeiro.security.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class UserRoles {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long user_role_id;
	
	@NotNull
	private String role;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@NotNull	
	private User user;
	
}
