package SetFlie;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class UseFliesAbsoultePath {

	public static void main(String[] args) throws IOException {
		File fl=new File("F:\\core java\\File\\shashi");
		System.out.println(fl.canRead());
		System.out.println(fl.canExecute());
		System.out.println(fl.canWrite());
		System.out.println(fl.getAbsolutePath());
		System.out.println(fl.getUsableSpace());
		System.err.println(new Date(fl.getUsableSpace()));
		System.out.println(fl.lastModified());
		System.err.println(new Date(fl.lastModified()));
		System.out.println(Arrays.toString(fl.list()));
		System.out.println(fl.mkdir());
//		System.out.println(fl.is);
		System.out.println(fl.isHidden());
		//			System.out.println(fl1);
		//		}
		//		System.out.println(fl.exists());
		//		//		System.out.println(	fl.delete());
		//		System.out.println(fl.createNewFile());
	}

}
