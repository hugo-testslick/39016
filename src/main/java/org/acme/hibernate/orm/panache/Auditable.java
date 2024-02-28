package org.acme.hibernate.orm.panache;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Embeddable
public class Auditable {

    @Column(name = "created_at", updatable = false, nullable = false)
    @CreationTimestamp
    public LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    public LocalDateTime updatedAt;

}
