# CherryDrive

## **[[EN](https://github.com/OneTester250376/CherryDrive/blob/master/README.md)]** | **[[RU](https://github.com/OneTester250376/CherryDrive/blob/master/README.RU.md)]** | **[[UA](https://github.com/OneTester250376/CherryDrive/blob/master/README.UA.md)]**

**CherryDrive** is a small mod for [ST]Drive that unlocks all features for *every* player, without a Boosty/Patreon subscription.

### Features
- Full access to [ST]Drive features for all players.
- Easy installation via Forge.
- Lightweight integration without modifying the core **[ST]Drive code**.
- Open-Source under **LGPLv2.1**.

### Installation
1. Make sure you have **Minecraft 1.20.1** and **Forge 47.4+** installed.
2. Place the [ST]Drive `.jar` file into the `mods` folder.
3. Place CherryDrive `.jar` file into the same `mods` folder.
4. Launch the game using Forge.

> ⚠️ Do ***not*** include [ST]Drive source code in this repository.

### Questions
- How this work?
    - Mixins, *[ST]Drive* have *DonatorHandler* class, this class have *isPlayerDonator(ServerPlayer serverPlayer)*, this mod just intercepts that method and forces it to always return *true*.
- This mod legal?
    - Paywall content is legal? - No, Paywall conten is illegal (see [Minecraft EULA](https://www.minecraft.net/en-us/eula)).

### License
CherryDrive is licensed under **[LGPLv2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)**.
