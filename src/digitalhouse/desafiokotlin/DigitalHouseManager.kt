package digitalhouse.desafiokotlin

class DigitalHouseManager {
    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        listaCursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.removeIf { it.codigo == codigoCurso }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professor = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        listaProfessores.add(professor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val professor = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
        listaProfessores.add(professor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        listaProfessores.removeIf { it.codigo == codigoProfessor }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = listaCursos.find { it.codigo == codigoCurso }
        if (curso == null) {
            println("Curso não encontrado!")
            return
        }

        val aluno = listaAlunos.find { it.codigo == codigoAluno }
        if (aluno == null) {
            println("Aluno não encontrado!")
            return
        }

        val matriculaOk = curso.adicionarUmAluno(aluno)
        if (matriculaOk) {
            val matricula = Matricula(aluno, curso)
            listaMatriculas.add(matricula)
            println("Matrícula do(a) aluno(a) $aluno no curso $curso realizada.")
        } else {
            println("Matrícula do(a) aluno(a) $aluno no curso $curso não realizada pois não há vagas.")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val curso = listaCursos.find { it.codigo == codigoCurso }
        if (curso == null) {
            println("Curso não encontrado!")
            return
        }

        val professorTitular = listaProfessores.find { it.codigo == codigoProfessorTitular && it is ProfessorTitular }
        if (professorTitular == null) {
            println("Professor titular não encontrado!")
            return
        }

        val professorAdjunto = listaProfessores.find { it.codigo == codigoProfessorAdjunto && it is ProfessorAdjunto }
        if (professorAdjunto == null) {
            println("Professor adjunto não encontrado!")
            return
        }

        curso.alocarProfessores(professorTitular as ProfessorTitular, professorAdjunto as ProfessorAdjunto)
    }
}