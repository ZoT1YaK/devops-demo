package via.doc1.devopsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import via.doc1.devopsdemo.model.TeamMember;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, String> { 

}