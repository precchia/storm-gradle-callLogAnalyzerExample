# storm-gradle-callLogAnalyzerExample
## What is this repository about?
This repository contains just an example of a storm topology built using gradle.
The topology itself comes from a tutorialspoint tutorial:
https://www.tutorialspoint.com/apache_storm/apache_storm_working_example.htm

It does not do much:
- it injects fake call logs through a spout
- and sums the duration by phone number through two bolts.

The interesting point is actually the build.gradle file used to build and run the topology itself.

## Why I did this repository?
I'm not a Java programmer, but I happen to play from time to time with technology.

I did this repository because I was trying to build a topology with gradle.
Searched a bit on the internet, but found nothing really helpful
Then, when I tried to configure logging, I was pretty sure I had done something already in that area. So I searched on my hard drive.
And there... I discovered that everything I was doing today, I had done already some 4 months ago!

So at least now there is on the internet a template project to build a storm topology wihtin gradle.
Even better, it is done by someone I know, and even trust to some extent
