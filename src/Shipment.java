/*
 * @author Udhaya Kannan
 */
public class Shipment {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int orderno=40020001;
		for(int i=0;i<40000;i++)
		{
		CreateCSV csv=new CreateCSV(orderno+".json", false);
		StringBuffer sb=new StringBuffer();
		csv.openFile();
		
		
		sb.append("{\r\n" + 
				"  \"CustomerId\": \"6110810311\",\r\n" + 
				"  \"CustomerFirstName\": \"fggjf\",\r\n" + 
				"  \"CustomerLastName\": \"bhk\",\r\n" + 
				"  \"CustomerEmail\": \"SOASTATESTUSER16@SOASTA.COM\",\r\n" + 
				"  \"CustomerPhone\": \"9876543212\",\r\n" + 
				"  \"OrderId\": \""+orderno+"\",\r\n" + 
				"  \"IsConfirmed\": true,\r\n" + 
				"  \"IsOnHold\": true,\r\n" + 
				"  \"OrderActions\": {\r\n" + 
				"    \"IsAlreadyCharged\": true,\r\n" + 
				"    \"IsAlreadyPriced\": true,\r\n" + 
				"    \"IsAlreadyTaxed\": true\r\n" + 
				"  },");
		sb.append(" \"OrderCaptureDetail\": {\r\n" + 
				"    \"IPAddress\": \"172.31.107.251\",\r\n" + 
				"    \"DeviceID\": \"1886000611082019233425\"\r\n" + 
				"  },\r\n" + 
				"  \"PromisingRequestId\": \""+orderno+"\",\r\n" + 
				"  \"CurrencyCode\": \"USD\",");
		sb.append(" \"OrderChargeDetail\": [\r\n" + 
				"    {\r\n" + 
				"      \"ChargeDetailId\": \"1\",\r\n" + 
				"      \"ChargeDisplayName\": \"Shipping and Handling\",\r\n" + 
				"      \"ChargeTotal\": 17.99,\r\n" + 
				"      \"ChargeType\": {\r\n" + 
				"        \"ChargeTypeId\": \"Shipping\"\r\n" + 
				"      },\r\n" + 
				"      \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"      \"TaxCode\": \"Shipping\"\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"ChargeDetailId\": \"2\",\r\n" + 
				"      \"ChargeDisplayName\": \"Auto-apply Free Ship $0 (SSS)\",\r\n" + 
				"      \"ChargeTotal\": -17.99,\r\n" + 
				"      \"ChargeType\": {\r\n" + 
				"        \"ChargeTypeId\": \"Discount\"\r\n" + 
				"      },\r\n" + 
				"      \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"      \"DiscountOn\": \"Charges\",\r\n" + 
				"      \"TaxCode\": \"Shipping\",\r\n" + 
				"      \"RelatedChargeType\": \"Shipping\",\r\n" + 
				"      \"RelatedChargeDetailId\": 1\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"OrderTaxDetail\": [],\r\n" + 
				"  \"CapturedDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"  \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"  \"CreatedTimestamp\": \"2019-08-06T23:59:08\",\r\n" + 
				"  \"OrderType\": {\r\n" + 
				"    \"OrderTypeId\": \"REG\"\r\n" + 
				"  },\r\n" + 
				"  \"SellingChannel\": {\r\n" + 
				"    \"SellingChannelId\": \"WEB\"\r\n" + 
				"  },\r\n" + 
				"  \"DocType\": {\r\n" + 
				"    \"DocTypeId\": \"CustomerOrder\"\r\n" + 
				"  },");
		sb.append(" \"OrderLine\": [\r\n" + 
				"    {\r\n" + 
				"      \"OrderLineId\": \"1\",\r\n" + 
				"      \"ItemId\": \"0870407698000070\",\r\n" + 
				"      \"ItemColorDescription\": \"Capri Blue\",\r\n" + 
				"      \"ItemSize\": \"XL\",\r\n" + 
				"      \"ItemShortDescription\": \"GIRLS HOODIE CLOUDLAYER\",\r\n" + 
				"      \"ItemStyle\": \"68700407\",\r\n" + 
				"      \"SmallImageURI\": \"https://eddiebauer.scene7.com/is/image/EddieBauer/D0870407_698C1?$shopping-bagV2$\",\r\n" + 
				"      \"UnitPrice\": 19.99,\r\n" + 
				"      \"Quantity\": 1,\r\n" + 
				"      \"UOM\": \"EA\",\r\n" + 
				"      \"ShippingMethodId\": \"1\",\r\n" + 
				"      \"DeliveryMethod\": {\r\n" + 
				"        \"DeliveryMethodId\": \"ShipToAddress\"\r\n" + 
				"      },\r\n" + 
				"      \"OrderLineTaxDetail\": [\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"1.25\",\r\n" + 
				"          \"TaxableAmount\": \"19.99\",\r\n" + 
				"          \"TaxDetailId\": \"2\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"STA\",\r\n" + 
				"          \"Jurisdiction\": \"IL\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"0.1\",\r\n" + 
				"          \"TaxableAmount\": \"19.99\",\r\n" + 
				"          \"TaxDetailId\": \"3\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"City\",\r\n" + 
				"          \"Jurisdiction\": \"Westmont\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"0.15\",\r\n" + 
				"          \"TaxableAmount\": \"19.99\",\r\n" + 
				"          \"TaxDetailId\": \"4\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"County\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"ShipToAddress\": {\r\n" + 
				"        \"Address\": {\r\n" + 
				"          \"FirstName\": \"soasta16\",\r\n" + 
				"          \"LastName\": \"test\",\r\n" + 
				"          \"Address1\": \"800 Pasquinelli Dr\",\r\n" + 
				"          \"Address2\": \"\",\r\n" + 
				"          \"City\": \"Westmont\",\r\n" + 
				"          \"State\": \"IL\",\r\n" + 
				"          \"PostalCode\": \"60559\",\r\n" + 
				"          \"Country\": \"US\",\r\n" + 
				"          \"Phone\": \"123456789\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"ItemBarcode\": \"410019683017\",\r\n" + 
				"      \"CarrierCode\": \"\",\r\n" + 
				"      \"IsGiftCard\": false,\r\n" + 
				"      \"ItemTaxCode\": null,\r\n" + 
				"      \"OrderLineChargeDetail\": null,\r\n" + 
				"      \"OrderLineSubTotal\": null,\r\n" + 
				"      \"OrderLineTotal\": null,\r\n" + 
				"      \"OrderLineVASInstructions\": null,\r\n" + 
				"      \"PromisedShipDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"Extended\": {\r\n" + 
				"        \"InseamLength\": \"0.00\",\r\n" + 
				"        \"WebProductURL\": \"https://www.eddiebauer.ca/p/68700407\"\r\n" + 
				"      },\r\n" + 
				"      \"PromisedDeliveryDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"OrderLineNote\": []\r\n" + 
				"    }\r\n" + 
				",\r\n" + 
				"    {\r\n" + 
				"      \"OrderLineId\": \"2\",\r\n" + 
				"      \"ItemId\": \"0891252500000080\",\r\n" + 
				"      \"ItemColorDescription\": \"White\",\r\n" + 
				"      \"ItemSize\": \"XXL\",\r\n" + 
				"      \"ItemShortDescription\": \"WT IGNITELITE REVERSIBLE\",\r\n" + 
				"      \"ItemStyle\": \"38925176\",\r\n" + 
				"      \"SmallImageURI\": \"https://eddiebauer.scene7.com/is/image/EddieBauer/D0891250_500C1?$shopping-bagV2$\",\r\n" + 
				"      \"UnitPrice\": 139.99,\r\n" + 
				"      \"Quantity\": 1,\r\n" + 
				"      \"UOM\": \"EA\",\r\n" + 
				"      \"ShippingMethodId\": \"1\",\r\n" + 
				"      \"DeliveryMethod\": {\r\n" + 
				"        \"DeliveryMethodId\": \"ShipToAddress\"\r\n" + 
				"      },\r\n" + 
				"      \"OrderLineTaxDetail\": [\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"8.75\",\r\n" + 
				"          \"TaxableAmount\": \"139.99\",\r\n" + 
				"          \"TaxDetailId\": \"2\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"STA\",\r\n" + 
				"          \"Jurisdiction\": \"IL\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"0.7\",\r\n" + 
				"          \"TaxableAmount\": \"139.99\",\r\n" + 
				"          \"TaxDetailId\": \"3\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"City\",\r\n" + 
				"          \"Jurisdiction\": \"Westmont\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"1.05\",\r\n" + 
				"          \"TaxableAmount\": \"139.99\",\r\n" + 
				"          \"TaxDetailId\": \"4\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"County\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"ShipToAddress\": {\r\n" + 
				"        \"Address\": {\r\n" + 
				"          \"FirstName\": \"soasta16\",\r\n" + 
				"          \"LastName\": \"test\",\r\n" + 
				"          \"Address1\": \"800 Pasquinelli Dr\",\r\n" + 
				"          \"Address2\": \"\",\r\n" + 
				"          \"City\": \"Westmont\",\r\n" + 
				"          \"State\": \"IL\",\r\n" + 
				"          \"PostalCode\": \"60559\",\r\n" + 
				"          \"Country\": \"US\",\r\n" + 
				"          \"Phone\": \"123456789\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"ItemBarcode\": \"400009740516\",\r\n" + 
				"      \"CarrierCode\": \"\",\r\n" + 
				"      \"IsGiftCard\": false,\r\n" + 
				"      \"ItemTaxCode\": null,\r\n" + 
				"      \"OrderLineChargeDetail\": null,\r\n" + 
				"      \"OrderLineSubTotal\": null,\r\n" + 
				"      \"OrderLineTotal\": null,\r\n" + 
				"      \"OrderLineVASInstructions\": null,\r\n" + 
				"      \"PromisedShipDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"Extended\": {\r\n" + 
				"        \"InseamLength\": \"0.00\",\r\n" + 
				"        \"WebProductURL\": \"https://www.eddiebauer.ca/p/38925176\"\r\n" + 
				"      },\r\n" + 
				"      \"PromisedDeliveryDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"OrderLineNote\": []\r\n" + 
				"    },\r\n" + 
				"    {\r\n" + 
				"      \"OrderLineId\": \"3\",\r\n" + 
				"      \"ItemId\": \"0891244100000050\",\r\n" + 
				"      \"ItemColorDescription\": \"Black\",\r\n" + 
				"      \"ItemSize\": \"M\",\r\n" + 
				"      \"ItemShortDescription\": \"WR W POWDER SEARCH INSULA\",\r\n" + 
				"      \"ItemStyle\": \"38989570\",\r\n" + 
				"      \"SmallImageURI\": \"https://eddiebauer.scene7.com/is/image/EddieBauer/D0891244_100C1?$shopping-bagV2$\",\r\n" + 
				"      \"UnitPrice\": 109.99,\r\n" + 
				"      \"Quantity\": 1,\r\n" + 
				"      \"UOM\": \"EA\",\r\n" + 
				"      \"ShippingMethodId\": \"1\",\r\n" + 
				"      \"DeliveryMethod\": {\r\n" + 
				"        \"DeliveryMethodId\": \"ShipToAddress\"\r\n" + 
				"      },\r\n" + 
				"      \"OrderLineTaxDetail\": [\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"6.88\",\r\n" + 
				"          \"TaxableAmount\": \"109.99\",\r\n" + 
				"          \"TaxDetailId\": \"2\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"STA\",\r\n" + 
				"          \"Jurisdiction\": \"IL\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"0.55\",\r\n" + 
				"          \"TaxableAmount\": \"109.99\",\r\n" + 
				"          \"TaxDetailId\": \"3\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"City\",\r\n" + 
				"          \"Jurisdiction\": \"Westmont\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"          \"TaxAmount\": \"0.82\",\r\n" + 
				"          \"TaxableAmount\": \"109.99\",\r\n" + 
				"          \"TaxDetailId\": \"4\",\r\n" + 
				"          \"TaxTypeId\": \"SALES\",\r\n" + 
				"          \"TaxRequestTypeId\": \"QUOTATION\",\r\n" + 
				"          \"JurisdictionTypeId\": \"County\",\r\n" + 
				"          \"TaxDate\": \"2019-08-11T23:34:25\",\r\n" + 
				"          \"TaxRate\": \"0.075\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"ShipToAddress\": {\r\n" + 
				"        \"Address\": {\r\n" + 
				"          \"FirstName\": \"soasta16\",\r\n" + 
				"          \"LastName\": \"test\",\r\n" + 
				"          \"Address1\": \"800 Pasquinelli Dr\",\r\n" + 
				"          \"Address2\": \"\",\r\n" + 
				"          \"City\": \"Westmont\",\r\n" + 
				"          \"State\": \"IL\",\r\n" + 
				"          \"PostalCode\": \"60559\",\r\n" + 
				"          \"Country\": \"US\",\r\n" + 
				"          \"Phone\": \"123456789\"\r\n" + 
				"        }\r\n" + 
				"      },\r\n" + 
				"      \"ItemBarcode\": \"410020289970\",\r\n" + 
				"      \"CarrierCode\": \"\",\r\n" + 
				"      \"IsGiftCard\": false,\r\n" + 
				"      \"ItemTaxCode\": null,\r\n" + 
				"      \"OrderLineChargeDetail\": null,\r\n" + 
				"      \"OrderLineSubTotal\": null,\r\n" + 
				"      \"OrderLineTotal\": null,\r\n" + 
				"      \"OrderLineVASInstructions\": null,\r\n" + 
				"      \"PromisedShipDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"Extended\": {\r\n" + 
				"        \"InseamLength\": \"0.00\",\r\n" + 
				"        \"WebProductURL\": \"https://www.eddiebauer.ca/p/38989570\"\r\n" + 
				"      },\r\n" + 
				"      \"PromisedDeliveryDate\": \"2019-08-15T23:34:25\",\r\n" + 
				"      \"OrderLineNote\": []\r\n" + 
				"    }"+
				"  ],");
		sb.append("\"Payment\": [\r\n" + 
				"    {\r\n" + 
				"      \"CustomerId\": \"6110810311\",\r\n" + 
				"      \"OrderId\": \""+orderno+"\",\r\n" + 
				"      \"PaymentMethod\": [\r\n" + 
				"        {\r\n" + 
				"          \"PaymentMethodId\": \"pg153249419\",\r\n" + 
				"          \"CurrentAuthAmount\": 290.22,\r\n" + 
				"          \"ParentOrderId\": \""+orderno+"\",\r\n" + 
				"          \"NameOnCard\": \"fggjf bhk\",\r\n" + 
				"          \"IsSuspended\": false,\r\n" + 
				"          \"IsVoided\": false,\r\n" + 
				"          \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"          \"CardExpiryYear\": \"23\",\r\n" + 
				"          \"PaymentTransaction\": [\r\n" + 
				"            {\r\n" + 
				"              \"PaymentTransactionId\": \""+orderno+"\",\r\n" + 
				"              \"TransactionType\": {\r\n" + 
				"                \"PaymentTransactionTypeId\": \"Authorization\"\r\n" + 
				"              },\r\n" + 
				"              \"CreatedTimestamp\": null,\r\n" + 
				"              \"IsActive\": true,\r\n" + 
				"              \"ProcessingMode\": {\r\n" + 
				"                \"ProcessingModeId\": \"NormalProcessing\"\r\n" + 
				"              },\r\n" + 
				"              \"ExternalResponseId\": \"000\",\r\n" + 
				"              \"ProcessedAmount\": 290.22,\r\n" + 
				"              \"PaymentResponseStatus\": {\r\n" + 
				"                \"PaymentResponseStatusId\": \"Success\"\r\n" + 
				"              },\r\n" + 
				"              \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"              \"RequestToken\": \"8977533963981111\",\r\n" + 
				"              \"ReconciliationId\": \"860006\",\r\n" + 
				"              \"RequestedDate\": null,\r\n" + 
				"              \"TransmissionStatus\": null,\r\n" + 
				"              \"Status\": {\r\n" + 
				"                \"PaymentTransactionStatusId\": \"Closed\"\r\n" + 
				"              },\r\n" + 
				"              \"RequestId\": \"8860006\",\r\n" + 
				"              \"RequestedAmount\": 290.22,\r\n" + 
				"              \"TransactionDate\": \"2019-08-11T23:34:22\",\r\n" + 
				"              \"Extended\": {\r\n" + 
				"                \"AVSResultCode\": \"Y\",\r\n" + 
				"                \"TransID\": \"019224133816590G557\",\r\n" + 
				"                \"CardLevelResult\": \"H \",\r\n" + 
				"                \"AuthID\": \"OK9559\"\r\n" + 
				"              }\r\n" + 
				"            }\r\n" + 
				"          ],\r\n" + 
				"          \"CardExpiryMonth\": \"01\",\r\n" + 
				"          \"BillingAddress\": {\r\n" + 
				"            \"CreatedBy\": \"admin@EB-US.com\",\r\n" + 
				"            \"CreatedTimestamp\": null,\r\n" + 
				"            \"Address\": {\r\n" + 
				"              \"FirstName\": \"fggjf\",\r\n" + 
				"              \"LastName\": \"bhk\",\r\n" + 
				"              \"Address1\": \"800 Pasquinelli Dr\",\r\n" + 
				"              \"City\": \"Westmont\",\r\n" + 
				"              \"State\": \"IL\",\r\n" + 
				"              \"PostalCode\": \"60559\",\r\n" + 
				"              \"Country\": \"US\",\r\n" + 
				"              \"Phone\": \"9876543212\",\r\n" + 
				"              \"Email\": \"SOASTATESTUSER16@SOASTA.COM\"\r\n" + 
				"            }\r\n" + 
				"          },\r\n" + 
				"          \"CardType\": {\r\n" + 
				"            \"CardTypeId\": \"Visa\"\r\n" + 
				"          },\r\n" + 
				"          \"AccountDisplayNumber\": \"1111\",\r\n" + 
				"          \"PaymentType\": {\r\n" + 
				"            \"PaymentTypeId\": \"Credit Card\"\r\n" + 
				"          },\r\n" + 
				"          \"AccountNumber\": \"8977533963981111\",\r\n" + 
				"          \"ChargeSequence\": 1,\r\n" + 
				"          \"Amount\": 290.22,\r\n" + 
				"          \"CurrencyCode\": \"USD\"\r\n" + 
				"        }\r\n" + 
				"      ],\r\n" + 
				"      \"Extended\": null\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"Extended\": {},\r\n" + 
				"  \"OrderPromotionRequest\": null,\r\n" + 
				"  \"ExternalOrderId\": \""+orderno+"\",\r\n" + 
				"  \"OrderLineChargeDetail\": null\r\n" + 
				"}");
		System.out.println(sb.toString());
		csv.writeFile(sb.toString());
		csv.closeFile();
		orderno=orderno+1;
		}
	}

}
