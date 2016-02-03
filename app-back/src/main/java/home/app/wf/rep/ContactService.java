package home.app.wf.rep;

import home.app.wf.Contact;

import java.util.List;

/**
 * Created by Константин on 03.02.2016.
 */
public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
}
