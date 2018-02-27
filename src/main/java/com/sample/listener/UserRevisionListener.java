/**
 * This class sets the userId attribute in the Audit table
 */
package com.sample.listener;


import org.hibernate.envers.RevisionListener;

import com.sample.entity.AuditEnversInfo;


/**
 * @author HsuWaiWaiTun
 *
 */
public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
        AuditEnversInfo auditEnversInfo = (AuditEnversInfo) revisionEntity;
        auditEnversInfo.setUserId("Admin");
        // Can use Spring Security to return currently logged in user
        // auditEnversInfo.setUserId(SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername());
    }

}
