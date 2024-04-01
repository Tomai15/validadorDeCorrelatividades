package domain;

import java.util.List;

public class Materia
{
    private List<Materia> correlativas;

    public Materia(List<Materia> correlativas)
    {
        this.correlativas = correlativas;
    }

    public boolean correlativasAprobadas(Alumno alumno)
    {
        return alumno.tieneAprobadas(this.correlativas);
    }
}
