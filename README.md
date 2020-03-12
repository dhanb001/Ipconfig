# IPConfigure Java Programming Evaluation

### Table Of Contents

1. **Access Instructions**
2. **Download Instructions**\
  2a. Cloning the Repository in Eclipse\
  2b. Accessing the Repository in Eclipse
3. **JavaDoc Access**
4. **Programming Questions**\
  4a. Inheritance\
  4b. Generics\
  4c. Object Comparison\
  4d. Greatest Common Divisor
5. **Developer Diary**

## Access Instructions

In order to access the java files I have created, it is **highly** recommended that you use an Eclipse IDE.\
The files in this project were created using Eclipse. Eclipse auto-builds files and projects, meaning build scripts aren't necessary
for compilation and creation in Eclipse.\
\
This README file will explain how to run each of the specific projects and will give any additional info regarding them.
I will also include a developer diary of sorts at the end, so feel free to view that if you wish.\
\
It is assumed from this point forward that Eclipse is being used to run these programs, 
therefore instructions will be directed to work in Eclipse.
## Download instructions
To download these files, click clone or download on the main page of the repository https://github.com/dhanb001/Ipconfig

![Clone or download from here](IPConfig/cloneordownload.PNG)

The clone URL is: https://github.com/dhanb001/Ipconfig.git

Once you have the clone URL. Open your Eclipse IDE

### Cloning the repository in Eclipse

1. Go to your workbench in Eclipse.
2. Click the Quick Access box in the upper right corner and type in *"Clone a github repository"*
![Quick Access](IPConfig/quickaccess.PNG)


3. Select Clone a github repository.


4. Once selected, this should appear:
![Clone Repository Box](IPConfig/clonegitrepository.PNG)


5. Now, place the clone URL from github into the top box titled URI.


6. Once you have entered the URL, enter your Github User and Password below.
![Entered URL and Credentials](IPConfig/enterurlanduserid.PNG)\
Once your screen looks similar to this, press **next.**


7. Now select a local directory to store the cloned project. **Be sure to remember the location you stored it.**
![Find a local directory to store](IPConfig/nowselectnext.PNG)


8. Now press **Finish.**



### Accessing the Repository

