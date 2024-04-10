package io.arrogantprogrammer;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/devnexus2024")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DevnexusResource {

    @POST
    @Path("/assign")
    public Response getRandomCharacter(final String name) {
        return Response.ok().entity(new CharacterAssignment(1L, name, characterName)).build();
    }


    @POST
    @Path("/whois")
    public Response whois(CharacterAssignment characterAssignment) {
        return Response.ok().entity(new CharacterAssignment(1L, name, characterName, whoIsText)).build();
    }

    @POST
    @Path("/poem")
    public Response poem(CharacterAssignment characterAssignment) {
        return Response.ok().entity(new CharacterAssignment(1L, name, characterName, whoIsText, poemText)).build();
    }

    @POST
    @Path("/addtopoem")
    public Response addToPoem(CharacterAssignment characterAssignment) {
        return Response.ok().entity(new CharacterAssignment(1L, name, characterName, whoIsText, poemText, updatedPoemText)).build();
    }

    String name = "Santa";

    String characterName = "Tarrful";

    String whoIsText = "Tarfful is a Wookiee chieftain from the Star Wars universe. He played a significant role in the events of the Star Wars saga, particularly during the Clone Wars era and the rise of the Galactic Empire. Tarfful is best known for his appearance in \"Star Wars: Episode III – Revenge of the Sith,\" where he fought alongside Jedi Master Yoda during the Battle of Kashyyyk, the Wookiee homeworld. Despite his limited screen time in the movies, Tarfful has become a recognizable figure among Star Wars fans, representing the bravery and strength of the Wookiee species in their resistance against oppression.";

    String poemText =
            """
                   In the shadowed woods of Kashyyyk's embrace,
                    Where ancient trees their whispers softly lace,
                    There strides a Wookiee, proud and tall,
                    Tarfful, chieftain, heeding nature's call.

                    Amidst the chaos of the Clone War's strife,
                    He stands a guardian of his planet's life,
                    With fur like midnight, eyes ablaze with fire,
                    A warrior's spirit, burning with desire.

                    In Yoda's shadow, side by side they stand,
                    Defenders of their homeworld's sacred land,
                    Against the Empire's iron grip they rise,
                    Their roar of freedom echoing the skies.

                    Oh, Tarfful, noble guardian of the trees,
                    Your strength and courage carried on the breeze,
                    In Ferlinghetti's verse, we hear your tale,
                    A rebel spirit that shall never fail.
            """;

    String updatedPoemText =
            """
                    In the shadowed woods of Kashyyyk's embrace,
                    Where ancient trees their whispers softly lace,
                    There strides a Wookiee, proud and tall,
                    Tarfful, chieftain, heeding nature's call.
                    Amidst the chaos of the Clone War's strife,
                    He stands a guardian of his planet's life,
                    With fur like midnight, eyes ablaze with fire,
                    A warrior's spirit, burning with desire.
                    And in this realm where legends intertwine,
                    Where unicorns dance beneath the moon's soft shine,
                    Tarfful strides, his mighty presence clear,
                    Amidst the magic that the woods hold dear.
                    In Yoda's shadow, side by side they stand,
                    
                    Defenders of their homeworld's sacred land,
                    Against the Empire's iron grip they rise,
                    Their roar of freedom echoing the skies.
                    
                    Oh, Tarfful, noble guardian of the trees,
                    Your strength and courage carried on the breeze,
                    In Ferlinghetti's verse, we hear your tale,
                    A rebel spirit that shall never fail.
            """;

    String proseText =
            """
                    In the dim-lit depths of Kashyyyk's dense foliage, where ancient trees whispered secrets of ages past, there moved a figure, silent and imposing. Tarfful, Wookiee chieftain, navigated the shadows with a grace born of the wild, a sentinel to the natural order that thrummed through every leaf and branch.
                    
                    In the midst of the tumultuous Clone Wars, he emerged as a stalwart defender of his homeworld, a bastion against the encroaching darkness. His fur, dark as the night sky, masked a fierce determination, his eyes alight with a primal fire that spoke of battles fought and victories won.
                    
                    And amidst this untamed realm, where the line between myth and reality blurred, where unicorns danced beneath the shimmering moonlight, Tarfful stood, a colossus among legends. His presence, a force to be reckoned with, resonated with the ancient magic that permeated the forest's depths.
                    
                    By Yoda's side, he stood firm, a guardian of Kashyyyk's sacred soil, defying the Empire's iron grip with every sinew of his being. Their defiance echoed through the heavens, a clarion call to all who dared oppress the spirit of freedom.
                    
                    Oh, Tarfful, your legend etched in the annals of time, your valor carried on the winds of change. In the verses of Ferlinghetti, your tale finds voice, a testament to the indomitable spirit of rebellion that shall endure for all eternity.
            """;

}
