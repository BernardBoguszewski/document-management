package pl.com.bottega.documentmanagement.domain;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by bernard.boguszewski on 31.07.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class DocumentTest {

    @Mock
    private DocumentNumber anyNumber;

    @Mock
    private Employee anyEmployee;

    private String anyContent = "test content";
    private String anyTitle = "test title";
    private static Long EPS = 2L * 1000L;


    @Test
    public void shouldCreateDocumentWithInitialState(){
        //given


        //when
        Document document = new Document(anyNumber, anyContent, anyTitle, anyEmployee);

        //then
        assertEquals(anyNumber, document.number());
        assertEquals(anyContent, document.content());
        assertEquals(anyTitle, document.title());
        assertEquals(anyEmployee, document.creator());
        assertFalse(document.deleted());
        assertEquals(DocumentStatus.DRAFT, document.status());

    }

    @Test
    public void shouldVerifiedDocument(){
        //given
        Document document = new Document(anyNumber, anyContent, anyTitle, anyEmployee);

        //when
        document.verify(anyEmployee);

        //then
        assertEquals(anyEmployee, document.verificator());
        assertEquals(DocumentStatus.VERIFIED, document.status());
        assertNotNull(document.verifiedAt());
        assertTrue(Math.abs(new Date().getTime() - document.verifiedAt().getTime()) < EPS);



    }

    @Test
    public void shouldRequireVerificatorOtherWay(){
        //given
        Document document = new Document(anyNumber, anyContent, anyTitle, anyEmployee);

        //when
        try{
            document.verify(null);
        }catch (IllegalArgumentException ex){
            return;
        }
        fail("IllegalArgumentException expected");

        //then


    }
}
