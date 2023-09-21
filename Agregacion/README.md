# Agregación

Se desea implementar un sistema de Control de Acceso en un recinto con aforo limitado. Para ello, cada usuario tendrá asociado un identificador (una cadena de caracteres) que permitirá registrar si ese usuario se encuentra o no dentro del recinto.
Además, se podrá implementar un mecanismo de lista negra donde se incluirán aquellos usuarios que por la razón que sea tienen prohibida la entrada al recinto (usuarios con la entrada vetada).
El sistema de Control de Acceso guardará, por tanto:
- Una lista con todos los usuarios que se encuentran dentro del recinto
- Una lista con todos los usuarios que tienen vetada la entrada al recinto
- El número de usuarios que se encuentran en ese momento en el recinto.
Se pide codificar la clase ControlDeAcceso:
1. Campos o atributos necesarios
2. Constructor de la clase ControlDeAcceso
3. Método vetaUsuario()
4. Método entraUsuario()

Nota: el aforo del recinto es de 10 usuarios. Codifíquelo como una constante.
Implementar el siguiente menú:
1. Introducir usuario al recinto
2. Vetar la entrada a un usuario
3. Salir
