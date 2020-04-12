/*
 * Copyright (c) 2019. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.javasample.calendarExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SeqGenerateWithDate {

    static int SEQ_NUMBER = 10;

    public static void main(String[] args) {

        String padded = String.format("%05d", SEQ_NUMBER);
        System.out.println(padded);

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        String datetime = ft.format(dNow);

        System.out.println("Token Number"+datetime+padded);
        SEQ_NUMBER++;

        // Table Name : DRUG_ISSUE_TOKEN_GENERATOR
        // Column : DRUG_ISSUE_TOKEN_ID, SERVICE_NAME, CURRENT_DATE, DECIMAL_PADDING, DRUG_SEQUENCE_NO, DRUG_TOKEN_NUMBER

    }
}
