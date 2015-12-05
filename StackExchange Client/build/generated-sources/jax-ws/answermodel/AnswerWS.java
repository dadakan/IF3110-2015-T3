
package answermodel;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnswerWS", targetNamespace = "http://AnswerModel/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnswerWS {


    /**
     * 
     * @param qid
     * @return
     *     returns java.util.List<answermodel.Answer>
     */
    @WebMethod
    @WebResult(name = "Answer", targetNamespace = "")
    @RequestWrapper(localName = "getAnswerByQID", targetNamespace = "http://AnswerModel/", className = "answermodel.GetAnswerByQID")
    @ResponseWrapper(localName = "getAnswerByQIDResponse", targetNamespace = "http://AnswerModel/", className = "answermodel.GetAnswerByQIDResponse")
    @Action(input = "http://AnswerModel/AnswerWS/getAnswerByQIDRequest", output = "http://AnswerModel/AnswerWS/getAnswerByQIDResponse")
    public List<Answer> getAnswerByQID(
        @WebParam(name = "qid", targetNamespace = "")
        int qid);

    /**
     * 
     * @param questionId
     * @param content
     * @param token
     * @return
     *     returns int
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAnswer", targetNamespace = "http://AnswerModel/", className = "answermodel.CreateAnswer")
    @ResponseWrapper(localName = "createAnswerResponse", targetNamespace = "http://AnswerModel/", className = "answermodel.CreateAnswerResponse")
    @Action(input = "http://AnswerModel/AnswerWS/createAnswerRequest", output = "http://AnswerModel/AnswerWS/createAnswerResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://AnswerModel/AnswerWS/createAnswer/Fault/ParseException")
    })
    public int createAnswer(
        @WebParam(name = "token", targetNamespace = "")
        String token,
        @WebParam(name = "question_id", targetNamespace = "")
        int questionId,
        @WebParam(name = "content", targetNamespace = "")
        String content)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param stat
     * @param userid
     * @param aid
     * @param token
     * @return
     *     returns int
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "voteAnswer", targetNamespace = "http://AnswerModel/", className = "answermodel.VoteAnswer")
    @ResponseWrapper(localName = "voteAnswerResponse", targetNamespace = "http://AnswerModel/", className = "answermodel.VoteAnswerResponse")
    @Action(input = "http://AnswerModel/AnswerWS/voteAnswerRequest", output = "http://AnswerModel/AnswerWS/voteAnswerResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://AnswerModel/AnswerWS/voteAnswer/Fault/ParseException")
    })
    public int voteAnswer(
        @WebParam(name = "userid", targetNamespace = "")
        int userid,
        @WebParam(name = "aid", targetNamespace = "")
        int aid,
        @WebParam(name = "stat", targetNamespace = "")
        int stat,
        @WebParam(name = "token", targetNamespace = "")
        String token)
        throws ParseException_Exception
    ;

}