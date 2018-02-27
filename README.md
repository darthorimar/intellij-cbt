# CBT support for IntelliJ IDEA
This plugin adds support of [CBT build tool](https://github.com/cvogt/cbt) for Scala programming language into IntelliJ IDEA.

It is available in [JetBrains plugin repository](http://plugins.jetbrains.com/plugin/10482-cbt) and can be installled directly within IDEA

Requeres Scala plugin for work 

## Features:
* Creating/importing existing CBT-based projects
* Running and Debugging project code and CBT tasks
* Navigating through libraries sources
* Editting CBT source code on the fly
* Easy task running within IDE

## Installation guide
* Requres IntelliJ IDEA 2017.3+
* Install JetBrains Scala plugin
* Install CBT plugin (can be found by `CBT` keyword)
* Install latest CBT from github ([how to do it](https://github.com/cvogt/cbt#installation))
* On first project creation specify path to CBT **executable** in new project dialog 


## Tutorial
### Run CBT Task
* Creating CBT run configuration ![image](https://user-images.githubusercontent.com/16403337/36747762-ed5700c2-1c06-11e8-995d-0575cee81d76.png)
* Within editor by pressing green *play* button  near the task ![image](https://user-images.githubusercontent.com/16403337/36747763-ed7d0ace-1c06-11e8-8ecd-e401b7c406bb.png)
* Run terminal inside IDEA and run your task there ![image](https://user-images.githubusercontent.com/16403337/36747761-ed314dd2-1c06-11e8-8b25-5169e91df6a8.png)

### Reimport project after changes in build configuration was made
Refreshing a project
To refresh o project you need to enable a `CBT tool panel` just press `ctrl-shift-A` and then enter `cbt`:

![image](https://user-images.githubusercontent.com/16403337/27643459-cdaee64c-5c29-11e7-8c9f-f233da861928.png)

When done a tool panel will appear at the right side: 

![1](https://user-images.githubusercontent.com/16403337/36748131-0038307a-1c08-11e8-865f-26fca84dbd5b.png)

### Creating extra modules
IDEA assumes that all modules which you use are in dependencies (may be transitive) of a root module. If you want to work on some module which is not you can right-click on the directory in the project tree view and then choose `Consider as CBT module` (directory should contains `build` directory with a correct build file).

---

Issues are on github but some previous ones can be found here: https://youtrack.jetbrains.com/issues?q=%23CBT%20

---
^_^
