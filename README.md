<h1>Algorithms for Inverse Reinforcement Learning</h1>

# Gridworld Algorithms Implemented

- Value Iteration [[**1**](#References)]</br >
- Inverse Reinforcement Learning [[**2**](#References)] </br > 

![rl](https://user-images.githubusercontent.com/33180566/32406065-176535da-c150-11e7-8a9b-107518775755.jpg)</br >
[Reinforcement Learning book](#References)

# Step-by-step Guide

Gridworld experiment (Figures 1 and 2 of article)
Run class TRLMain.java.

**Step 1**: Run TRLMain. A window with a standard 5x5 square gridworld appears.</br >
![irl1](https://user-images.githubusercontent.com/33180566/32405201-66584008-c13f-11e7-91a3-67b773d82e76.PNG)</br >
</br >
**Step 2**: Run action Create 2. Agent. The initial state is indicated by a blue square, the goal state is indicated by a blue circle. </br >
![irl2](https://user-images.githubusercontent.com/33180566/32405204-8fe0370a-c13f-11e7-82bc-c4c738cb3c3b.PNG)</br >
![irl3](https://user-images.githubusercontent.com/33180566/32405207-a54ff832-c13f-11e7-87d4-6e227b410ea1.PNG)</br >
</br >
**Step 3**: Run action Create 3. Reward Function. It will define the reward received when transition to the goal state (eg, positive value) and the reward received when transitioning to non absorbing states (eg, zero).</br >
![irl4](https://user-images.githubusercontent.com/33180566/32405210-cc15a9bc-c13f-11e7-9956-f09b802efbb3.PNG)</br >
![irl5](https://user-images.githubusercontent.com/33180566/32405223-0294540c-c140-11e7-93bf-573947df7c8d.PNG)</br >
</br >
**Step 4**: Run action Reinforcement Learning 1. Value Iteration. Finds an optimal policy, blue arrows. The red numbers are the Q-values for the actions in each state.</br >
![irl6](https://user-images.githubusercontent.com/33180566/32405227-23a66220-c140-11e7-8f61-2d42044e80da.PNG)</br >
</br >
**Step 5**: Run action Reinforcement Learning 2. Inverse Reinforcement Learning. Finds the reward function using Inverse Reinforcement Learning (IRL).</br >
![irl8](https://user-images.githubusercontent.com/33180566/32405973-478f4b4e-c14e-11e7-9e6f-8e72dafbbe4f.JPG)</br>
![irl7](https://user-images.githubusercontent.com/33180566/32405236-3e895fa2-c140-11e7-9dce-d7e0eae00fe1.PNG)</br >

# References

[**1**] [Reinforcement Learning: An Introduction](http://incompleteideas.net/book/the-book-2nd.html), Richard S. Sutton and Andrew G. Barto.</br >
[**2**] [Algorithms for Inverse Reinforcement Learning](http://ai.stanford.edu/~ang/papers/icml00-irl.pdf). AY Ng, SJ Russell - Icml, 2000 - ai.stanford.edu.


# License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

