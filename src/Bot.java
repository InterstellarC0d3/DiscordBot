import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter
{
    public static void main(String[] args) throws LoginException
    {
<<<<<<< Updated upstream
        new JDABuilder()
        	.setToken("NjUxMTA4MDE2OTgwMDk5MDcz.Xelw9A.3FjT2ZrOVS7b3me5vEX4Ou1kaq4")
            .addEventListeners(new Bot())
            .setActivity(Activity.watching("children"))
=======
        new JDABuilder("YD8ZUceXqNXP3bX5H7zgUJNR9s9MIVD_")
            //.addEventListeners(new Bot())
            //.setActivity(Activity.watching("children"))
>>>>>>> Stashed changes
            .build();
    }
    
    public void onMessageReceived(MessageReceivedEvent event)
    {
    	User user = event.getAuthor();
        Message msg = event.getMessage();
        MessageChannel channel = event.getChannel();
        int random;
        switch(msg.getContentRaw()) {
        case "!AAAA":
        	long time = System.currentTimeMillis();
            channel.sendMessage("AAAA:") /* => RestAction<Message> */
                   .queue(response -> {
                	   response.editMessageFormat("AAAA: %d ms", System.currentTimeMillis() - time).queue();
                   });
            break;
        case "!h":
        	channel.sendMessage("h").queue();
        	break;
        case "!liven't":
        	channel.sendMessage("i will now perform the die").queue();
        	System.exit(2);
        	break;
        case "!rolld6":
        	random = (int) (Math.random()*6);
        	channel.sendMessage("" + random).queue();
        	break;
        case "!rolld10":
        	random = (int) (Math.random()*10);
        	channel.sendMessage("" + random).queue();
        	break;
        case "!rolld12":
        	random = (int) (Math.random()*12);
        	channel.sendMessage("" + random).queue();
        	break;
        case "!rolld20":
        	random = (int) (Math.random()*20);
        	channel.sendMessage("" + random).queue();
        	break;
        case "!palme":
        	channel.sendMessage("palme sk�t f�rst").queue();
        	break;
        case "!crackhead":
        	for (int i = 0; i < 5; i++) {
        		channel.sendMessage("nightmare").queue();
        	}
        	break;
        
        }
    }
}