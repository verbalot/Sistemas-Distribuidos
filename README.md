# Sistemas-Distribuidos
Practica Sistemas Distribuidos
Bilioteca Online
La web consiste en la reserva de libros de libros online. La biblioteca tiene los libros clasificados por temas, y una vez elegido el tema, reservaremos el libro. 
  -	Cuando un libro esté reservado, no podrá ser reservado por ningún otro usuario. (un libro un solo usuario) .
  -	Se le asignará un plazo de días para tener reservado el libro. En caso de sobrepasar el plazo, se le penalizará sin poder reservar.
  -	Cada usuario puede tener reservados solamente tres libros.
Funciones públicas y privadas.
Publicas:
  -	El usuario solo tiene permiso para visualizar los libros y poder reservar un máximo de tres.
Privadas:
  -	El administrador puede modificar datos del usuario, añadir y borrar libros.
  
Integrantes del equipo de desarrollo:
  - Jesus Banegas Urda. Direccion correo: j.banegas@alumnos.urjc.es
  - Albino Aparicio Ormeño. Direccion correo: a.aparicioo@alumnos.urjc.es
  - Antonio Vizcaino Moraga. Direccion correo: a.vizcainom@alumnos.urjc.es
  - Cuenta de GitHub: https://github.com/verbalot/Sistemas-Distribuidos
  
Nombre y descripción de cada una de las 4 o 5 entidades principales.
  - Administrador: Crea, modifica y elimina un usuario. También crea, modifica y elimina un libro.
  - Usuario: El usuario tiene su propio login y un password.
  - Persona: En esta tabla guardaremos los datos del usuario (nombre, apellido, direccion, telefono, email)
  - Libro: En ella guardaremos el id del libro, el título, autor y género.
  - Formulario Prestamo: Tabla en la que validaremos a un usuario, iniciamos un prestamo, consultamos el prestamo y por último lo finalizamos
  - Prestamo: Guardaremos en esta tabla un código, fecha, un usuario y el libro.
  
