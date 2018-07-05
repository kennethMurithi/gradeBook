/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alliancehighschool;

import java.util.ArrayList;

/**
 *
 * @author KENNE
 */
public class ArrayListConnection {
    public static void main(String[] args ){
        // create a new ArrayList of Strings with an initial capacity of 10;
        ArrayList< String > items = new ArrayList< String >();
        
        items.add( "red" ); // append an item to the list
        items.add(0, "yellow"); //insert value at index 0
        
        // header
        System.out.print("Display list content with counter-controlled loop:");
        
        // display the color in the list
        for ( int i = 0; i < items.size(); i++)
            System.out.printf(" %s ", items.get(i));
        
        // display colors using for each in the display method
        display( items, "\nDisplay list content with enhanced for statement: ");
        
        items.add("green"); // add "green" to the end of list"
        items.add("yellow"); // add "yellow" to the end of the list
        display( items, "List with two new elements:");
        
        items.remove("yellow"); //removes the first yellow
        display(items, "remove first instance of yellow:" );
        
        items.remove(1); // remove item at index1
        display(items, "Remove second list element (green):");
        
        //  check if a value is in the list
        System.out.printf(" \"red\" is %s in the list\n",
               items.contains("red") ? "": "not" );
        
        // display number of elements in the list
        System.out.printf("Size: %s\n", items.size());
    }
        //display the arrayList's elements on the console
        public static void display( ArrayList < String > items, String header )
        {
            System.out.print(header); //display header
            
            // display each element in items
            for (String item : items )
                System.out.printf(" %s ", item);
            
            System.out.println(); // display end of line
            
        }
                
    }
            

