package amezon-payments-v1.0;

import amezon-payments-v1.0.res.Contact;
import amezon-payments-v1.0.res.MyProperties;
import amezon-payments-v1.0.res.Person;
import amezon-payments-v1.0.res.logo_png;

import java.util.Arrays;
import java.util.List;

/**
 * Utilize a small sampling of core Manifold features to demonstrate the
 * structure of a basic project using Manifold. Use the pom.xml file as a
 * template for your own project.
 * <p/>
 * Play with this in IntelliJ IDEA using the <b>Manifold</b> plugin:
 * <pre>
 * File | Settings | Plugins | Browse Repositories | Manifold
 * </pre>
 * Use features such as: Navigation, Code completion, Find Usages, Rename Refactor, Move Refactor, Go To Declaration, etc.
 */
public class Main {
  public static void main(String[] args) {
    useJsonSample();
    useJsonSchema();
    useImage();
    useProperties();
    useCustomExtension();
    useProvidedExtension();
  }

  private static void useJsonSample() {
    Person person = Person.create();
    person.setName("Alice");
    person.setAddress(Person.Address.create());
    Person.Address address = person.getAddress();
    address.setCity("Cupertino");
    address.setState("CA");
    System.out.println(person.toJson());
  }

  private static void useJsonSchema() {
    Contact contact = Contact.create();
    contact.setName("Bob");
    contact.setPrimaryAddress(Contact.Address.create());
    Contact.Address primaryAddress = contact.getPrimaryAddress();
    primaryAddress.setCity("Cupertino");
    primaryAddress.setState("CA");
    System.out.println(contact.toJson());
  }

  private static void useImage() {
    logo_png logoImage = logo_png.get();
    System.out.println(logoImage.getIconWidth());
  }

  private static void useProperties() {
    System.out.println(MyProperties.Chocolate);
    System.out.println(MyProperties.Chocolate.dark);
    System.out.println(MyProperties.Chocolate.milk);
  }

  private static void useCustomExtension() {
    String hello = "hello";
    hello.echo();
  }

  private static void useProvidedExtension() {
    List<Integer> list = Arrays.asList(1, 2, 3);
    System.out.println(list.first());
    System.out.println(list.join(" and then "));
  }
}
