//PART A
public int walkDogs(int hour) {
        
    int numDogs = company.numAvailableDogs(hours);

    if(maxDogs > numDogs) {
        company.updateDogs(hour, numDogs);
          return numDogs;
    } else {
        company.updateDogs(hour, maxDogs);
        return maxDogs;
    }
