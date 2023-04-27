package br.fiap.app.exemplo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.fiap.app.exemplo.models.Viagem;

	@Repository
	public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
		@Query(value="select id, data_decolagem, dias_estadia, quantidade_assento, modelo_nave, nome_primeirocomandante, matricula_primeirocomandante, nome_segundocomandante, matricula_segundocomandante from viagem where id = ?;", nativeQuery = true)
		List<Viagem> findByIdViagems(Integer id);
	}
