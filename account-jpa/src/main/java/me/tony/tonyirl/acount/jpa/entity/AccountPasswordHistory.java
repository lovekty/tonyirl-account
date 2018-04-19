package me.tony.tonyirl.acount.jpa.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author tony
 * @since 18-4-20
 */
public class AccountPasswordHistory {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "insert_time", nullable = false)
    @GeneratedValue
    private Date insertTime;
    @Column(name = "update_time", nullable = false)
    @GeneratedValue
    private Date updateTime;
    @Column(name = "is_visible", nullable = false)
    private Boolean visible;
}
