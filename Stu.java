package com.mn;

public class Stu {
	private int Id;//学号
	  private String name;//姓名
	  private boolean gender;//性别
	  private String birDate;//年龄
	  public Stu() {
	    super();
	  }
	  public int getId() {
	    return Id;
	  }
	  public void setId(int Id) {
	    this.Id = Id;
	  }
	  public String getName() {
		    return name;
		  }
	  public void setName(String name) {
	    this.name = name;
	  }  
	  public boolean getGender() {
	    return gender;
	  }
	  public void setGender(boolean gender) {
	    this.gender = gender;
	  }
	  public String getBirDate() {
	    return birDate;
	  }
	  public void setBirDate(String birDate) {
	    this.birDate = birDate;
	  }
}
