package com.sunjray;

import java.util.Date;

public class WriteToFile extends Thread {
	FileCreationIndividualName fcp;

	public static void main(String[] args) {
		WriteToFile th = new WriteToFile();
		th.start();

	}

	@Override
	public void run() {
		while (true){

		// TODO Auto-generated method stub
		System.out.println("Timer task started at:" + new Date());
		completeTask();
		System.out.println("Timer task finished at:" + new Date());
		try {
			Thread.sleep(1 * 1000 * 60);
		} catch (InterruptedException e) {
		}
		}
	}

	public void completeTask() {

		try {
			fcp = new FileCreationIndividualName();
			fcp.createFile("smallfile", "Timer task started at:" + new Date());
			System.out.println("Successfully wrote to the file.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
