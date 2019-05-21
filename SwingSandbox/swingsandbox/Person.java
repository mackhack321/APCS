package swingsandbox;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
	private String name;
	private int age;
	private String dob;
	private String hobby;
	
	public Person(String namein, int agein, String dobin, String hobbyin)
	{
		name = namein;
		age = agein;
		dob = dobin;
		hobby = hobbyin;
	}
	
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getDOB() {return dob;}
	public String getHobby() {return hobby;}
	
	public Person(String file) throws IOException
	{
		buildFromJSON(new File(file));
	}
	
	public String buildJSON() throws IOException
	{
		String json = "{\n";
		json += "\t\"name\": \""+name+"\"\n";
		json += "\t\"age\": "+age+"\n";
		json += "\t\"dob\": \""+dob+"\"\n";
		json += "\t\"hobby\": \""+hobby+"\"\n";
		json += "}";
		BufferedWriter wr = new BufferedWriter(new FileWriter(name+".json"));
		wr.write(json);
		wr.close();
		return json;
	}
	
	public Person buildFromJSON(File file) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(file));
		String[] lines = new String[6];
		for (int i = 0; i < 6; i++)
		{
			lines[i] = br.readLine();
		}
		name = lines[1].trim().split("\"")[3];
		age = Integer.valueOf(lines[2].split(":")[1].trim());
		dob = lines[3].trim().split("\"")[3];
		hobby = lines[4].trim().split("\"")[3];
		br.close();
		return new Person(name,age,dob,hobby);
	}
	
	public String toString()
	{
		return name+" is "+age+", was born on "+dob+", and has a hobby of "+hobby+".";
	}
	
	public static void main(String[] args) throws IOException
	{
		
	}
}
