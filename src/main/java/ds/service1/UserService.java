package ds.service1;

import ds.service1.Access.APIResponse;
import ds.service1.Access.Empty;
import ds.service1.Access.LoginRequest;
import ds.service1.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Welcome to Green Smartoffice Company.");
		String username =  request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		//Service1 Implementation.
		if(username.equals(password)) {
			//return success message
			
			response.setResponseCode(0).setResponsemessage("Deny Access. You're not Our employee");
		}
		else {
			//return failure message
			response.setResponseCode(100).setResponsemessage("Access the Company database. Thank you for Our Green office Employee ");
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
	
	}
	
	
}
