package org.mtc.pattern.bridge;

import org.mtc.pattern.bridge.drawer.ImageDrawer;
import org.mtc.pattern.bridge.drawer.LinuxDrawer;
import org.mtc.pattern.bridge.drawer.MacDrawer;
import org.mtc.pattern.bridge.drawer.WindowsDrawer;
import org.mtc.pattern.bridge.tomatrix.BmpToMatrix;
import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;
import org.mtc.pattern.bridge.tomatrix.JpgToMatrix;
import org.mtc.pattern.bridge.tomatrix.PngToMatrix;

/*
 * 	桥接模式（Bridge）：将多级继承关系转为关联关系，通过在创建对象时进行组合的方式产生多种对象，避免类爆炸
 * 
 * 	桥接模式用于应对一种很少见但很不好解决的情况：一条继承链里出现了两个变化因素，两个因素互相影响，需要子类一一对应的实现
 * 	当两个因素各有3个情况，就需要9个子类，当各有5个情况，则需要25个，类爆炸已经近在眼前
 * 
 * 	当这种情况出现时，就可以考虑让桥接模式来收拾烂摊子了。
 * 
 * 
 * 	由于这种情况实在少见，我来举一个不常见情况的例子：不同平台不同格式的图片显示
 * 
 * 	如果只使用继承，那么需要至少三级继承，前两级一级是平台，一级是格式，最后一级是实现，这就导致了前两级要一一对应，最后一级类爆炸
 * 
 * 	如果使用桥接模式，首先需要将继承关系转为关联关系，我们把显示图片拆成两个步骤：
 * 	1.将图片转为一个我们定义的数据结构，这个结构是我们程序内部的，它脱离平台；但转化过程依赖于图片格式
 * 	2.根据这个数据结构显示图像，这一步依赖于平台；但显示的根据是我们定义的数据结构，与图片格式脱离
 * 	这样一来多级继承关系就转变为了 [ 图像 -> 自定义数据 -> 显示 ] 的关系
 * 
 * 	之后将这两个步骤分开写两个继承体系，网络上一般的演示是一个步骤写成接口，一个步骤写成抽象类，抽象类里保存对接口的引用（描述有点绕，代码更清晰）
 * 	在使用时在创建抽象类的实现类对象时将接口的实现类对象存进去，由接口实现类对象和抽象类实现类对象各自进行一个步骤
 * 	这样只要对每种格式写一个转化实现类，每种平台写一个显示实现类，在使用时进行组合，就可以避免类爆炸的发生
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		final String jpgFile = "根据手机壳改变颜色的图片.jpg"; // 三个String代表三种图片文件
		final String pngFile = "五彩斑斓的黑.png";
		final String bmpFile = "Hello World.bmp";

		ImageToMatrix jpgToMatrix = new JpgToMatrix(); // 三个 ImageToMatrix 代表将三种格式的图片转为显示矩阵的对象
		ImageToMatrix pngToMatrix = new PngToMatrix();
		ImageToMatrix bmpToMatrix = new BmpToMatrix();

		ImageDrawer windowsJpgDrawer = new WindowsDrawer(jpgToMatrix); // 三种平台的 ImageDrawer 和三种格式的 ImageToMatrix 组合成9种对象
		ImageDrawer windowsPngDrawer = new WindowsDrawer(pngToMatrix); // 在创建绘制对象时将转化对象传进去，这是桥接模式的经典步骤，当然只要最后存进去就行，不一定要这么经典
		ImageDrawer windowsBmpDrawer = new WindowsDrawer(bmpToMatrix);
		ImageDrawer linuxJpgDrawer = new LinuxDrawer(jpgToMatrix);
		ImageDrawer linuxPngDrawer = new LinuxDrawer(pngToMatrix);
		ImageDrawer linuxBmpDrawer = new LinuxDrawer(bmpToMatrix);
		ImageDrawer macJpgDrawer = new MacDrawer(jpgToMatrix);
		ImageDrawer macPngDrawer = new MacDrawer(pngToMatrix);
		ImageDrawer macBmpDrawer = new MacDrawer(bmpToMatrix);

		windowsJpgDrawer.draw(jpgFile);
		windowsPngDrawer.draw(pngFile);
		windowsBmpDrawer.draw(bmpFile);
		linuxJpgDrawer.draw(jpgFile);
		linuxPngDrawer.draw(pngFile);
		linuxBmpDrawer.draw(bmpFile);
		macJpgDrawer.draw(jpgFile);
		macPngDrawer.draw(pngFile);
		macBmpDrawer.draw(bmpFile);
	}
}
