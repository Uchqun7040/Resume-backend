package net.idrok.Resumes.repository;

import net.idrok.Resumes.entity.Contact;
import net.idrok.Resumes.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume,Long> {
}
