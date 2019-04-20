package com.jcy.test1;

/**
 * 消费者 线程
 * 
 * @author jcy-pc
 *
 */
public class ConsumerThread extends Thread {
	private Resource resource;

	public ConsumerThread(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.remove();
		}
	}
}
