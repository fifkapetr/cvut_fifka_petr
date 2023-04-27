package p107.lab04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p107.lab04.refactoring.DBManager;
import p107.lab04.refactoring.MailHelper;

public class MailHelperTests {

    private String to = "email@template.org";
    private String body = "Mail body";
    private String subject = "Mail subject";
    private boolean isSent = false;
    private MailHelper mailHelper;

    @BeforeEach
    public void setMail() {
        mailHelper = new MailHelper(new DBManager());
        mailHelper.setMail(to, subject, body);
    }

    @Test
    public void setMail_setToHasCorrectValue_setHasCorrectValue() {
        Assertions.assertEquals(to, mailHelper.getMail().getTo());
    }

    @Test
    public void setMail_setSubjectHasCorrectValue_setHasCorrectValue() {
        Assertions.assertEquals(subject, mailHelper.getMail().getSubject());
    }

    @Test
    public void setMail_setBodyHasCorrectValue_setHasCorrectValue() {
        Assertions.assertEquals(body, mailHelper.getMail().getBody());
    }

    @Test
    public void setMail_setIsSent_false() {
        Assertions.assertFalse(mailHelper.getMail().isSent());
    }
}
