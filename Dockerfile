# Use Amazon Corretto 17 as base image
FROM public.ecr.aws/lambda/java:17

# Copy the built jar to the container
COPY target/raahi-0.0.1-SNAPSHOT.jar ${LAMBDA_TASK_ROOT}/app.jar

# Set the Lambda handler (Spring Cloud Function adapter)
ENV _HANDLER=org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest

# Command to run the Lambda function
CMD ["app.jar"]
