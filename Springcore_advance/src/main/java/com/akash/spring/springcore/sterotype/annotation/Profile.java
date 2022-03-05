package com.akash.spring.springcore.sterotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Profile {
	@Value("Java")
	String topicCover;
	@Value("xyz")
	String Company;

	public String getTopicCover() {
		return topicCover;
	}

	public void setTopicCover(String topicCover) {
		this.topicCover = topicCover;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "Profile [topicCover=" + topicCover + ", Company=" + Company + "]";
	}

}
