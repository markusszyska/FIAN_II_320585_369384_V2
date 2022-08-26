package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface PlugInVersion{
	public int major();
	int minor();
}

@PlugInVersion(major = 3, minor = 0)
class MyPlugin{
	//Plugin Zeug hier
}


public class Demo01_Annotationen_Definieren {
	public static void main(String[] args) {
		PlugInVersion version = MyPlugin.class.getAnnotation(PlugInVersion.class);
		System.out.println(version.major());
		System.out.println(version.minor());
	}
}
