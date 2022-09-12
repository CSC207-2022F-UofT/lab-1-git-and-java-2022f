## Lab 1: Using Git and Java
In this 'lab' activity, you'll be familiarizing yourself with Git, GitHub, and Java.

Make sure you've gone through the [Software Installation](https://q.utoronto.ca/courses/278453/pages/software-installation) process.

You may also find the following readings helpful from the [CSC207 Course Notes](https://github.com/CSC207-UofT/207-course-notes):

- [Chapter 0. Introduction to GitHub](https://github.com/CSC207-UofT/207-course-notes/blob/master/00-introduction-to-git.md)
- [Chapter 1. Introduction to Java](https://github.com/CSC207-UofT/207-course-notes/blob/master/01-introduction-to-java.md).

You will also need a [GitHub](https://github.com/) account: if you haven't done so already, you should make one now!

### Task 1: Cloning the repository
Clone this repository to your computer. To do this with IntelliJ, follow these instructions:

- In IntelliJ, create a new project by selecting "Get from version control" (If you already have a project open, close your current project ("File" --> "Close Project")
- Make sure "Version control" is set to "Git"
- In this GitHub repo, press the green "Code" button in the top right and copy the https url to the clipboard and then into IntelliJ.
- IntelliJ will automatically create a directory for your project on your computer (to keep your files organized you can choose where to save it if you want or just use the default)
- Click Clone to setup your project.
- You will be prompted to enter your Github username and password to complete the setup. If this does not work, you may need to use an [Access Token](https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token) instead.

Your project should now be open, and you should have all of these files available to you! IntelliJ should detect the `build.gradle` file and automatically set up the project for you, but this may take a bit of time.

### Task 2: Making a branch
For this lab, you will be making your changes in a **branch** of the repository. You'll want to create a new branch: name the branch with your github username (or another identifier).

How you create a new branch will vary depending on what you're using. In IntelliJ, you can do this by going to the `Git` menu and then selecting `New Branch`: enter your github username (or another identifier) as its name, and create the new branch.

### Task 3: Making changes
In this task you'll be modifying the files `IntroLab.java` and `IntroLabTest.java`. First, you'll need to do a bit of setup:

- On the left panel in IntelliJ, open your project folder and right-click on the folder `java` under `src/main`. Select "Mark directory as" --> "Sources Root"
- Right-click on the folder `java` under `src/test` and select "Mark directory as" --> "Test sources root"

Afterwards, go to `src/main/java/IntroLab` and complete the TODOs: you will need to write a single method here, and call it. If there's any code that you don't understand: refer to [Chapter 1. Introduction to Java](https://github.com/CSC207-UofT/207-course-notes/blob/master/01-introduction-to-java.md)!

When that's done, go to `src/test/java/IntroLabTest` and complete the TODO: you will need to write a single test case that calls the method you wrote.

Make sure you run both of your files to make sure they work properly (both `IntroLab` and `IntroLabTest`)!

### Task 4: Committing your changes
Now that you've changed your files, you'll want to add them so that the changes will be reflected in your branch. To do so in IntelliJ, just right-click the file in the left panel, select `Git` and then `Add`. You should see the name of the file change from blue to green! Do this for both `IntroLab` and `IntroLabTest`.

Afterwards, you'll want to **commit** the changes. In IntelliJ, this can be done by clicking `Git` at the top and then `Commit`. You should see a list of files that have been changed. Modify the `Commit Message` (i.e. the text box above the `Commit` and `Commit and Push...` buttons) with a descriptive message. For example: `Added [method names] to IntroLab and relevant test in IntroLabTest`. To finish this: select `Commit and Push...`. 

**Make sure this is being pushed to your branch and *not* to the master branch!** Otherwise, any new teammates won't have a clean version of the lab to work with.

### Task 5: Making a pull request
Go back to the GitHub repository. You should be able to see your branch by clicking on `master` in the top-left corner and then selecting on your branch (named with your chosen identifier!)

Switch to your branch and open a **Pull Request**. One way of doing this is to click on the `Pull requests` tab and then select `New pull request`. Set the base to `master` and the branch you're merging in as your own branch. Name your pull request accordingly (e.g. `[chosen identifier]'s pull request`) and include a relevant message (e.g. `Completed the lab exercise for [chosen identifier]`). Your teammates will be able to see these messages, so enter whatever you'd like!

When you finish this pull request: congratulations! You're done making your changes and making a pull request! If other teammates have finished the lab exercise, you may want to look at their branches and their pull requests.

### (OPTIONAL) Task 6: Using 'Issues'
One way to communicate problems is to use the `Issues` feature on GitHub. Click on the `Issues` tab in your repository: you can give your issue a title and a message.

In the future, you'll want to use this to raise mention of any bugs you run into. But for now: use this to communicate with your teammates! Open an issue and introduce yourself, and let them know you've finished with your pull request.

Leave comments on your teammate's "issues" as well. Take this time to experiment with GitHub's features!

### (OPTIONAL) Task 7: Merging into the master
**You should only do this if every member of your team is done with Task 5!** Otherwise, any teammates that have yet to finish won't have a clean version of the lab to work with.

When all of your teammates are done with the lab, you'll want to try to merge with the master branch. To do this in the GitHub interface, simply go to the pull request page and select `Merge pull request`: if there's no conflicts, you should easily be able to merge! If there *is* a conflict, you'll want to fix it so you can merge it in.
