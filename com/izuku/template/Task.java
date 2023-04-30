package com.izuku.template;

public abstract class Task {
    private AuditTrail auditTrail;

    //default audit 
    public Task() {
      auditTrail=new AuditTrail();
    }

    // for dynamic audits initializaiton
    public Task(AuditTrail auditTrail) {
      this.auditTrail = auditTrail;
    }

    public void execute(){
      auditTrail.record();

      //hook method for childs
      doExecute();
    }

    //childs will implement this method
    protected abstract void doExecute();
  
}
