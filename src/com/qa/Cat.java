package com.qa;

public class Cat {
    private String name;
            private int age;
                private String breed;

                    // Constructor
        public Cat(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

            // Accessor methods (getters)
        public String getName() {
            return name;
        }

            public int getAge() {
                return age;
            }

                public String getBreed() {
                    return breed;
                }

                    // Mutator methods (setters)
        public void setName(String name) {
            this.name = name;
        }

            public void setAge(int age) {
                this.age = age;
            }

                public void setBreed(String breed) {
                    this.breed = breed;
                }

                    // toString method to display the Cat's information
        @Override
        public String toString() {
            return "Cat: [Name: " + name + ", Age: " + age + ", Breed: " + breed + "]";
        }


}
