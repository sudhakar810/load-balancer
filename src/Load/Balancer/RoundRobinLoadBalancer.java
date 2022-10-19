package Load.Balancer;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class RoundRobinLoadBalancer extends LoadBalancer {
	
   private int counter = 0;
   private final ReentrantLock lock;
   
	public RoundRobinLoadBalancer(List<String> ipList) {
		super(ipList);
		this.lock = new ReentrantLock();
	}

	@Override
	public String getServer() {
		lock.lock();
		try {
		   String ip = ipList.get(counter);
		   counter++;
		   if(counter == ipList.size()) {
			   counter = 0;
		   }
		   return ip;
		}finally {
			lock.unlock();
		}
		
	}

	
}
