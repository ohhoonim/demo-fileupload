package com.ohhoonim.demo_fileupload.attachFile;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import com.ohhoonim.demo_fileupload.component.attachFile.AttachFileController;
import com.ohhoonim.demo_fileupload.component.attachFile.AttachFileService;

@WebMvcTest(AttachFileController.class)
public class AttachFileControllerTest {
    
    @Autowired
    MockMvcTester mockMvc;

    @MockitoBean
    AttachFileService attachFileService;

    @Test
    void uploadFileTest() {
        when(attachFileService.uploadFiles(any())).thenReturn(List.of());

        MockMultipartFile mockFile = new MockMultipartFile(
            "files", 
            "test-file.txt",
            "text/plain",
            "Hello, this is test file.".getBytes()
        );

        mockMvc.post().uri("/api/attachFile/upload")
                .multipart().file(mockFile)
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .assertThat().apply(print())
                .hasStatusOk();
    }
}
