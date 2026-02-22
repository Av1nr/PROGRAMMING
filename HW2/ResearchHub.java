public class ResearchHub <T extends  LabaratoryItem>{
    private T[] storage;
    private int count;

    public ResearchHub(){
        storage = (T[]) new LabaratoryItem[2];
    }
    public void register(T item){
        if(count == storage.length){
            T[] newstorage = (T[])new LabaratoryItem[storage.length *2];
            for(int i = 0 ; i < storage.length ; i++){
                newstorage[i] = storage[i];
            }
            storage = newstorage;
        }
        storage[count] = item;
        count++;
    }
    public void release(int index){
        T[] newstorage = (T[])new LabaratoryItem[count - 1];
        for (int i = 0 ; i < index ; i++){
            newstorage[i] = storage[i];
        }
        for (int i= index + 1 ; i < count; i++){
            newstorage[i -1] = storage[i];
        }
        storage = newstorage;
        count--;
    }
    public int indexOf(T item){
        for (int i = 0 ; i < storage.length ; i++){
            if (storage[i] == item){
                return i;
            }
        }
        return -1;
        //-1 будет значить , что такого элемента нет
    }
    public void clearByHazardLevel (int limit){
        //Тут можно добавить реализацию валидации через Сканнер, но я думаю , он пока не к чему
        for (int i = 0 ; i < storage.length ; i++){
            if (storage[i].getBiohazardLevel() > limit){
                release(i);
            }
        }
    }
    public void adjustPurity(Number offset , Number multiplier){
        for(int i = 0 ; i < storage.length ; i++){
            if(storage[i] instanceof ResearchSample){
                 ((ResearchSample)storage[i]).setPurity((((ResearchSample) storage[i]).getPurity().doubleValue() + offset.doubleValue()) * multiplier.doubleValue());
            }
        }
    }
    public double getAveragePurity(){
        double summ = 0;
        int counter = 0;
        for(int i = 0 ; i < storage.length ; i++){
            if(storage[i] instanceof ResearchSample){
                 summ += ((ResearchSample<?>) storage[i]).getPurity().doubleValue();
                 counter++;
            }
        }
        return summ / counter;
    }
    public boolean checkSession(T item , Integer Session){
        //Лучше сравнить через equals , вдруг будут оба до 127 , но разные , дошел я значит до 4 сценария и там просят через == , пришлось переписать
        return item.getSessionID() ==Session;
    }
    public int getCount(){
        return count;
    }

    public T[] getStorage() {
        return storage;
    }
}
