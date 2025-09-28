# CherryDrive

## **[[EN](https://github.com/OneTester250376/CherryDrive/blob/master/README.md)]** | **[[RU](https://github.com/OneTester250376/CherryDrive/blob/master/README.RU.md)]** | **[[UA](https://github.com/OneTester250376/CherryDrive/blob/master/README.UA.md)]**

**CherryDrive** — небольшой аддон для [ST]Drive, который разблокирует все функции для каждого игрока, без подписки на Boosty или Patreon.

### Фичи
- Полный доступ к функциям [ST]Drive для всех игроков.
- Простая установка.
- Легкая интеграция без модификации **кода [ST]Drive**.
- Open-Source под лицензией **LGPLv2.1**.

### Установка
1. Убедитесь, что установлены **Minecraft 1.20.1** и **Forge 47.4+**.
2. Скопируйте файл [ST]Drive `.jar` в папку `mods`.
3. Скопируйте файл CherryDrive `.jar` в ту же папку `mods`.
4. Запустите игру через Forge.

> ⚠️ ***Не*** включайте код [ST]Drive в этот репозиторий.

### Вопросы
- Как это работает?
    - С помощью миксинов: *[ST]Drive* имеет класс *DonatorHandler*, который содержит метод *isPlayerDonator(ServerPlayer serverPlayer)*. Этот мод перехватывает этот метод и заставляет его всегда возвращать *true*.
- Этот мод легален?
    - Платный контент в модах легален? — Нет, не легален (см. [Minecraft EULA](https://www.minecraft.net/ru-ru/eula)).

### Лицензия
CherryDrive распространяется под **[LGPLv2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.html)**.

