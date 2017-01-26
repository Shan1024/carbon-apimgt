package org.wso2.carbon.apimgt.rest.api.publisher;

import org.wso2.carbon.apimgt.rest.api.publisher.factories.EndpointsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.apimgt.rest.api.publisher.dto.EndPointDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.EndPointListDTO;
import org.wso2.carbon.apimgt.rest.api.publisher.dto.ErrorDTO;

import org.wso2.msf4j.Microservice;
import org.osgi.service.component.annotations.Component;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Component(
    name = "org.wso2.carbon.apimgt.rest.api.publisher.EndpointsApi",
    service = Microservice.class,
    immediate = true
)
@Path("/endpoints")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the endpoints API")
@javax.annotation.Generated(value = "class org.wso2.maven.plugins.JavaMSF4JServerCodegen", date = "2017-01-15T22:14:45.821+05:30")
public class EndpointsApi implements Microservice  {
   private final EndpointsApiService delegate = EndpointsApiServiceFactory.getEndpointsApi();

    @DELETE
    @Path("/{endpointId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an endpoint", notes = "This operation can be used to delete an existing Endpoint proving the Id of the Endpoint. ", response = void.class, tags={ "Endpoint (individual)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Resource successfully deleted. ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. The request must be conditional but no condition has been specified. ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. Resource to be deleted does not exist. ", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Precondition Failed. The request has not been performed because one of the preconditions is not met. ", response = void.class) })
    public Response endpointsEndpointIdDelete(@ApiParam(value = "**Endpoint ID** consisting of the **UUID** of the Endpoint**. ",required=true) @PathParam("endpointId") String endpointId
,@ApiParam(value = "Validator for conditional requests; based on ETag. " )@HeaderParam("If-Match") String ifMatch
,@ApiParam(value = "Validator for conditional requests; based on Last Modified header. " )@HeaderParam("If-Unmodified-Since") String ifUnmodifiedSince
)
    throws NotFoundException {
        return delegate.endpointsEndpointIdDelete(endpointId,ifMatch,ifUnmodifiedSince);
    }
    @GET
    @Path("/{endpointId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get specific endpoints", notes = "This operation can be used to retrieve endpoint specific details. ", response = EndPointDTO.class, tags={ "Endpoint (individual)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Endpoint details returned. ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 304, message = "Not Modified. Empty body because the client has already the latest version of the requested resource (Will be supported in future). ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. Requested API does not exist. ", response = EndPointDTO.class) })
    public Response endpointsEndpointIdGet(@ApiParam(value = "**Endpoint ID** consisting of the **UUID** of the Endpoint**. ",required=true) @PathParam("endpointId") String endpointId
)
    throws NotFoundException {
        return delegate.endpointsEndpointIdGet(endpointId);
    }
    @PUT
    @Path("/{endpointId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a Tier", notes = "This operation can be used to update an existing endpoint. `PUT https://127.0.0.1:9443/api/am/publisher/v0.10/endpoints/api/Low` ", response = EndPointDTO.class, tags={ "Endpoint (individual)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Subscription updated. ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request. Invalid request or validation error. ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. The resource to be updated does not exist. ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 412, message = "Precondition Failed. The request has not been performed because one of the preconditions is not met. ", response = EndPointDTO.class) })
    public Response endpointsEndpointIdPut(@ApiParam(value = "**Endpoint ID** consisting of the **UUID** of the Endpoint**. ",required=true) @PathParam("endpointId") String endpointId
,@ApiParam(value = "Tier object that needs to be modified " ,required=true) EndPointDTO body
,@ApiParam(value = "Media type of the entity in the body. Default is application/json. " ,required=true, defaultValue="application/json")@HeaderParam("Content-Type") String contentType
,@ApiParam(value = "Validator for conditional requests; based on ETag. " )@HeaderParam("If-Match") String ifMatch
,@ApiParam(value = "Validator for conditional requests; based on Last Modified header. " )@HeaderParam("If-Unmodified-Since") String ifUnmodifiedSince
)
    throws NotFoundException {
        return delegate.endpointsEndpointIdPut(endpointId,body,contentType,ifMatch,ifUnmodifiedSince);
    }
    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all endpoints", notes = "This operation can be used to retrieve the list of endpoints available. ", response = EndPointListDTO.class, tags={ "Endpoint (Collection)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK. Endpoint list is returned. ", response = EndPointListDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 304, message = "Not Modified. Empty body because the client has already the latest version of the requested resource (Will be supported in future). ", response = EndPointListDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found. Requested API does not exist. ", response = EndPointListDTO.class) })
    public Response endpointsGet()
    throws NotFoundException {
        return delegate.endpointsGet();
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new endpoint", notes = "This operation can be used to add a new endpoint. ", response = EndPointDTO.class, tags={ "Endpoint (Collection)", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created. Successful response with the newly created Document object as entity in the body. Location header contains URL of newly added document. ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request. Invalid request or validation error ", response = EndPointDTO.class),
        
        @io.swagger.annotations.ApiResponse(code = 415, message = "Unsupported media type. The entity of the request was in a not supported format. ", response = EndPointDTO.class) })
    public Response endpointsPost(@ApiParam(value = "EndPoint object that needs to be added " ,required=true) EndPointDTO body
,@ApiParam(value = "Media type of the entity in the body. Default is application/json. " ,required=true, defaultValue="application/json")@HeaderParam("Content-Type") String contentType
)
    throws NotFoundException {
        return delegate.endpointsPost(body,contentType);
    }
}