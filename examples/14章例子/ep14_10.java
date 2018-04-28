import java.awt.*;
import java.net.*;
import java.awt.event.*;
import java.io.*;
import javax.media.*;

class JMFWindow extends Frame implements ControllerListener, Runnable,
		ItemListener {
	Player player;
	String str;
	Thread thread;
	Choice choice;
	Component visualComponent, controlComponent;
	URL mediaURL;

	JMFWindow() {
		thread = new Thread(this);
		choice = new Choice();
		choice.add("clock.avi");
		choice.add("swipeall.avi");
		choice.add("VIDTEST.avi");
		choice.addItemListener(this);
		add(choice, BorderLayout.NORTH);
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (player != null) {
					player.stop();
					player.deallocate(); // 释放所占的外部资源
				}
				System.exit(0);
			}
		});
		validate();
	}

	public synchronized void controllerUpdate(ControllerEvent event) {
		player.getDuration();
		if (event instanceof RealizeCompleteEvent) {
			if ((visualComponent = player.getVisualComponent()) != null)
				add(BorderLayout.CENTER, visualComponent);
			if ((controlComponent = player.getControlPanelComponent()) != null)
				if (visualComponent != null)
					add(BorderLayout.SOUTH, controlComponent);
				else
					add(BorderLayout.CENTER, controlComponent);
			validate();
		} else if (event instanceof PrefetchCompleteEvent) {
			player.start();
		}
	}

	public void itemStateChanged(ItemEvent e) {
		str = "c:\\java_work\\14\\" + choice.getSelectedItem();
		if (player == null) {
		} else {
			player.stop();
			player.deallocate();
		}
		if (visualComponent != null)
			remove(visualComponent);
		if (controlComponent != null)
			remove(controlComponent);
		validate();
		if (!(thread.isAlive())) {
			thread = new Thread(this);
		}
		try {
			thread.start();
		} catch (Exception ee) {
		}
	}

	public synchronized void run() {
		try {
			File file = new File(str);
			mediaURL = file.toURL();
			player = Manager.createPlayer(mediaURL);
			player.getDuration();
			if (player != null) {
				player.addControllerListener(this);
			} else
				System.out.println("无法创建播放器");
		} catch (Exception e) {
			System.out.println(e);
		}
		if (player != null) {
			player.prefetch();
		}
	}
}

public class ep14_10 {
	public static void main(String args[]) {
		JMFWindow win = new JMFWindow();
	}
}