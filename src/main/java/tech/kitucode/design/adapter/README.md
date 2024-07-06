# Adapter Design Pattern

- an adapter converts one interface into another
- some adapters just pass the information through while others are more complex and will need to do something else to
  support the process

## Example

- interface Duck
    - quack()
    - fly()

- MallardDuck implements Duck()
    - quack()
    - fly()

- interface Turkey
    - gobble()
        - a turkey does not quack it gobbles
    - fly()
        - a turkey can fly but only short distances

- WildTurkey implements Turkey
    - gobble()
    - fly()

__Problem Statement: we want to use Turkey in place of Duck__

- to do this we will need to wrap the Turkey into a Duck so that the Turkey behaves like a Duck
- we can achieve this by creating an adapter to adapt the Turkey into a Duck

- class TurkeyAdapter implements Duck:
    - quack()
        - call turkey.gobble()
    - fly
        - call turkey.fly()

## Definition

- The adapter patterns converts the interface of a class into another interface the client expects.
- It lets classes work together that otherwise could not because of incompatible interfaces.
