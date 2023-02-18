Steps
1. Create Telegram Bot with @BotFather 
   * `/start`
   * `/newbot`
   * Choose a name for your bot. This will be a title in chats
   * Give him a username. This will be used for programming operations (TELEGRAM_USERNAME)
   * As a result you will receive access token (TELEGRAM_TOKEN)
2. Create group in Telegram
3. Change user permissions to deny all actions
4. Change "Chat history for new members" with checkbox
5. Go to your Bot on mobile or laptop application (web version doesn't have such option) and choose "Add to Group or Channel"
6. Send message into your group, replace botname_bot with actual bot name:

  `/my_id @botname_bot`
7. Go to URL
   `https://api.telegram.org/bot{HTTP_API_TOKEN}/getUpdates`

   **Note**: Change {HTTP_API_TOKEN} to actual value

8. From JSON result, get "chat_id" of last message in your group,
   including minus sign in front of it, that's Group Chat ID.

   **Pay attention**, don't miss minus sign ("-"). It is necessary
   
   Use this Chat ID for messaging (TELEGRAM_CHAT_ID)

10. Add Bot to administrators list with no permissions. Messaging permission is not listed for some reason.
11. As a result to start application you need to set environment variables
    * TELEGRAM_USERNAME
    * TELEGRAM_TOKEN
    * TELEGRAM_CHAT_ID