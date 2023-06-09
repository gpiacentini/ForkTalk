package it.unipi.inginf.lsdb.group15.forktalk.connection;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import it.unipi.inginf.lsdb.group15.forktalk.model.Restaurant;
import it.unipi.inginf.lsdb.group15.forktalk.model.User;
import org.bson.Document;
import org.bson.conversions.Bson;

import static it.unipi.inginf.lsdb.group15.forktalk.connection.MongoDBDriver.*;

public class MongoDBAdministrator {

    public boolean loginAdmin(String username, String password) {
        try {
            // Assuming you have a valid MongoDB client instance initialized
            MongoCollection<Document> userCollection = mongoClient.getDatabase("ForkTalk").getCollection("Users");

            // Create a filter to match the username and password
            Bson filter = Filters.and(
                    Filters.eq("username", username),
                    Filters.eq("password", password));

            // Use the filter to find a matching user document in the collection
            Document userDocument = userCollection.find(filter).first();

            // Check if a matching user document was found
            return userDocument != null;
        } catch (Exception e) {
            // Handle any exceptions that occur during the database operation
            e.printStackTrace();
            return false;
        }
    }

    public boolean upgradeUser(User user) {
        if (userCollection.countDocuments(new Document("id", user.getId())) == 1) {
            if (user.getRole() == 2) {
                System.out.println("User " + user.getNome() + " " + user.getCognome() + " is already an admin.");
                return false;
            }
            if (user.getRole() == 1) {
                user.setRole(2);
                System.out.println("User " + user.getNome() + " " + user.getCognome() + " has became an admin.");
                return true;
            }
        } else {
            System.out.println("User does not exist.");
            return false;
        }
        System.out.println("something went wrong");
        return false;
    }


    //******************************************************************************************************************
    //                              USER
    //******************************************************************************************************************
    public boolean addUser(User user) {
        if (userCollection.countDocuments(new Document("username", user.getUsername())) == 0) {
            Document doc = new Document()
                    .append("_id", user.getId())
                    .append("nome", user.getNome())
                    .append("cognome", user.getCognome())
                    .append("username", user.getUsername())
                    .append("password", user.getPassword())
                    .append("email", user.getEmail())
                    .append("role", user.getRole());
            ;
            userCollection.insertOne(doc);
            return true;
        } else return false;
    }

    public boolean deleteUser(User user) {
        if (userCollection.countDocuments(new Document("username", user.getUsername())) == 1) {
            Document doc = new Document()
                    .append("username", user.getUsername());
            userCollection.deleteOne(doc);
            return true;
        }
        else {
            System.out.println("User doesn't exist");
            return false;
        }
    }

    //******************************************************************************************************************
    //                              RESTAURANT
    //******************************************************************************************************************
    public boolean deleteRestaurant(Restaurant rest) {
        if (restaurantCollection.countDocuments(new Document("restaurantId", rest.getRestaurantId())) == 1) {
            Document doc = new Document()
                    .append("restaurantId", rest.getRestaurantId());
            restaurantCollection.deleteOne(doc);
            return true;
        }
        else {
            System.out.println("Restaurant doesn't exist");
            return false;
        }
    }
}
