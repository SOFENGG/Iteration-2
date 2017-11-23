package view;

import view.ExternalSearch;

import java.util.ArrayList;

import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import model.Worker;
import util.CommonQuery;

public class ServiceWorker extends ExternalSearch {

	public ServiceWorker(String title) {
		super(title);
		initSearchToggles();
<<<<<<< HEAD
		initServiceWorkers(CommonQuery.getWorkers());
=======
		initServiceWorkers();
>>>>>>> 2733030c2567a0a9e849f46560e86099438740d1
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initSearchToggles() {
		RadioButton idRadio = new RadioButton("ID"),
					nameRadio = new RadioButton("Name");
		idRadio.setToggleGroup(searchToggle);
		idRadio.setUserData("ID");
		nameRadio.setToggleGroup(searchToggle);
		nameRadio.setUserData("Name");
		searchToggle.selectToggle(idRadio);
		
		/* index 0 is searchBox
		 * index 1 is searchTable
		 */
		HBox searchBox = (HBox) promptBox.getChildren().get(0);			
		searchBox.getChildren().addAll(idRadio, nameRadio);
		
		searchButton.setOnAction(e -> {
			switch(searchToggle.getSelectedToggle().getUserData().toString()){
			case "ID": searchTable.reset();
				initServiceWorkers(CommonQuery.getWorkerWithId(Integer.parseInt(searchField.getText())));
				break;
			case "Name": searchTable.reset();
				initServiceWorkers(CommonQuery.getWorkerWithName(searchField.getText()));
				break;
			}
		});
	}

<<<<<<< HEAD
	public void initServiceWorkers(ArrayList<Worker> workers){
		for(Worker w : workers){
			addToServiceSearch(w.getWorkerID(), w.getName(), w.getSalary());
		}
	}
	
	public void initServiceWorkers(Worker w){
		addToServiceSearch(w.getWorkerID(), w.getName(), w.getSalary());
	}
=======
	public void initServiceWorkers(){
		for(Worker w : CommonQuery.getWorkers()){
			addToServiceSearch(w.getWorkerID(), w.getName(), w.getSalary());
		}
	}
>>>>>>> 2733030c2567a0a9e849f46560e86099438740d1
}