package controlasistencia

class Curso {
    String apellido
    
    static hasMany = [alumnos: Alumno]

    static constraints = {
    }
}
