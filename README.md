# APCSA-Mock-Exam1-2026

This repo is a small **AP Computer Science A mock exam practice repository** written entirely in Java.

It contains **several short, self-contained classroom-style exercises** rather than one larger application. The code looks designed to practice common APCSA FRQ topics like:

- classes and objects
- constructors and getters
- arrays and 2D arrays
- `ArrayList`
- loops and conditionals
- string processing
- simple simulation logic

### Main structure

The repository has a flat layout with a handful of Java files in the root:

- `Apple.java` / `AppleCrate.java`
- `Cube.java` / `CubePair.java`
- `ElectricVehicle.java` / `EVDataSet.java`
- `RaceCar.java` / `SimulateCarRace.java`

### What each mini-exercise does

- **Apple / AppleCrate**
  - Models apples with `weight` and `isRotten`.
  - `AppleCrate` builds a 4x6 grid of apples and calculates how many pies can be made.
  - It skips apples that are rotten or adjacent to rotten apples.

- **Cube / CubePair**
  - Simulates rolling cubes/dice-like objects.
  - A cube can produce a **number**, **letter**, or **color**.
  - `CubePair` combines two cubes and returns the concatenated result of both rolls.

- **ElectricVehicle / EVDataSet**
  - Stores EVs with a `range` and `modelName`.
  - `EVDataSet` filters for vehicles above a target range and returns unique model names.

- **RaceCar / SimulateCarRace**
  - Intended as a race simulation exercise.
  - `SimulateCarRace` compares lap times across laps and declares a winner.
  - It also includes a `shortenMessage` string-removal method.
  - `RaceCar` is currently just a stub: `getLapTime` always returns `0.0`, so the race simulation is incomplete.

