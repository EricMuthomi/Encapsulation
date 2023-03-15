    // Java program to demonstrate encapsulation
    class Encapsulate {
        /* private variables declared
         these can only be accessed by
         public methods of class*/
        private String anonymousName;
        private int anonymousRole;
        private int anonymousAge;

        // get method for age to access
        // private variable anonymousAge
        public int getAge() {
        return anonymousAge;
        }

        // get method for name to access
        // private variable anonymousName
        public String getName() {
        return anonymousName;
        }

        // get method for roll to access
        // private variable anonymousRole
        public int getRoll() {
        return anonymousRole;
        }

        // set method for age to access
        // private variable anonymousAge
        public void setAge(int newAge) {
        anonymousAge = newAge;
        }

        // set method for name to access
        // private variable anonymousName
        public void setName(String newName)
        {
        anonymousName = newName;
        }

        // set method for roll to access
        // private variable anonymousRole
        public void setRoll(int newRoll) {
        anonymousRole = newRoll;
        }
    }



