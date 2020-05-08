package com.cognizant.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> list = new ArrayList<>();

	public void addSubscriber(INotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		list.add(notificationObserver);
		
		list.forEach(l -> System.out.println(l));
	}

	public void removeSubscriber(INotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		list.remove(notificationObserver);
		list.forEach(l -> System.out.println(l));
	}

	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver observer : list) {
			observer.OnServerDown();
		}
	}

}