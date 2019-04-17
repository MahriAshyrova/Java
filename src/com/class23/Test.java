package com.class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("-----Creating Employee object-------");
		Employee emp= new Employee();
		System.out.println(Employee.department);
		Employee.work();
		// emp.work(); - not preferred way 
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("-----Creating ScrumTeam object-------");
	
		ScrumTeam st= new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, Burn-down chart";
		st.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("-----Creating Developer object-------");
		
		Developer dev= new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("-----Creating Tester object-------");
		
		Tester qa= new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint Backlog";
		qa.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		System.out.println("-----Creating Business Analyst object-------");
		
		BusinessAnalyst ba= new BusinessAnalyst();
		ba.salary=100000;
		ba.getPaid();
		ba.artifacts="Sprint Backlog, Product Backlog";
		ba.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		
		
		System.out.println("-----Creating Scrum Master object-------");
		
		ScrumMaster sm= new ScrumMaster();
		sm.salary=100000;
		sm.getPaid();
		sm.artifacts="Burn-down chart";
		sm.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		
		
		System.out.println("-----Creating Product Owner object-------");
		
		ProductOwner po= new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint Backlog, Product Backlog";
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		
		
		System.out.println("-----Creating Front End Developer object-------");
		
		FrontEndDev fe= new FrontEndDev();
		fe.salary=120000;
		fe.getPaid();
		fe.artifacts="Sprint Backlog, Product Backlog";
		fe.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.code();
		fe.doHtml();
		
		
		System.out.println("-----Creating Back End Developer object-------");
		
		BackEndDev be= new BackEndDev();
		be.salary=110000;
		be.getPaid();
		be.artifacts="Sprint Backlog, Product Backlog";
		be.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.code();
		be.doSql();
		
		
		System.out.println("-----Creating Manual Tester object-------");
		
		ManualTester mt= new ManualTester();
		mt.salary=115000;
		mt.getPaid();
		mt.artifacts="Sprint Backlog, Product Backlog";
		mt.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.test();
		mt.testManually();
		
		
		System.out.println("-----Creating Automation Tester object-------");
		
		AutomationTester at= new AutomationTester();
		at.salary=125000;
		at.getPaid();
		at.artifacts="Sprint Backlog, Product Backlog";
		at.ceremonies="Sprint Grooming, Sprint Planning, Sprint Daily StandUp, Sprint Demo, Sprint Retro";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		mt.test();
		at.codeInJava();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
