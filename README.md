# Calculator J2EE

This project is a simple calculator using the minimal components for a *j2EE* structure.

## How to build it

> Using windows

```groovy
gradlew.bat clean build
```

> Using Linux or OS X

```groovy
./gradlew clean build
```

## How to deploy it

**Note:** It is necessary to have the *Wildfly* home directory set in the __PATH__ environment variable in order to deploy it automatically by the commands below:

> Using windows

```groovy
gradlew.bat deploy
```

> Using Linux or OS X

```groovy
./gradlew deploy

```

## How to use it

## Sum

- URL: [{{HOST}}:{{ADDRESS}}/calculator/api/calc/sum]({{HOST}}:{{ADDRESS}}/calculator/api/calc/sum)
- Request Method: *GET*
- Parameters:
    - first (a path param)
    - second (a path param)
> Sample
    [{{HOST}}:{{ADDRESS}}/calculator/api/calc/sum/first/2/second/2]({{HOST}}:{{ADDRESS}}/calculator/api/calc/sum/first/2/second/2)

## Subtract

- URL: [{{HOST}}:{{ADDRESS}}/calculator/api/calc/subtract]({{HOST}}:{{ADDRESS}}/calculator/api/calc/subtract)
- Request Method: *GET*
- Parameters:
    - first (a path param)
    - second (a path param)
> Sample
    [{{HOST}}:{{ADDRESS}}/calculator/api/calc/subtract/first/2/second/2]({{HOST}}:{{ADDRESS}}/calculator/api/calc/subtract/first/2/second/2)

## Multiple

- URL: [{{HOST}}:{{ADDRESS}}/calculator/api/calc/multiple]({{HOST}}:{{ADDRESS}}/calculator/api/calc/multiple)
- Request Method: *GET*
- Parameters:
    - first (a path param)
    - second (a path param)
> Sample
    [{{HOST}}:{{ADDRESS}}/calculator/api/calc/multiple/first/2/second/2]({{HOST}}:{{ADDRESS}}/calculator/api/calc/multiple/first/2/second/2)

## Divide

- URL: [{{HOST}}:{{ADDRESS}}/calculator/api/calc/divide]({{HOST}}:{{ADDRESS}}/calculator/api/calc/divide)
- Request Method: *GET*
- Parameters:
    - first (a path param)
    - second (a path param)
> Sample
    [{{HOST}}:{{ADDRESS}}/calculator/api/calc/divide/first/2/second/2]({{HOST}}:{{ADDRESS}}/calculator/api/calc/divide/first/2/second/2)