package com.ohhoonim.demo_fileupload.component.attachFile;

import com.ohhoonim.demo_fileupload.component.dataBy.DataBy;
import com.ohhoonim.demo_fileupload.component.id.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttachFileGroup {

    private Id id;
    private Id entityId;
    private AttachFile fileId;
    private DataBy creator;
}
