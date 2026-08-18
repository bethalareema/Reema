package com.arrays;

public class StudentDetails {

	public static void main(String[] args) {
		
		 Object[][] student = {
		            {"Sid", "Sname", "Sclg", "Sfee"},
		            {1, "Reema", "St marys", 35000},
		            {2, "Mary", "RVIT", 40000},
		            {3, "anu", "st marys", 45000},
		            {4, "Reena", "Inter", 35000}
		        };

		 
		 String[][]arr= {{}};
		 System.out.println(arr);
		 
		 System.out.println( );
				 
				 for (int i = 0; i < student.length; i++) {

		            for (int j = 0; j < student[i].length; j++) {

		                System.out.print(student[i][j] + "   ");
		            }

		            System.out.println();
		        }
		    }
		}

