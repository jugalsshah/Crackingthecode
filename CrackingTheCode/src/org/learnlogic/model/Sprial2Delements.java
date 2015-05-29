//package org.learnlogic.model;
//
//public class Sprial2Delements {
//	
//	public int arrA[][] = { { 1, 2, 3, 4, 5 }, { 18, 19, 20, 21, 6 },
//            { 17, 28, 29, 22, 7 }, { 16, 27, 30, 23, 8 },
//            { 15, 26, 25, 24, 9 }, { 14, 13, 12, 11, 10 } };
//	
//	public void printSpiral(int row_s,int row_e,int col_s, int col_e,boolean rev, boolean rowcomplete){
//		
//		if(row_s>row_e && col_s>col_e){
//			return ;		
//		}
//		if(row_s<row_e){
//			for(int i=col_s;i<=col_e;i++){
//				System.out.println(""+arraA[i][col_s]);
//			}
//		}
//		
//	}
//	
//	public static void main(String args[]) {
//        
//		Spiral2Delements p= new Sprial2Delements();
//        
//        p.printSpiral(0, 5, 0, 4, false, false);
//    }
//
//}
