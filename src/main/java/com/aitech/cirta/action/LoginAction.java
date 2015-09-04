package com.aitech.cirta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.aitech.cirta.form.LoginForm;

/**
 * Action declencher quand appuis sur le bouton submit du formulaire dans la
 * page login.jsp
 * 
 * @author Nassim AIT BRAHAM
 * 
 */
public class LoginAction extends Action {

	/**
	 * Methode execute
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		LoginForm loginForm = (LoginForm) form;

		if (loginForm.getUserName() == null || loginForm.getPassword() == null
				|| !loginForm.getUserName().equalsIgnoreCase("nasnet")
				|| !loginForm.getPassword().equals("nasnet")) {
			return mapping.findForward("failure");
		} else
			return mapping.findForward("success");
	}

}
