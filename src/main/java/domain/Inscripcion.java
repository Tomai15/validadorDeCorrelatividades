package domain;

import java.util.List;

public class Inscripcion
{
    private List<Materia> materiasAinscribirse;
    private Alumno alumno;

    public boolean aprobada()
    {
        return this.materiasAinscribirse.
                stream().
                allMatch(unaMateria -> unaMateria.correlativasAprobadas(this.alumno));
    }

    public Inscripcion(List<Materia> materiasAinscribirse, Alumno alumno)
    {
        this.materiasAinscribirse = materiasAinscribirse;
        this.alumno = alumno;
    }
}
