[//]: # (
    don't forget to add links to all related topics, platforms etc.
)

# From XML to Java - done right
In this tutorial you will learn
- how to deserialize XML contens to Java objects and vice versa
- how to completely avoid writing your own parser for that purpose (using JAXB and the inbuilt features of Eclipse IDE)
- the basics of XSD (XML Schema Definition)

## Introduction
When it comes to data exchange in various cases you will make use of data in XML format. No matter why you are doing so (in many modern applications you will prefer JSON) there is one thing you shouldn't do: **write you own parser**. Man, I mean, we are *flying to Mars*, you shouldn't parse your data *by hand* in 2019...

The obvious reasons is: there are libraries, that will do that more effiecient and reliable. You can do that for a homework in your studies, but when your boss catches you doing that, you are in need of an explanation. So, ~~if you heard of Java SAX Parser~~ we will use JAXB for that.

## Tutorial
### Method
1. We start devising a XML structure for our purpose. This is maybe an unpopular approach but definitely has some benefits as you will see.
1. When we are sure our structure fits our needs, we will derive a XSD. This feels maybe a bit unnatural to you, but in fact it is the equivalent of planning such a structure in Java. **Plus**: When we are done, we have a fixed XSD Structure we can give to any involved party, so the data exchange format is clear to everyone<sup>[1](#footnote-1)</sup>. This is *of course* a requirement, when we want to create an understandable and maintainable application (*believe me*, I worked in a company that used bloated XML files for numerous purposes and had no XSD or DTD anywhere... it's no fun to extend such a structure or just to understand the enviroment that has grown to process those files).
1. We use the inbuilt features of Eclipse IDE to create our classes.
1. Profit... ?

[//]: # (### Getting Started)

[//]: # (### Developing the XSD)

[//]: # (### Generating Classes and XML)

[//]: # (### Testing)

[//]: # (### Summary)

[//]: # (
    emph. the benefits: when deriving a xsd from a xml you REALLY have to think about what you do and how to make it extensible for future developments -> also emph.: when building the xsd DON'T try to cover every future case that comes to your mind, that's not necessary! Just implement what your customer needs and implement your structures extensible!
)

[//]: # (
    show how to generate xml and java from xsd with screenshots
)

-----
<sup><a name="footnote-1">1</a></sup> Of course we can archieve that the other way round too. **But** when we start writing our Java classes and annotate them to create a XSD, we will need to make use of third party software that comes as an extra dependency for our application.
