package domain;

import java.util.List;

public class Alumno
{
    private List<Materia> materiasAprobadas;

    public boolean tieneAprobadas(List<Materia> materias)
    {
        return this.materiasAprobadas.containsAll(materias);
    }

    public Alumno(List<Materia> materiasAprobadas)
    {
        this.materiasAprobadas = materiasAprobadas;
    }
}
