# News App

## Intro

This code activity is a way for you to show us your development skills -
we’re just as interested in how you think through a problem and approach
designing a solution as we are in the code that you write.

Please give this page a read through before we come back together and
chat through any questions you might have.

## Brief

The app we are building today is a proof of concept prototype towards a
news search / research tool where a user could:

- Search against one or more news sites / services for terms they are
  interested in
- Get a collated list of results, click through to read further the
  articles of interest.
- Pin or bookmark articles to read later or follow up.

We may or may not build all of this in the session and that's totally
fine. Just keep this in mind as background, to maybe help guide
decisions you might make.

For today we'll focus on a single source, the Guardian’s content API -
[https://open-platform.theguardian.com/](https://open-platform.theguardian.com/)

The app should present a text field for the user to type their search
terms, _as the user types_ it should take that input and use it to
perform a search against

Given the result of that API call it should display a list of results,
grouped by the Section of the Guardian the items are found in.

### Specifics

- The application should be built as a Java Springboot application
  - The application should not call the Guardian API directly, rather
    we'd like to see you build your own API as a proxy for the
    Guardian one
- Each item should show:
  - The Title
  - A link to the article
  - The publication date (formatted as DD/MM/YYYY).
  - A button or checkbox that allows it to be pinned.
    - Pinned items should appear below the search results, and stay
      on screen as search results change.

Use whichever libraries and frameworks that will help you get the job
done. Use any UI framework or prebuilt design system that works for you.
We might have a conversation about the choices you make, so it’s great
if you have a solid reason for them.

## What we’re looking for

- A working app pushed to your own Github or Bitbucket account - please fork the repo
  and start with one of the branches for your chosen technology stack.
- A good idea of the decisions you have made while building this. Why
  you did it _this way_ and not _that way_ and what that means. What are
  you locking yourself into and what are you deferring to later. What is
  going to matter for ongoing performance, scalability, extensibility,
  robustness.

## **What we’re not looking for, as much**

- **Visual design.** Beyond a basic idea of clarity, any visual design
  touches are _entirely_ optional. Some developers prefer to leave the
  design to designers, some get a kick out of making things _just so_.
  We like both kinds.

## Getting started

You'll need JDK 17 and Maven installed to run this project.

A clean fork on this branch should be able to execute 
`./mvnw spring-boot:run`

The application will then serve on port 8080 and display "Greetings from Spring Boot!"
