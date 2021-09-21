# Laboratorio-5
## David Pérez - Nicolas Camacho
**Parte 1**

Antes de iniciar habilitamos telnet para windows 10
![Foto1](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/habilitarTelnet.jpg)

Abra una terminal Linux o consola de comandos Windows.
Realice una conexión síncrona TCP/IP a través de Telnet al siguiente servidor:
Host: www.escuelaing.edu.co
Puerto: 80
Teniendo en cuenta los parámetros del comando telnet:

telnet www.escuelaing.edu.co 80

![Foto2](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/GETsssssabchtmlHTTP1.0.png)

¿Qué otros códigos de error existen?, ¿En qué caso se manejarán? \
Existen estos tipos de errores: \
1XX : Respuestas informativas \
2XX : Correctas \
3XX : Redirecciones \
4XX : Errores del cliente \
5XX : Errores del server 


**Realice una nueva conexión con telnet, esta vez a:  telnet www.htttpbin.com 80**

![Foto3](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/GEThttpbin.png)

Seleccione el contenido HTML de la respuesta y copielo al cortapapeles CTRL-SHIFT-C. Ejecute el comando wc (word count) para contar palabras con la opción -c para contar el número de caracteres:

_wc -c_

![Foto3.1](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/contarPalabrasTextoHtml.png)


En la practica no se utiliza telnet para hacer peticiones a sitios web sino el comando curl con ayuda de la linea de comandos:

curl www.httpbin.org

![Foto4](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/curlv1.png)

curl -v www.httpbin.org

![Foto5](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/curlv2.png)

curl -i www.httpbin.org

![Foto6](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/curli1.png)

![Foto7](https://github.com/Haatom/Laboratorio-5/blob/master/Resources/curli2.png)




**¿Cuáles son las diferencias con los diferentes parámetros?** \
El -v hace que la operación sea más detallada \
El -i hace que incluya en las cabeceras de respuesta el protocolo responsable de la salida

## Parte II

