# CSC372 - Module 3 Weekly Project

## Overview
A JavaFX desktop application featuring a menu bar with four options for displaying the date and time, logging text to a file, changing the background color, and exiting the program.

## Requirements
- Java 21 (Liberica JDK with JavaFX bundled)
- JavaFX 21 (included with Liberica JDK)

## How to Run
1. Open the project in VSCode
2. Run `MenuApp.java`

## Menu Options
- **Display date and time** - Displays the current date and time in the text area in MM/DD/YYYY HH:MM:SS AM/PM format
- **Write to log.txt** - Writes the current contents of the text area to a file named `log.txt` in the project directory
- **Change background color** - Changes the frame background to a randomly generated green hue. The hex color value is displayed in the menu option. The same color is reused for the entire execution of the program and a new color is only generated on the next run
- **Exit** - Closes the application

## Files
- `MenuApp.java` - Main application file
- `log.txt` - Generated when the second menu option is selected

## Notes
- The random green hue is generated once at startup and remains consistent for the entire program execution
- The hex value of the green hue is displayed in the third menu option label
