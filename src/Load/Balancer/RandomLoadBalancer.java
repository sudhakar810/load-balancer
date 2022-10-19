package Load.Balancer;

import java.util.List;
import java.util.Random;

public class RandomLoadBalancer extends LoadBalancer {

	public RandomLoadBalancer(List<String> ipList) {
		super(ipList);
		
	}

	@Override
	public String getServer() {
		Random random = new Random();
		int index = random.nextInt(ipList.size());
		return ipList.get(index);
	}

}
