# AutenticacaoBasicaSpringBootVersao1XX
Caso a versão do SpringBoot seja 2.XX o método abaixo tem que ser alterado. Note que existe uma instrução ("{noop}admin1")

@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin1").roles("ROLE").and()
		.withUser("usuario").password("{noop}usuario").roles("USER");
	
	}
	
