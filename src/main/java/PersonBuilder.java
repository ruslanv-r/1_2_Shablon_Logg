public class PersonBuilder implements IPersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String city;


    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name==null || name.isEmpty()) {
            throw new IllegalStateException("Поле с менем обязательно для заполнения");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        if (surname==null || surname.isEmpty()) {
            throw new IllegalStateException("Поле с фамилией обязательно для заполнения");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalStateException {
        if (age < 0) {
            throw new IllegalStateException("Возраст не может отображпться отрицательными числами");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setCity(String city){

            this.city = city;

        return this;
    }

    @Override
    public Person build() throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Поле с именем не заполнено");
        }
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Поле с фамилией не заполнено");
        }
        Person person;

        person = new Person(name,surname);

        if(person.hasAge(age)){
            person.setAge(age);
        }

        if(person.hasCity(city)){
            person.setCity(city);
        }

        return person;
    }


}
