# SnakeBot
Brookwood High School AI Programming Competition in Java
[Official Website](http://dralias.github.io/SnakeBot-Game/)

### What is the SnakeBot Game?
The SnakeBot Game is a single elimination java programming contest created by Amaan Marfatia. The point of the contest is to create an AI to play against other players. This is mainly intended for AP Computer Science students but since it is easy to pick up, anyone in middle school or high school can submit an AI for the competition.

### The Game
This game is similar to snakes where you try to eat food and grow in length. The difference is, that you have to create an AI for your snake that plays the game for you against another team's AI snake. Each snake starts in one of the corners of the board with the length of one. The winner is the AI that reaches the length of ten or doesn't die. Every time you eat a food piece on the board, your snake increases by the length of one. If you eat a part of the other snake, you also grow in length by one and from that point onward, the opponent's snake disappears. However, if you try to eat the other snake's head, you die. Eating any part of yourself, kills yourself and the opponent wins. You also die if you hit the wall like in a normal snake game.

### The Rules
- A random number generator that has an equal chance of spitting out the number 1 or 2 will be used to determine which team's AI is player 1.
- A team can be made of up to 3 students. 
- Make a single java file that contains only one class that extends the abstract class AI.
- If a team's AI fails to compile, they will be given 2 minutes to fix the problem. If they are unable to fix it, then the other team wins.
- Do not try to modify the board, game, or opponent's AI in any way.
- Return one of the following characters in the method getDirection(): U,D,L,R. Note that these characters are uppercase. U stands for up which makes your snake head increase in the Y direction. The nth body part will then move to the n-1 spot. If you have eaten food or a snake, then your last piece remains. If you do not return one of those characters, then you will be lose the game.
- Spread the word and help people understand the basics of the game.
- If you notice a problem or feel like something about the game is unclear, submit an issue via GitHub so that everyone get a fair chance.

### To Get Started
- To get started, download the latest zip file or copy the GitHub repository by using the following command on your Mac or Linux terminal:  
`$ git clone https://github.com/DrAlias/SnakeBot-Game.git`  
- Then place your AI and your opponent's AI into the SnakeBot directory which is where the Game, SnakeBoard, and AI .java files are.
- Modify Game.java and replace constructors with both teams' AIs.
- Modify teams' AIs' variables to match their player number.
- Compile everything and run by using the following command when in the SnakeBot directory:  
`$ javac *.java && java Game`
