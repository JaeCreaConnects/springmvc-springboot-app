# springmvc-ws
# NOTE: The structure of the directories are subject to change.  The "global" feeling of the controller, repo, etc. directories is intended as there is only one use for this application thus far: Users.
Functionalities:
- Create a User and store in a database (in our case MySQL)
- Delete a User from a database
- Update a User from a database
- Get user(s)
- Utilizes Amazon Simple Email Service (SES) to reset user password, and email verification.
- Contains tests: Repo, Service, and Controller tests utilizing Mockito, SpringBootTest, and JUnit
