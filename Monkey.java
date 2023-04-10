public class Monkey extends RescueAnimal{
    //variables for the class
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    public Monkey (String name, String gender, String age,
                    String weight, String acquisitionDate, String acquisitionCountry,
                    String trainingStatus, boolean reserved, String inServiceCountry,
                    String tailLength, String height, String bodyLength, String species) {
                    setName(name);
                    setSpecies(species);
                    setGender(gender);
                    setAge(age);
                    setWeight(weight);
                    setTailLength(tailLength);
                    setBodyHeight(height);
                    setAcquisitionDate(acquisitionDate);
                    setAcquisitionCountry(acquisitionCountry);
                    setTrainingStatus(trainingStatus);
                    setReserved(reserved);
                    setInServiceCountry(inServiceCountry);
                    }

                    public void setTailLength(String tailLength){
                        this.tailLength = tailLength;
                    }
                    public void setHeight(String height){
                        this.height = height;
                    }
                    public void setBodyLength(String bodyLength){
                        this.bodyLength = bodyLength;
                    }
                    public void setSpecies(String species){
                        this.species = species;
                    }
                    //getters for the variables
                    public String getTailLength(){
                        return tailLength;
                    }
                    public String getHeight(){
                        return height;
                    }
                    public String getBodyLength(){
                        return bodyLength;
                    }
                    public String getSpecies(){
                        return species;
                    }
                }
