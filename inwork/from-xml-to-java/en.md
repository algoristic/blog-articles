[//]: # (
    don't forget to add links to all related topics, platforms etc.
    add prerequisites after finishing the article -> eclipse, xml, basic java
)

# From XML to Java - done right
In this tutorial you will learn:
- how to deserialize XML contens to Java objects and vice versa
- how to completely avoid writing your own parser for that purpose (using **JAXB** and the inbuilt features of **Eclipse IDE**)
- the basics of XSD (XML Schema Definition)

## Introduction
When it comes to data exchange in various cases you will make use of data in XML format. No matter why you are doing so (in many modern applications you will prefer JSON) there is one thing you shouldn't do: **write you own parser**. Man, I mean, we are *flying to Mars*, you shouldn't parse your data *by hand* in 2019...

The obvious reasons is: there are libraries, that will do that more effiecient and reliable. You can do that for a homework in your studies, but when your boss catches you doing that, you are in need of an explanation. So, ~~if you heard of Java SAX Parser~~ we will use JAXB for that.

## Tutorial
#### Method
1. We start devising a XML structure for our purpose. This is maybe an unpopular approach but definitely has some benefits as you will see.
1. When we are sure our structure fits our needs, we will derive a XSD. This feels maybe a bit unnatural to you, but in fact it is the equivalent of planning such a structure in Java. **Plus**: When we are done, we have a fixed XSD Structure we can give to any involved party, so the data exchange format is clear to everyone<sup>[1](#footnote-1)</sup>. This is *of course* a requirement, when we want to create an understandable and maintainable application (*believe me*, I worked in a company that used bloated XML files for numerous purposes and had no XSD or DTD anywhere... it's no fun to extend such a structure or just to understand the enviroment that has grown to process those files). Besides: when deriving a XSD from a XML you **really** have to think about what you do and how to make it extensible for future developments without making it too generic or overdevelop it.
1. We use the inbuilt features of Eclipse IDE to create our classes.
1. Profit... ?

### Getting Started
I prerequisite you have installed and are using Eclipse IDE. If that is not the case, I highly encourage you to do that, because we will make use of one of its' features. I will be using Eclipse IDE 2019-09 (for [Enterprise Java Developers](https://www.eclipse.org/downloads/packages/release/2019-09/r/eclipse-ide-enterprise-java-developers)) because that is the latest version.

We also need data to work with. For that purpose I come up with a poorly designed XML schema to save information about employees:
```xml
<employee personnelNumber="1337" gender="m">
  <name>
    <titles>
      <title>Prof.</title>
      <title>Dr.</title>
    </titles>
    <forename>Boba</forename>
    <surname>Fett</surname>
  </name>
  <birthday date="1977-05-04" location="Modesto, California" />
  <contact>
    <address>
      <street houseNumber="1200 - 1298">Tamarind Ave</street>
      <city postalCode="90038" state="CA">Los Angeles</city>
    </address>
  </contact>
</employee>
```
Why do we use a structure like that one above? There is no benefit in developing a sophisticated model here, that would just be overengineering... Also: the above model fits my needs: We will need to make use of some basic features of XSD to develop a schema for that structure. These features will allow you to understand the concept of XSD and will allow you to create a schema for most XML you will face.

As you can see, we will define a structure of so called "Complex Types". A complex type is any node that holds a value more complex, than a single `string` or `int`. Our `employee` is such a type, that holds subnodes of `name`, `birthday` and `contact`. Some nodes will have attributes, some not. Most of the XML is self-explaining, but here are some points, that are maybe not:
- The attribute `gender` of `employee` holds the value of "m" in our example. We will create a XSD that restricts the values of `gender` to `m`, `f` and `d`. That is nice, because it is just semantically correct!. Without any programmed logic we can make sure, that we get only the correct values!
- The type `titles` of `name` contains a list of `title`. This list consists of any number of titles, from none to infinite and will allow us to display any combination of educational degree. (We will restrict the possible values here to "Prof." and "Dr.", but only because of my lazyness.)
- The attribute `date` of `birthday` will be automatically validated using the YYYY-MM-DD format (see [w3schools.com](https://www.w3schools.com/XML/schema_dtypes_date.asp)) for more information on this).

[//]: # (### Developing the XSD)

[//]: # (### Generating Classes and XML)

[//]: # (
    show how to generate xml and java from xsd with screenshots
)

[//]: # (### Testing)

[//]: # (### Summary)
-----

<sup><a name="footnote-1">1</a></sup> Of course we can archieve that the other way round too. **But** when we start writing our Java classes and annotate them to create a XSD, we will need to make use of third party software that comes as an extra dependency for our application.
