package com.example1;

public class EmailBuilderTest {

	public static void main(String[] args) {
        Email email1 = Email.builder("alice@example.com", "Meeting Tomorrow")
                .body("Let's meet at 10am in conference room B.")
                .build();

        Email email2 = Email.builder("bob@example.com", "Project Update")
                .cc("carol@example.com")
                .cc("dave@example.com")
                .bcc("manager@example.com")
                .body("Attached is the Q4 report.")
                .priority("high")
                .attachment("q4-report.pdf")
                .attachment("summary.xlsx")
                .build();

        System.out.println(email1);
        System.out.println();
        System.out.println(email2);

	}

}
