package work;



import org.junit.jupiter.api.Test;

public class LinkedListsStrTest {
   @Test
   public void testSize_EmptyList(){

    System.out.println("Return size of being empty");
    LinkedListsStr instance = new LinkedListsStr();
    int expResult = 0;
    int result = instance.size();
    assertEquals(expResult,result);
   }

   @Test
   public void testSize_populatedList(){

    System.out.println("Return size of being empty");
    LinkedListsStr instance = new LinkedListsStr();
    instance.add("rob", 0);
    instance.add("bladee", 1);
    instance.add("ecco2k", 2);
    instance.add("thaiboy digital", 3);
    int expResult = 4;
    int result = instance.size();
    assertEquals(expResult,result);
   }
}
