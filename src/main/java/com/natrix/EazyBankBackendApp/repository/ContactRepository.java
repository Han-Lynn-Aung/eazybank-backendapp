package com.natrix.EazyBankBackendApp.repository;

import com.natrix.EazyBankBackendApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepository extends JpaRepository<Contact,String> {
}
