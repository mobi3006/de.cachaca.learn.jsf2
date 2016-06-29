package de.cachaca.learn.jsf2.messages;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class MessageCreator {

	public String createMessages() {
		FacesContext.getCurrentInstance()
			.addMessage(
					null, 
					new FacesMessage(
							FacesMessage.SEVERITY_INFO,
							"das ist eine globale Info-Nachricht",
							null));
		FacesContext.getCurrentInstance()
			.addMessage(
					null, 
					new FacesMessage(
							FacesMessage.SEVERITY_ERROR,
							"das ist eine globale Error-Nachricht",
							null));
		FacesContext.getCurrentInstance()
			.addMessage(
					null, 
					new FacesMessage(
							FacesMessage.SEVERITY_WARN,
							"das ist eine globale Warn-Nachricht",
							null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:button", 
				new FacesMessage(
						FacesMessage.SEVERITY_ERROR,
						"das ist eine Error-Nachricht zum Button",
						null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:button", 
				new FacesMessage(
						FacesMessage.SEVERITY_INFO,
						"das ist eine Info-Nachricht zum Button",
						null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:button", 
				new FacesMessage(
						FacesMessage.SEVERITY_WARN,
						"das ist eine Warn-Nachricht zum Button",
						null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:inputText", 
				new FacesMessage(
						FacesMessage.SEVERITY_INFO,
						"das ist eine Info-Nachricht zum EingabeFeld",
						null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:inputText", 
				new FacesMessage(
						FacesMessage.SEVERITY_ERROR,
						"das ist eine Error-Nachricht zum EingabeFeld",
						null));
		FacesContext.getCurrentInstance()
			.addMessage(
				"pierreForm:inputText", 
				new FacesMessage(
						FacesMessage.SEVERITY_WARN,
						"das ist eine Warn-Nachricht zum EingabeFeld",
						null));
		return null;
	}
}
