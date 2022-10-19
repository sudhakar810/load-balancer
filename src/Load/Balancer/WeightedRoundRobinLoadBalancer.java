package Load.Balancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeightedRoundRobinLoadBalancer extends LoadBalancer {

	public WeightedRoundRobinLoadBalancer(List<String> ipList) {
		super(ipList);
		// TODO Auto-generated constructor stub
	}

	public WeightedRoundRobinLoadBalancer(Map<String,Integer> ipMap) {
		super(ipMap);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getServer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<String> getServerIpByWeight() {
		List<String> ips = new ArrayList<>();
		for(Entry<String,Integer> entry : ipMap.entrySet()) {
			String ip = entry.getKey();
			Integer weight = entry.getValue();
			for(int ipCount =0 ;ipCount<weight;ipCount++) {
				ips.add(ip);
			}
		}
		return ips;
	}

	
}
