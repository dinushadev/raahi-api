# Use Amazon Corretto 17 as base image
FROM public.ecr.aws/lambda/java:17

# Copy the built jar to the container
COPY target/raahi-0.0.1-SNAPSHOT.jar ${LAMBDA_TASK_ROOT}/application.jar

# Set the Lambda handler to the custom handler
ENV _HANDLER=com.saffari.presentation.RaahiLambdaHandler::handleRequest

# Command to run the Lambda function
CMD ["application.jar"]
