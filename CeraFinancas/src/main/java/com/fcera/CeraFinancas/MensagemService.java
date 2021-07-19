package com.fcera.CeraFinancas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")//serve para indicar que o perfil de configuração de propriedades e é o de production (application-production.properties)
public class MensagemService {
	
	@Value("${application.name}")
	private String appName;
}
