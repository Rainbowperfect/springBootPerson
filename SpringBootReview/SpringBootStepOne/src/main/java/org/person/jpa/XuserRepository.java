package org.person.jpa;

import org.person.pojo.Xuser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XuserRepository extends JpaRepository<Xuser,Integer> {
}
