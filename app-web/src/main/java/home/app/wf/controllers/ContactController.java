package home.app.wf.controllers;

import home.app.wf.Contact;
import home.app.wf.rep.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Константин on 03.02.2016.
 */
@RequestMapping("/contacts")
@Controller
public class ContactController {
    private final Logger logger = LoggerFactory.getLogger(ContactController.class);
    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel){
        logger.info("Listing contacts");
        List<Contact> contacts = contactService.findAll();
        uiModel.addAttribute("contacts",contacts);
        logger.info("No, of contacts: " + contacts.size());
        logger.info(String.valueOf(uiModel.containsAttribute("contacts")));
        return "contacts/list";
    }

    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
}
