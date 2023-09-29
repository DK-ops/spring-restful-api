package zach.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zach.restful.entity.Address;
import zach.restful.entity.Contact;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, String> {

    Optional<Address> findFirstByContactAndId(Contact contact, String id);

    List<Address> findAllByContact(Contact contact);
}
