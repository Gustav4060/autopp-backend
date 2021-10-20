/**
 * 
 */

package com.advancelatam.repositorio.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.advancelatam.modelo.Circula;
import com.advancelatam.repositorio.ICirculaRepo;

/**
 * @author gustavoefrainparcosanchez
 *
 */

@Repository
public class CirculaRepoImpl implements ICirculaRepo {

	@Autowired
	private EntityManager em;

	@Override
	public List<Circula> buscarPorPlaca(char ultimoDigitoPlaca) {
		String nombreCampo = "placa" + ultimoDigitoPlaca;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Circula> cq = cb.createQuery(Circula.class);
		Root<Circula> circula = cq.from(Circula.class);
		Predicate numeroPlacaPredicate = cb.equal(circula.get(nombreCampo), "X");
		cq.where(numeroPlacaPredicate);
		TypedQuery<Circula> query = em.createQuery(cq);
		return query.getResultList();
	}

}
