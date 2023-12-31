package com.cjc.hl.em.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.em.main.model.Document;
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
