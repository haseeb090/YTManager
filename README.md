# YTManager
A YouTube Manager stores a list of connected YouTube channels with appropriate place for each channel. Any user can use this application to create a list of randomly generated/selected YouTube channels. The user can also add a new channel at any point in the list, without replacing any other channel. The user should also be allowed to delete or replace a channel in the list.

Approach

The Channel class acts as a node in the LinkedList that is the Youtube manager. The YTManager class is the implementation of the Youtube Manager. The addchannel function allows user to add a channel at the end of the list. The replacechannel function allows replacing a channel. The deletechannel function allows for deletion of a channel from the list. Finally, the printchannels function returns a Vector String on all the channel names in the list.  

How to Run
Simply include the 2 java files in your project and create objects from the YTManager class in your main function. A constructor with the argument of true will automatically create a list with random youtube channels in it.
