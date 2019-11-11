import Planes.ExperimentalPlane;
import Models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> planes;



    public List<PassengerPlane> getPaseengerPlaneList() {
        List<PassengerPlane> passengerPlaneList = new ArrayList<>();
        for (Plane plane : planes) {if (plane instanceof PassengerPlane) {passengerPlaneList.add((PassengerPlane) plane);}}
        return passengerPlaneList;
    }

    public List<MilitaryPlane> getMilitaryPlanesList() {
        List<MilitaryPlane> militaryPlanesList = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanesList.add((MilitaryPlane) plane);
            }
              }
        return militaryPlanesList;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanesList = getPaseengerPlaneList();
        PassengerPlane planeWithMaxCapacity = passengerPlanesList.get(0);
        for (int i = 0; i < passengerPlanesList.size(); i++) {
            if (passengerPlanesList.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanesList.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanesList() {
        List<MilitaryPlane> transportMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanesList = getMilitaryPlanesList();
        for (int i = 0; i < militaryPlanesList.size(); i++) {
            MilitaryPlane plane = militaryPlanesList.get(i);
            if (plane.getType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanesList.add(plane);
            }
        }
        return transportMilitaryPlanesList;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanesList() {
        List<MilitaryPlane> bomberMilitaryPlanesList = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getMilitaryPlanesList();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanesList.add(plane);
            }
        }
        return bomberMilitaryPlanesList;

    }

    public List<ExperimentalPlane> getExperimentalPlanesList() {
        List<ExperimentalPlane> experimentalPlanesList = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanesList.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanesList;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}

