import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Bot extends ListenerAdapter
{
    public static void main(String[] args) throws LoginException
    {
        new JDABuilder("NjUxMTA4MDE2OTgwMDk5MDcz.XeZX7Q.DLuQ4VfqGeGC_bhrDI-79EUTejc")
            .addEventListeners(new Bot())
            .setActivity(Activity.watching("children"))
            .build();
    }
    
    public void onMessageReceived(MessageReceivedEvent event)
    {
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
        	channel.sendMessage("palme sköt först").queue();
        	break;
        case "!crackhead":
        	for (int i = 0; i < 5; i++) {
        		channel.sendMessage("nightmare").queue();
        	}
        	break;
        }
    }
}