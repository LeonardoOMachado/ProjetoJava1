var Autenticar = class {	

	static isEmpty(){		
		var nome = document.getElementsByName("txtName")[0].value.trim();		
		var password = document.getElementsByName("txtPassword")[0].value.trim();		
		if ( nome == ""  || password == "" ) {			
			return true;
		}
		return false;
	}

	static verificaValores(){
		if (this.isEmpty()){
			alert("Voce deve preencher todos os campos!");
			return false;
		}
		alert("Login efetuado com sucesso!");
		return true;		
	}
}


window.onload = function(){	

	document.getElementsByTagName("form")[0].onsubmit = function(){		
		return Autenticar.verificaValores();	
	}
}	

