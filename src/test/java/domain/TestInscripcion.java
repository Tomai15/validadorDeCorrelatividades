package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInscripcion {
    @Test
    public void puedeCursarAnalisis2() {
        Materia fisica1 = new Materia(new ArrayList<>());
        Materia analisis1 = new Materia(new ArrayList<>());

        List<Materia> correlativasFisica2 = new ArrayList<Materia>();
        correlativasFisica2.add(fisica1);
        correlativasFisica2.add(analisis1);

        Materia fisica2 = new Materia(correlativasFisica2);

        Alumno alumnoDeFisica2 = new Alumno(correlativasFisica2);

        List<Materia> listaFisica2 = new ArrayList<Materia>();
        listaFisica2.add(fisica2);

        Inscripcion inscripcionAlumnoAM2 = new Inscripcion(listaFisica2, alumnoDeFisica2);

        Assert.assertTrue(inscripcionAlumnoAM2.aprobada());
    }

    @Test
    public void noPuedeCursarParadigmas() {
        Materia algoritmos = new Materia(new ArrayList<>());
        Materia matematicaDiscreta = new Materia(new ArrayList<>());

        List<Materia> correlativasParadigmas = new ArrayList<Materia>();
        correlativasParadigmas.add(algoritmos);
        correlativasParadigmas.add(matematicaDiscreta);

        Materia paradigmas = new Materia(correlativasParadigmas);
        correlativasParadigmas.add(algoritmos);

        List<Materia> materiasDelAlumno = new ArrayList<Materia>();
        Alumno alumnoDeAnalisis2 = new Alumno(materiasDelAlumno);

        List<Materia> listaParadigmas = new ArrayList<Materia>();
        listaParadigmas.add(paradigmas);

        Inscripcion inscripcionAlumnoAM2 = new Inscripcion(listaParadigmas, alumnoDeAnalisis2);

        Assert.assertFalse(inscripcionAlumnoAM2.aprobada());
    }
}
