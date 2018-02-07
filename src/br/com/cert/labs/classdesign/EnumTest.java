package br.com.cert.labs.classdesign;

interface E {
	String getX();
}

enum EnumI implements E {
	
	EA {
		public String getX() {
			return "EA";
		}
	},
	EB,
	EC,
	ED;
		
	public String getX() {
		return "Others";
	}
	
}

enum EnumI2 {
	
	EA {
		public String getAbX() {
			return "AbEA";
		}
	},
	EB{
		public String getAbX() {
			return "AbEB";
		}
	},
	EC{
		public String getAbX() {
			return "AbEC";
		}
	},
	ED{
		public String getAbX() {
			return "AbED";
		}
	};
	
	public abstract String getAbX();
	
}

enum EnumI3 {
	
	
	EA("a") {
		public String getX() {
			return "XEA " + getDesc();
		}
	},
	EB("b"),
	EC("c");

	private final String desc;
	
	EnumI3(String desc) {
		this.desc = desc;
	}
	
	public String getX() {
		return getDesc();
	}
	
	public String getDesc() {
		return this.desc;
	}
	
}

public class EnumTest {
	
	public static void main(String args[]) {
		System.out.println(EnumI.EA.getX());
		System.out.println(EnumI.ED.getX());

		System.out.println();
		
		System.out.println(EnumI2.EA.getAbX());
		
		System.out.println();

		System.out.println(EnumI3.EA.getX());
		System.out.println(EnumI3.EB.getX());

	}

}