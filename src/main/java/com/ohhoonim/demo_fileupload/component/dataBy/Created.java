package com.ohhoonim.demo_fileupload.component.dataBy;

import java.time.LocalDateTime;

public final class Created implements DataBy {

    private String creator;
    private LocalDateTime created;

    public Created() {
        this.created = LocalDateTime.now();
    }

    public Created(String creator) {
        this.creator = creator;
        this.created = LocalDateTime.now();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

}
