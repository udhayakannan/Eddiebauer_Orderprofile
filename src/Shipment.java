import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author Udhaya Kannan
 */
public class Shipment {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int orderno=40020001;
		
		String pattern = "yyyy-MM-dd'T'HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		File file = new File("ShipConfirm_SeedFile_6_4K__.csv"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st;
		  String[] arg;
		  st = br.readLine();
		  while ((st = br.readLine()) != null) 
		  {
		   arg=st.split(",");
		   CreateCSV csv=new CreateCSV(arg[0]+".json", false);
			StringBuffer sb=new StringBuffer();
			csv.openFile();
			sb.append("{\r\n" + 
					"    \"MessageHeader\": {\r\n" + 
					"    \"Organization\": \"EB-US\",\r\n" + 
					"    \"MSG_TYPE\": \"PSEBOrderEvent\",\r\n" + 
					"    \"User\": \"admin@EB-US.com\"\r\n" + 
					"  },\r\n" + 
					"   \r\n" + 
					"   \"OrderEvent\": [\r\n" + 
					"       {\r\n" + 
					"       \"EventTypeId\": \"Ship\",\r\n" + 
					"       \"ReleaseId\": \""+arg[4]+"\", \r\n" + 
					"       \"ReleaseLineId\": \"1\",   \r\n" + 
					"       \"ItemId\": \""+arg[1]+"\",\r\n" + 
					"       \"Quantity\": \"1\",\r\n" + 
					"       \"UOM\": \"EA\",\r\n" + 
					"       \"FulfillmentInfo\": {\r\n" + 
					"               \"PackageId\": \""+arg[6]+"\", \r\n" + 
					"               \"PackageDetailId\": \"1\",  \r\n" + 
					"               \"TrackingNumber\": \""+arg[7]+"\",  \r\n" + 
					"               \"ShipViaId\": \"FDGR\",\r\n" + 
					"               \"EventDate\": \""+date+"\", \r\n" + 
					"               \"ShipmentId\": \""+arg[8]+"\", \r\n" + 
					"               \"InventoryTypeId\": \"F\"\r\n" + 
					"               }\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"        \"EventTypeId\": \"Ship\",\r\n" + 
					"        \"ReleaseId\": \""+arg[4]+"\",\r\n" + 
					"        \"ReleaseLineId\": \"2\",\r\n" + 
					"        \"ItemId\": \""+arg[2]+"\", \r\n" + 
					"        \"Quantity\": \"1\",\r\n" + 
					"        \"UOM\": \"EA\",\r\n" + 
					"        \"FulfillmentInfo\": {\r\n" + 
					"               \"PackageId\": \""+arg[6]+"\",\r\n" + 
					"               \"PackageDetailId\": \"1\",  \r\n" + 
					"               \"TrackingNumber\": \""+arg[7]+"\",  \r\n" + 
					"               \"ShipViaId\": \"FDGR\",\r\n" + 
					"               \"EventDate\": \""+date+"\",  \r\n" + 
					"               \"ShipmentId\": \""+arg[8]+"\", \r\n" + 
					"               \"InventoryTypeId\": \"F\"\r\n" + 
					"               }\r\n" + 
					"        },\r\n" + 
					"        {\r\n" + 
					"        \"EventTypeId\": \"Ship\",\r\n" + 
					"        \"ReleaseId\": \""+arg[4]+"\",\r\n" + 
					"        \"ReleaseLineId\": \"3\",\r\n" + 
					"        \"ItemId\": \""+arg[2]+"\", \r\n" + 
					"        \"Quantity\": \"1\",\r\n" + 
					"        \"UOM\": \"EA\",\r\n" + 
					"        \"FulfillmentInfo\": {\r\n" + 
					"               \"PackageId\": \""+arg[6]+"\",  \r\n" + 
					"               \"PackageDetailId\": \"1\",  \r\n" + 
					"               \"TrackingNumber\": \""+arg[7]+"\",  \r\n" + 
					"               \"ShipViaId\": \"FDGR\",\r\n" + 
					"               \"EventDate\": \""+date+"\", \r\n" + 
					"               \"ShipmentId\": \""+arg[8]+"\",  \r\n" + 
					"               \"InventoryTypeId\": \"F\"\r\n" + 
					"        }\r\n" + 
					"    }]\r\n" + 
					"}");
			System.out.println(sb.toString());
			csv.writeFile(sb.toString());
			csv.closeFile();
		  } 
	            
	         
	    
		
		
		
	
		orderno=orderno+1;
		
	}

}
