package com.test.question.obj;

class Employee {

	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 2 || name.length() > 5) {
			return;
		}

		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (c < '가' || c > '힣') {
				return;
			}
		}

		this.name = name;

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if (!department.equals("영업부") && !department.equals("기획부")) {
			return;
		}
		this.department = department;
	}

	public String getPosition() {
		return position;

	}

	public void setPosition(String position) {
		if (!position.equals("부장") && !position.equals("과장") && !position.equals("대리") && !position.equals("사원")) {
			return;

		}
		this.position = position;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel.indexOf("-") != 3 || tel.lastIndexOf("-") != tel.length() - 5) {
			return;
		}

		String temp = tel.replace("-", "");

		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			if (c < '0' || c > '9') {
				return;
			}
		}
		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		if (boss == null) {
			return;
		}
		if (this.name.equals(boss.getName()) && this.department.equals(boss.getDepartment())&& this.position.equals(boss.getPosition()) && this.tel.equals(boss.getTel())) {

			return;
		}
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		this.boss = boss;
	}

	public void info() {
		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서: %s\n", this.department);
		System.out.printf("- 직위: %s\n", this.position);
		System.out.printf("- 연락처: %s\n", this.tel);

		if (this.boss != null) {
			System.out.printf("- 직속상사: %s(%s %s) \n", this.boss.getName(), this.boss.getDepartment(),
					this.boss.getPosition());
		} else {
			System.out.println("- 직속상사: 없음");
		}
	}
}