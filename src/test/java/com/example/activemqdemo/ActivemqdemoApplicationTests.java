package com.example.activemqdemo;

import com.example.activemqdemo.Entity.Applicant;
import com.example.activemqdemo.Entity.Education;
import com.example.activemqdemo.Producer.ProducerResource;
import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivemqdemoApplicationTests {

	@Autowired
	ProducerResource producer;

	@Test
	void testProducer() {
		producer.publish("hello ActiveMQ");
	}

	@Test
	void testJsonFormatMessage(){
		Applicant mike = new Applicant();
		mike.setName("Michael Wang");
		mike.setAge(24);
		mike.setAccountNumber("yw04008");
		mike.setEmail("michael.wang@citi.com");

		Education mikeEducation = new Education();
		mikeEducation.setUniversity("University College London");
		mikeEducation.setMajor("Computer Science");
		mikeEducation.setYearOfGraduate("2020");

		mike.setEducation(mikeEducation);

		Gson gson = new Gson();
		String messageJson = gson.toJson(mike);
		producer.publish(messageJson);
	}

	@Test
	void testXMLFormatMessage() throws JSONException {
		Applicant mike = new Applicant();
		mike.setName("Michael Wang");
		mike.setAge(24);
		mike.setAccountNumber("yw04008");
		mike.setEmail("michael.wang@citi.com");

		Education mikeEducation = new Education();
		mikeEducation.setUniversity("University College London");
		mikeEducation.setMajor("Computer Science");
		mikeEducation.setYearOfGraduate("2020");

		mike.setEducation(mikeEducation);

		Gson gson = new Gson();
		String messageJson = gson.toJson(mike);
		JSONObject jsonObject = new JSONObject(messageJson);
		String xml = XML.toString(jsonObject);
		System.out.println(xml);

	}

}
