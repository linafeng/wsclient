package com.fiona.ws.pms;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.StringUtils;

import com.fiona.ws.domain.MxGraphModel;
import com.fiona.ws.domain.RestaurantUtilisationResponse;
import com.fiona.ws.domain.req.RestaurantUtilisationRequest;
import com.fiona.ws.domain.req.UtilisationRequestOptions;

public class TestXml {
	public static void main(String[] args) throws JAXBException {

		RestaurantUtilisationRequest request=new RestaurantUtilisationRequest();
		request.setRestaurantIDs(new String[] {"WD7"});		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 0);		
		request.setDataPoint(cal);
		request.setOptions(UtilisationRequestOptions.AllTimes);
		System.out.println(convertToXMLContent(request));
		


		MxGraphModel mxGraphModel = new MxGraphModel();
		mxGraphModel.setRoot("fdsf");
		System.out.println(convertToXML(mxGraphModel));

		MxGraphModel ori = convertToGraphModel(convertToXML(mxGraphModel));
		System.out.println(1);

		RestaurantUtilisationResponse response=new RestaurantUtilisationResponse();
		//response.setReportName(reportName);
		JAXBContext jaxbContext = JAXBContext.newInstance(RestaurantUtilisationResponse.class);
		StringWriter writer = new StringWriter();
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(response, writer);
		String xmlStr = writer.toString();
		xmlStr = StringUtils.replace(xmlStr, "&quot;", "'");
		System.out.println(xmlStr);

		StringReader reader2 = new StringReader(xmlStr);
		JAXBContext jaxbContextf = JAXBContext.newInstance(RestaurantUtilisationResponse.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		RestaurantUtilisationResponse response2 = (RestaurantUtilisationResponse) jaxbUnmarshaller.unmarshal(reader2);
		System.out.println(1);


		String resp="<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>"+
				"<GetRestaurantUtilisationResult><ReportName>bb</ReportName><RestaurantsUtilisation><RestaurantUtilisation><RestaurantID>WD7</RestaurantID><RestaurantName>Steakhouse</RestaurantName><SessionType>Dinner</SessionType><SessionTypeName>Dinner</SessionTypeName><SessionStartTime>2019-09-18T17:30:00</SessionStartTime><SessionLastArrivalTime>2019-09-18T21:45:00</SessionLastArrivalTime><SessionEndTime>2019-09-19T00:45:00</SessionEndTime><TimeSlotInterval>15</TimeSlotInterval><DisplayPage>Unknown</DisplayPage><DisplayListOrder>0</DisplayListOrder><TimeSlots><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T17:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T17:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T18:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T18:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T18:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T18:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T19:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T19:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T19:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T19:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T20:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T20:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T20:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T20:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T21:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T21:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>10</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>10</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T21:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>0</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>5</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>5</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T21:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T22:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T22:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T22:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T22:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T23:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T23:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T23:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-18T23:45:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-19T00:00:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-19T00:15:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot><ResUtilisationTimeSlot><TimeSlotTime>2019-09-19T00:30:00</TimeSlotTime><DisplayValue>NotSet</DisplayValue><UtilisationOverridden>false</UtilisationOverridden><OriginalDisplayValue>NotSet</OriginalDisplayValue><UtilisationAsPercentage>100</UtilisationAsPercentage><AvailabilityAsPercentage>0</AvailabilityAsPercentage><MaxPhysicalCapacity>131</MaxPhysicalCapacity><PhysicalUtilisation>0</PhysicalUtilisation><OBMCoverLimitTS>300</OBMCoverLimitTS><OBMCoverLimitSitting>0</OBMCoverLimitSitting><OBMCoverLimitSession>330</OBMCoverLimitSession><ArrivalsCovers>0</ArrivalsCovers><OBMCoversCapacity>0</OBMCoversCapacity><UnallocatedUtilisation>0</UnallocatedUtilisation><IntersectionStart>0001-01-01T00:00:00</IntersectionStart><IntersectionFinish>0001-01-01T00:00:00</IntersectionFinish><TimeSlotStatus>1</TimeSlotStatus></ResUtilisationTimeSlot></TimeSlots></RestaurantUtilisation></RestaurantsUtilisation></GetRestaurantUtilisationResult>" ;
		System.out.println(resp);
		System.out.println(xmlTagCapitalize(resp));
		resp=StringUtils.replace(resp, "&quot;", "'");
		StringReader reader = new StringReader(resp);
		JAXBContext jaxbContextfd = JAXBContext.newInstance(RestaurantUtilisationResponse.class);
		Unmarshaller jaxbUnmarshaller2 = jaxbContextfd.createUnmarshaller();
		RestaurantUtilisationResponse restaurantUtilisationResponse = (RestaurantUtilisationResponse) jaxbUnmarshaller2.unmarshal(reader);
		System.out.println(1);


	}
	/**
	 * xml转对象
	 * 
	 * @param xml
	 * @return
	 * @throws JAXBException
	 */
	public static MxGraphModel convertToGraphModel(String xml) throws JAXBException {
		StringReader reader = new StringReader(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(MxGraphModel.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		MxGraphModel graphModel = (MxGraphModel) jaxbUnmarshaller.unmarshal(reader);
		return graphModel;
	}

	/**
	 * xml转对象
	 * 
	 * @param xml
	 * @return
	 * @throws JAXBException
	 */
	public static MxGraphModel convertToGraphModel(String xml,Class clzz) throws JAXBException {
		StringReader reader = new StringReader(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(MxGraphModel.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		MxGraphModel graphModel = (MxGraphModel) jaxbUnmarshaller.unmarshal(reader);
		return graphModel;
	}

	/**
	 * 将对象转为流程XML
	 * 
	 * @param graphModel
	 * @return
	 * @throws JAXBException
	 */
	public static String convertToXML(MxGraphModel graphModel) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(MxGraphModel.class);
		StringWriter writer = new StringWriter();
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(graphModel, writer);
		String xmlStr = writer.toString();
		xmlStr = StringUtils.replace(xmlStr, "&quot;", "'");
		return xmlStr;
	}
	/**
	 * 将对象转为流程XML
	 * 
	 * @param graphModel
	 * @return
	 * @throws JAXBException
	 */
	public static <T> String convertToXML(T t) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(t.getClass());
		StringWriter writer = new StringWriter();
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(t, writer);
		String xmlStr = writer.toString();
		xmlStr = StringUtils.replace(xmlStr, "&quot;", "'");
		return xmlStr;
	}
	/**
	 * 将对象转为流程XML
	 * 
	 * @param graphModel
	 * @return
	 * @throws JAXBException
	 */
	public static <T> String convertToXMLContent(T t) throws JAXBException {	
		String xmlStr =convertToXML(t);
		xmlStr = StringUtils.replace(xmlStr, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>", "");
		return xmlStr;
	}
	public static String xmlTagCapitalize(String xmlStr) {
		String regex = "<(/*[A-Za-z]+)>";
		regex = "<([^>]*)>";
		Matcher matcher = Pattern.compile(regex).matcher(xmlStr);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			String str = matcher.group(1);
			if(!str.startsWith("/")) {
				matcher.appendReplacement(sb, "<" + (StringUtils.uncapitalize(str)) + ">");
			}else {
				matcher.appendReplacement(sb, "</" + (StringUtils.uncapitalize (str.substring(1, str.length()))) + ">");
			}

		}
		matcher.appendTail(sb);
		return sb.toString();
	}
}
