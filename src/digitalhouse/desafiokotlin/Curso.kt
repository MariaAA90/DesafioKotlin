package digitalhouse.desafiokotlin

class Curso(val nome: String, val codigo: Int, val qtdMaximaAlunos: Int) {
    var professorTitular: ProfessorTitular? = null
    var professorAdjunto: ProfessorAdjunto? = null
    val listaAlunos = arrayListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunos.size < qtdMaximaAlunos) {
            listaAlunos.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunos.remove(umAluno)
    }

    fun alocarProfessores(professorTitular: ProfessorTitular, professorAdjunto: ProfessorAdjunto) {
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Curso) return false

        return this.codigo == other.codigo
    }

    override fun toString(): String {
        return "$codigo - $nome"
    }
}