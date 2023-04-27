package p107.lab05;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import p107.lab04.refactoring.DBManager;
import p107.lab04.refactoring.Mail;
import p107.lab04.refactoring.MailHelper;

public class MockMailHelperTest {

    DBManager mockDBManager = Mockito.mock(DBManager.class);
    MailHelper mailHelper = new MailHelper(mockDBManager);

    @Test
    public void positiveVerifySendMailOnce() {
        mailHelper.sendMail(5);
        Mockito.verify(mockDBManager).findMail(5);
    }

    @Test
    public void negativeVerifySendMailTwice() {
        mailHelper.sendMail(3);
        Mockito.verify(mockDBManager, Mockito.times(2))
                .findMail(3);
    }

    @Test
    public void negativeVerifySendMailWithDifferentParameter() {
        mailHelper.sendMail(5);
        Mockito.verify(mockDBManager)
                .findMail(3);
    }

    @Test
    public void mockTest() {
        int mailId = 1;
        mailHelper.setMail("MockedTo", "MockedSubject",
                "MockedBody");
        Mail mockedMail = mailHelper.getMail();

        Mockito.when(mockDBManager.findMail(mailId)).thenReturn(mockedMail);
        mailHelper.sendMail(mailId);
        System.out.println(mailHelper.getMail().getBody());
    }
}
