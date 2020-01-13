package ru.rsatu.client;


import ru.rsatu.client.generated.*;

public class XMLServiceClient {

    public static void main(String[] args) {

        // подключаемся к тегу service в wsdl описании
        XMLServiceImplService serviceData = new XMLServiceImplService();

        // получив информацию из тега service подключаемся к самому веб-сервису
        IFromXMLService service = serviceData.getXMLServiceImplPort();

        // обращаемся к веб-сервису и выводим результат в консоль
        GetUniversityResponse.Return university = service.getUniversity();
        System.out.println(university.getUniversityName());
    }
}
