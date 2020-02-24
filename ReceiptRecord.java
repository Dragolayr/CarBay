package com.servlet;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ReceiptRecord")
public class ReceiptRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ReceiptRecord() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		ArrayList<Recipients> recipients =  (ArrayList<Recipients>)session.getAttribute("recipients");
		
		if(recipients == null) {
			recipients=new ArrayList<>();
		}
		
		Recipients newRecipients = new Recipients();
		
		
		newRecipients.setFirstName(request.getParameter("recipientsFirstName"));
		
		newRecipients.setLastName(request.getParameter("recipientsLastName"));
		
		newRecipients.setEmail(request.getParameter("recipientsEmail"));
		
		
		
		recipients.add(newRecipients);
		
		session.setAttribute("recipients", recipients);
		
		final String path = "C:\\Users\\Dragolayr\\Documents\\recipients.txt";
		
		try {  // if
//			String list = Arrays.toString(recipients.toArray()).replace("[", "").replace("]", "");
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write(newRecipients.toString()); //writes data to the array list. 
			bw.close(); //closes the writer after its done
		}catch (IOException e) {  //else
			System.out.println("ERROR WRITING TO FILE");
		}
		
		RequestDispatcher rs=request.getRequestDispatcher("RecipientsRecord.jsp"); //this takes you to the location.jsp
		rs.forward(request, response);
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
