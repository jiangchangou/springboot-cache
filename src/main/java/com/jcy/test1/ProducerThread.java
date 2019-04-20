package com.jcy.test1;

/**
 * 生产者 线程
 * 
 * @author jcy-pc
 *
 */
public class ProducerThread extends Thread {

	private Resource resource;

	public ProducerThread(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		// 不断地生产资源
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.add();
		}
	}
}
