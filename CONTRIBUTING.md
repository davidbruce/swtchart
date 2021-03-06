# Guide to contributing

Please read this if you intend to contribute to the project.

## Developer Guidelines

Please contact the team if you're unsure regarding the SWTChart developer guidelines.
Each bundle contains the style and formatting guidelines already. They should be applied automatically when using the Eclipse IDE.

## Legal stuff

Apologies in advance for the extra work required here - this is necessary to comply with the Eclipse Foundation's
strict IP policy.

Please also read [this](http://wiki.eclipse.org/Development_Resources/Contributing_via_Git)

In order for any contributions to be accepted you MUST do the following things.

* Add your github username in your Eclipse Foundation account settings. Log in it to Eclipse and go to account settings.

* "Sign-off" your commits

Every commit you make in your patch or pull request MUST be "signed off".

You do this by adding the `-s` flag when you make the commit(s), e.g.

    git commit -s -m "Shave the yak some more"

* Sign the Eclipse Contributor Agreement (ECA)

## Eclipse Contributor Agreement

Before your contribution can be accepted by the project team contributors must
electronically sign the Eclipse Contributor Agreement (ECA).

* http://www.eclipse.org/legal/ECA.php

Commits that are provided by non-committers must have a Signed-off-by field in
the footer indicating that the author is aware of the terms by which the
contribution has been provided to the project. The non-committer must
additionally have an Eclipse Foundation account and must have a signed Eclipse
Contributor Agreement (ECA) on file.

For more information, please see the Eclipse Committer Handbook:
https://www.eclipse.org/projects/handbook/#resources-commit

## Making your changes

* Fork the repository on GitHub
* Create a new branch for your changes
* Make your changes
* Make sure you include tests
* Make sure the test suite passes after your changes
* Commit your changes into that branch
* Use descriptive and meaningful commit messages
* If you have a lot of commits squash them into a single commit
* Make sure you use the `-s` flag when committing as explained above.
* Push your changes to your branch in your forked repository

## Submitting the changes

Submit a pull request via the normal GitHub UI.
 
## After submitting

* Do not use your branch for any other development, otherwise further changes that you make will be visible in the PR.

# Credit

This document was originally written by the Vert.x team at

https://raw.githubusercontent.com/eclipse/vert.x/master/CONTRIBUTING.md

We have shamelessly copied, modified and co-opted it for our own repo and we
graciously acknowledge the work of the original authors.
