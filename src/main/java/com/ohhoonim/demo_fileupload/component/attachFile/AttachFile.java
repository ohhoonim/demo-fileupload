package com.ohhoonim.demo_fileupload.component.attachFile;

import com.ohhoonim.demo_fileupload.component.dataBy.DataBy;
import com.ohhoonim.demo_fileupload.component.id.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttachFile {

    private Id id;
    private String name;
    private String path;
    private Long capacity;
    private String extension;
    private DataBy creator;

}
