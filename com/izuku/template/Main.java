package com.izuku.template;

public class Main {
    public static void main(String[] args) {
      TransferMoneyTask transfer = new TransferMoneyTask();
      transfer.execute();

      GenerateReportTask report = new GenerateReportTask();
      report.execute();
    }
}
