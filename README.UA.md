# CherryDrive

## **[[EN](https://github.com/OneTester250376/CherryDrive/blob/master/README.md)]** | **[[RU](https://github.com/OneTester250376/CherryDrive/blob/master/README.RU.md)]** | **[[UA](https://github.com/OneTester250376/CherryDrive/blob/master/README.UA.md)]**

**CherryDrive** — невеликий аддон [ST]Drive, який розблокує всі функції для *кожного* гравця, без підписки на Boosty чи Patreon.

### Фічі
- Повний доступ до функцій [ST]Drive для всіх гравців.
- просте встановлення.
- Легка інтеграція без зміни **кода [ST]Drive**.
- Open-Source під ліцензією **LGPLv2.1**.

### Встановлення
1. Переконайтеся, що встановлені **Minecraft 1.20.1** і **Forge 47.4+**.
2. Скопіюйте файл [ST]Drive `.jar` в папку `mods`.
3. Скопіюйте файл CherryDrive `.jar` в ту же папку `mods`.
4. Запустіть игру з Forge.

> ⚠️ ***Не*** включайте код [ST]Drive в этот репозиторий.

### Запитання
- Как это работает?
    - З допомогою міксинів: *[ST]Drive* має класс *DonatorHandler*, який має метод *isPlayerDonator(ServerPlayer serverPlayer)*. Цей мод просто перехоплює цей метод і заставля завжди повертати *true*.
- Цей мод легальний?
    - Платний контент в модах легальний? — Ні, не легальний (см. [Minecraft EULA](https://www.minecraft.net/ru-ru/eula)).

### Ліцензія
CherryDrive росповсюджується під **[LGPLv2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)**.

