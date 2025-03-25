

 ### Arsalan Saleem ###

# Lab 3: Observer Pattern Implementation

This repository contains two implementations of the Observer Pattern:

## Question 1: Basic Observer Pattern with Detach Functionality

### Overview
This implementation demonstrates a basic Observer Pattern based on the TutorialsPoint example, with added functionality to detach observers.

### Implementation Details
- **Subject**: Maintains a list of observers and notifies them of state changes
- **Observer**: Abstract class that concrete observers extend
- **Concrete Observers**:
  - `BinaryObserver`: Displays state in binary format
  - `OctalObserver`: Displays state in octal format
  - `HexaObserver`: Displays state in hexadecimal format
- Added `detach()` method to remove observers
- Modified demo to show observer detachment in action

### How to Run
1. Navigate to the `question1` package
2. Run `ObserverPatternDemo.java`
3. Observe output showing:
   - Initial state change notifications to all observers
   - Second state change after detaching the OctalObserver




## Question 2: Event Management System with SMS Support

### Overview
This implementation extends the Refactoring.Guru event management example with SMS notification support, including SMS length validation.

### Implementation Details
- **EventManager**: Manages event subscriptions and notifications
- **EventListener**: Interface for all event listeners
- **Concrete Listeners**:
  - `EmailNotificationListener`: Sends email notifications
  - `LogOpenListener`: Logs file operations
  - `SMSSupportListener`: New listener that sends SMS notifications with length validation
- Added SMS event type to the Editor class
- SMS listener validates message length (max 160 characters)

### Features
- File operation tracking (open, save)
- Multiple notification channels (email, log, SMS)
- SMS length validation
- Flexible event subscription model

### How to Run
1. Navigate to the `question2.observer.eventsmanagement` package
2. Run `Demo.java`
3. Observe output showing:
   - File open notification in log
   - File save notification via email
   - SMS notification (if message is valid length)

