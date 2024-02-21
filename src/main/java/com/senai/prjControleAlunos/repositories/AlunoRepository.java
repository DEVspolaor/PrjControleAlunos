package com.senai.prjControleAlunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.prjControleAlunos.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
