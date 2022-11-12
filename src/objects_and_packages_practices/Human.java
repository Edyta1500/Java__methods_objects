package objects_and_packages_practices;



public class Human {

    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;


    public String getName() {
        return name;
    }

    public boolean isMale() {
        return gender.equals("male");
         }

        public int getAge () {
            return age;
        }

        public int getWeight () {
            return weight;
        }

        public int getHeight () {
            return height;
        }
    }