You've successfully cloned the repository, but you still need to access it in your workspace.
![Where's my repository?](IPConfig/needtoimport.PNG)



There's a few steps we need to take to accomplish that.


1. Go to the quick access box in the corner, and type in *"Open Projects from File System"
![Quick Access](IPConfig/quickaccess.PNG)



2. Once you've opened the quick access tab, you should see this.
![Open from file system](IPConfig/openfromfilesystem.PNG)



3. Now, navigate to the directory where you stored the repository.
![The repository location](IPConfig/selectthisfolder.PNG)
And select the folder named IPConfig.



4. Now just press **finish.**
![Finish it](IPConfig/afterselecting.PNG)


You're done!


Now your screen should look like this:\
![No opened folders](IPConfig/itshouldbethere.PNG)



And if you open the folders, they should look like:
![Opened folders](IPConfig/whattheyshouldlooklike.PNG)



Now we just need to run the projects.

But first, we'll go over how to access the JavaDocs for these projects.

## JavaDoc Access

Accessing the JavaDocs in Eclipse is fairly simple and only takes a few steps.

1. Open the *doc* package under the src folder.


2. Select *allclasses-index.html* and open it.
![Open this for Javadocs](IPConfig/toopenjavadocs.PNG)



3. Once you have opened allclasses, your screen should look like this:


![Should look like](IPConfig/fancyjavadoc.PNG)



4. The JavaDoc is now open, and you can browse freely throughout the documentation. If you'd like to see an overview, 
select overview from the upper bar.


![Overview of JavaDoc](IPConfig/overview.PNG)



Now you have access to the JavaDoc files, feel free to navigate around as much as you like and examine the documentation.

## Programming Questions

The 4 programming questions were answered in individual packages for easy separation.

1. Inheritance- **shapes** package.


2. Generics- **generics** package.


3. Object Comparison- **objectcomparison** package.


4. Greatest Common Divisor- **divisor** package.\
NOTE: The gcdfail package was my first (failed) attempt to solve question 4, use it to see my thought process.

### 1) Inheritance
For this question, navigate to the shapes package and open *Shapetester.java*\
![Run shapetester](IPConfig/rightclickandrunas.PNG)


To run this program, right click on *ShapeTester.java* and select **run as.** Then select *Java Application.*


This program's console output runs through a thorough demonstration of the question.
If you would like to view it, start from the beginning of the console output and read until the end.


All other classes for this question can be found in the shapes package.



### 2) Generics
For this question, navigate to the generics package and open *CollectionTester.java*\
![Collection Tester](IPConfig/collectiontest.PNG)


To run this program, right click on *CollectionTester.java* and select **run as.** Then select *Java Application.*


This program's console output runs through a thorough demonstration of the question.
If you would like to view it, start from the beginning of the console output and read until the end.


All other classes for this question can be found in the generics package.



### 3) Object Comparison
For this question, navigate to the objectcomparison package and open *BookCompare.java*\
![Book Compare](IPConfig/bookcompare.PNG)


To run this program, right click on *BookCompare.java* and select **run as.** Then select *Java Application.*


This program's console output runs through a thorough demonstration of the question.
If you would like to view it, start from the beginning of the console output and read until the end.


The other classes for this question can be found in the objectcomparison package.



### 4) Greatest Common Divisor
For this question, navigate to the divisor package and open *GreatestDivisor.java*\
![Greatest Divisor](IPConfig/greatestdivisor.PNG)


To run this program, right click on *GreatestDivisor.java* and select **run as.** Then select *Java Application.*


This program's console output **does not run through a thorough demonstration of the question.**\
Careful examination of the code in all .java files in this package is required for this question. However, comments are frequent and the code is fairly easy to follow.

The other classes for this question, and the text file used for input can be found in the divisor package.

## Developer Diary

  First, I would like to say that these questions have been extremely helpful in my learning of Java. I thought I knew a fairly large amount, but these questions forced me to teach myself much more than I thought necessary. However, I used my copy of Oracle's *Java The Complete Reference Ninth Edition* to teach myself the necessary concepts and strategies in order to complete these questions. I have learned more from these assignments than I have learned in a single semester in the classroom.


  Regarding the individual questions, I started with the 3rd prompt on Object Comparison. I originally had everything for the prompt in a **Single** class. It worked fine but it showed my ineptitude when starting the project. I came back and divided the class into the BookCompare driver and the Book class. The change was simple, but it massively improved readability.
  
  After completing Question 3, I moved on to Question 1 and Inheritance. This one was fairly easy, it just involved Shapes, interfaces and overloading methods. I planned this one out beforehand so I knew exactly what I needed to do. We did similar programs in C++ and Java in CS 330 at ODU, so this one was familiar. Polymorphism is a fairly easy concept, so I didn't have too much trouble explaining it in the output. 
  
  After Question 1, I moved to Question 2 and Generics. This question took me quite a while to understand. I had experience with templates in C++, but generics have some noticeable differences. I referenced my Oracle Java guide quite often for this section, and it paid off. Honestly, the most difficult part of this section was implementation of the concepts. I wasn't sure how to implement a generic interface into an abstract class and show that I did it in the output. Because the class is abstract, it can't be made into an instance of an object, and therefore had to be inherited by other classes. In the end, I ended up choosing ArrayList collections of either Integers or Doubles. This is mainly because Integers and Doubles are very different, yet they are comparable in some ways, which would show inheritance. The generics were used to define the min() and max() methods, which would return the minimum and maximum of a given set as long as the type is Comparable. It took a lot of planning to get this question answered properly, but I managed to pull it off (in my opinion at least).
  
  The last question was Question 4, which covered Greatest Common Divisor. This question was the most difficult by far. I had only heard of lambdas prior to this point, and had never seen or used them in my ODU courses. I referenced my book to find out more and I learned quite a bit about them. They were actually pretty easy and useful once I understood them. However, the real problem came when it was time to integrate lambdas with threads. I knew nothing about threads, and had to learn about them entirely online. I managed to find some good resources that helped me get a running base going. Everything I learned, and the thought process I went through can be seen in the *gcdfail* package. The *gcdfail* package was a very uncoordinated and unplanned attempt to solve the problem. The lack of cohesion and consistency is obvious if you look at the program, and this forced me to re-do everything. The result of re-doing everything is the *divisor* package. The *divisor* package is a much more concise, refined approach to the GCD prompt and it is much easier to follow than *gcdfail*. I incorporated the formulas, certain snippets, and any other useful information from *gcdfail* into my finalized *divisor* class. Overall, I'm happy with the way *divisor* turned out, and I hope it does a good job of explaining the concepts.
  
  
  I'd like to thank you all for giving me the chance to prove myself and take part in an awesome learning experience. These questions and the process as a whole has taught me much more about the Computer Science field than any of my courses. Thank you all for your time, and I hope you didn't find this project TOO ridiculously long.
  
  
  
But I will say, **my thoroughness was intentional.**
