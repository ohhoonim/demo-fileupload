package com.ohhoonim.demo_fileupload.component.dataBy;

import java.time.LocalDateTime;

public final class Modified implements DataBy {

    private String modifier;
    private LocalDateTime modified;

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

}
