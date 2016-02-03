package home.app.wf.rep;

import home.app.wf.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Константин on 03.02.2016.
 */
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
