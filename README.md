
# JavaOOPAdventure - Week 03: Contracts, Invariants & Rewards


Chosen Theme & Overview
A classic turn-based fantasy dungeon adventure where a lone hero battles through two sequential 1v1 encounters. After defeating the first monster, the player faces a meaningful strategic choice between two rewards—Recovery (drinking a healing potion to restore up to 25 HP) or Power (sharpening their blade to permanently increase basic attack damage from 10 to 12)—before confronting a stronger second enemy while carrying over their exact health, energy resources, and upgrades.

JDK Version & How to Compile and Run
JDK Version: Java 17 (compatible with JDK 11 and above)
Compile all source files: javac Main.java Player.java Enemy.java Reward.java
Run the game: java Main

# Two reward traces: 

# choose recovery: 
Enter your name: 
eldar
Hello eldar, First Round start NOW!
eldar has got 100 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 90 HP
Enemy has got 20 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 80 HP
Enemy has got 10 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
Congrats you won round 1!

Choose your reward (only one):
1 - RECOVERY (+25 HP, max 100)
2 - POWER (+2 Basic Attack damage)
1
Reward applied: RECOVERY! Your HP is now 100
Second round...
eldar Hp is: 100
eldar resource is: 5
eldar attack damage is: 10
eldar has got 100 HP
Enemy has got 45 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 90 HP
Enemy has got 35 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 80 HP
Enemy has got 25 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 70 HP
Enemy has got 15 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 60 HP
Enemy has got 5 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
Congrats you won!
Good game!!

# choose Power: 
Enter your name: 
eldar
Hello eldar, First Round start NOW!
eldar has got 100 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 90 HP
Enemy has got 20 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 80 HP
Enemy has got 10 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
Congrats you won round 1!

Choose your reward (only one):
1 - RECOVERY (+25 HP, max 100)
2 - POWER (+2 Basic Attack damage)
2
Reward applied: POWER! Your basic attack is now 12
Second round...
eldar Hp is: 80
eldar resource is: 5
eldar attack damage is: 12
eldar has got 80 HP
Enemy has got 45 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 70 HP
Enemy has got 33 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 60 HP
Enemy has got 21 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 50 HP
Enemy has got 9 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
Congrats you won!
Good game!!



# Failure Trace: 
# invalid reward:
Enter your name: 
eldar
Hello eldar, First Round start NOW!
eldar has got 100 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 90 HP
Enemy has got 20 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
eldar has got 80 HP
Enemy has got 10 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
1
Congrats you won round 1!

Choose your reward (only one):
1 - RECOVERY (+25 HP, max 100)
2 - POWER (+2 Basic Attack damage)
3
Invalid reward choice 

Choose your reward (only one):
1 - RECOVERY (+25 HP, max 100)
2 - POWER (+2 Basic Attack damage)


# losing: 
Enter your name: 
eldar
Hello eldar, First Round start NOW!
eldar has got 100 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 95 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 90 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 85 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 80 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 75 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 70 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 65 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 60 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 55 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 50 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 45 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 40 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 35 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 30 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 25 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 20 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 15 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 10 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
eldar has got 5 HP
Enemy has got 30 HP

choose action: 1 - Attack, 2 - defense, 3 - recover, 4 -special
2
You lost this round




# Design Note:
To keep the game state safe and bug-free, The design separates game flow control from data protection. The Player class owns all character stats (hp, resource, attackDamage, and isDefending) as private fields, so external classes cannot change them directly. Instead, Player provides focused methods that enforce key invariants: hp always stays between 0 and 100 using Math.min and Math.max, resource stays between 0 and 10, and attackDamage only increases.

Main acts as the game coordinator and enforces reward preconditions. A reward is only offered after fight returns true for the first enemy; if the player loses, the program ends immediately with no reward and no second battle. When the player wins, chooseReward asks for a single valid choice (RECOVERY or POWER), retrying on invalid input without changing any stats. The postcondition guarantees that RECOVERY adds up to 25 HP without changing resources, while POWER raises basic attack to 12 while keeping special() at 15. Finally, reusing the same Player object in Round 2 preserves all stats while cleardefense() resets temporary defense.


# AI use reflection: 
Useful suggestion: The AI suggested passing a single Scanner instance as a parameter from main into fight and chooseReward instead of creating separate scanners, and using .trim() on user input. This prevented input stream conflicts between rounds and handled accidental spaces cleanly.

Rejected suggestion: I rejected adding an extra boolean flag inside Player to track whether a reward was claimed, as well as avoiding complex class hierarchies or interfaces, because the sequential control flow in Main already guarantees that chooseReward runs at most once after winning Round 1.

Independently verified test: I manually ran and verified the recovery boundary case (finishing Encounter 1 at 80 HP and choosing RECOVERY) and confirmed that HP clamped strictly at 100 instead of overflowing to 105, as well as testing invalid menu inputs to ensure no stats changed before a valid selection.
