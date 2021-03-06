package cz.cvut.kbss.jopa.model;

import cz.cvut.kbss.benchmark.model.Vocabulary;
import cz.cvut.kbss.jopa.model.annotations.*;

import java.net.URI;
import java.util.Objects;
import java.util.Set;

@OWLClass(iri = Vocabulary.s_c_Person)
public class Person extends Object implements cz.cvut.kbss.benchmark.model.Person<Object,Trope>{
    @OWLObjectProperty(iri = Vocabulary.s_c_has_trop, fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Set<Trope> tropes;
    @OWLAnnotationProperty(iri = Vocabulary.s_p_label)
    private String name;
    @Id
    private URI uri;

    @OWLDataProperty(iri = Vocabulary.s_p_has_key)
    private String key;

    @OWLDataProperty(iri = Vocabulary.s_p_firstName)
    private String firstName;

    @OWLDataProperty(iri = Vocabulary.s_p_lastName)
    private String lastName;

    @OWLDataProperty(iri = Vocabulary.s_p_accountName)
    private String username;

    @OWLDataProperty(iri = Vocabulary.s_p_password)
    private String password;

    @OWLDataProperty(iri = Vocabulary.s_p_contact)
    private Set<String> contacts;

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }


    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getId() {
        return uri.toString();
    }


    @Override
    public Set<Trope> getTrope() {
        return tropes;
    }

    @Override
    public void setTrope(Set<Trope> tropes) {
        this.tropes=tropes;
    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Set<String> getContacts() {
        return contacts;
    }

    @Override
    public void setContacts(Set<String> contacts) {
        this.contacts = contacts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(uri, person.uri) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(username, person.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, firstName, lastName, username);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " <" + uri + ">";
    }



    @Override
    public Set getobjectparts() {
        return null;
    }

    @Override
    public void setObjectpart(Set objectpart) {

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
