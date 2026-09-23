Para entrar a mi carpeta ya descargada, en la terminal debe poner: cd EDA311_hito3_MorenoSamantha_pila
Ejecutar .\mvnw.cmd spring-boot:run
Para poder ver cuantos elementos estan insertados... en el navegador necesitamos poner http://localhost:8085/api/v1/tamanyo (mi puerto esta en 8085)
Para agregar elementos, vamos a VISUAL STUDIO CODE abrimos una NUEVA terminal Invoke-WebRequest -Method POST "http://localhost:8085/api/v1/insertar?elemento=Sam" y si queremos agregar otro elemento solo copiamos el mismo y cambiamos el nombre
Para eliminar elementos en la terminal agregamos Invoke-WebRequest -Method DELETE "http://localhost:8085/api/v1/eliminar"
Para ver el elemento eliminado solo ponemos en el navegador : http://localhost:8085/api/v1/tamanyo y nos sale cuantos elementos tenemos
