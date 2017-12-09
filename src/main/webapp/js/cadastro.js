class Autenticador{	

	isEmpty(){		
		var nome = document.getElementsByName("name")[0].value.trim();		
		var password = document.getElementsByName("password")[0].value.trim();
		if ( nome == ""  || password == "" ) {			
			return true;
		}
		return false;
	}

	verificaValores(){
		if (this.isEmpty()){
			alert("Voce deve preencher todos os campos!");
			return false;
		}
		alert("Cadastro efetuado com sucesso!");
		return true;		
	}
}

autenticador = new Autenticador();

window.onload = function(){	
	document.getElementsByTagName("form")[0].onsubmit = function(){		
		return autenticador.verificaValores();	
	}
}	
