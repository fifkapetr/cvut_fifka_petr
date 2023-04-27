package p106.lab05;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import p106.lab04.refactoring.DBManager;
import p106.lab04.refactoring.Mail;
import p106.lab04.refactoring.MailHelper;

import static org.mockito.Mockito.times;

public class MockMailHelperTest {

    DBManager mockDBManager = Mockito.mock(DBManager.class);
    MailHelper mailHelper = new MailHelper(mockDBManager);

    @Test
    public void positiveVerifySendMailOnce() {
        mailHelper.sendMail(Mockito.anyInt());
        Mockito.verify(mockDBManager, Mockito.times(1))
                .findMail(Mockito.anyInt());
    }

    @Test
    public void negativeVerifySendMainTwice() {
        mailHelper.sendMail(10);
        Mockito.verify(mockDBManager, times(2))
                .findMail(10);
    }
    @Test
    public void mockTest() {
        int mailId = 1;
        mailHelper.setMail("MockedTo", "MockedSubject", "MockedBody");
        Mail mail = mailHelper.getMail();
        Mockito.when(mockDBManager.findMail(mailId)).thenReturn(mail);
        mailHelper.sendMail(mailId);
        System.out.println(mailHelper.getMail().getBody());
        //check that findMail was called 1 time
        Mockito.verify(mockDBManager).findMail(mailId);
    }


}
