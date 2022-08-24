function userValidation(form) {
    	var email = form.email.value;
        var password = form.password.value;
        var confirmPassword = form.confirmPassword.value;
        var name = form.fullName.value;

        if(email == "") {
        	form.email.focus();
        	return false;
            } 
        if(password == "") {
        	form.password.focus();
        	return false;
            } 
        if(confirmPassword == "") {
        	form.confirmPassword.focus();
        	return false;
            } 
        if(name == "") {
        	form.name.focus();
        	return false;
            } 
        
        return false;
    }
