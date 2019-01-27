package demo.infrastructure.error.camunda;

import demo.infrastructure.error.ErrorDetail;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CamundaDefaultExceptionHandler implements ExceptionMapper<CamundaDefaultException> {

    @Override
    public Response toResponse(CamundaDefaultException e) {
        return Response
                .status(Response.Status.BAD_REQUEST)
                .entity(new ErrorDetail())
                .type(MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}
