import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

/**
 * Created by yajiecao212929 on 2017/4/19.
 */
public class HelloWorldRpcServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase{


    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
          System.out.println("greeting:"+request.getGreeting());

          HelloResponse response=HelloResponse.newBuilder()
                  .setReply("Success congratulation").build();
          responseObserver.onNext(response);
          responseObserver.onCompleted();
    }

    @Override
    public ServerServiceDefinition bindService() {
        return super.bindService();
    }

//    public static void main(String[] args){
//        HelloWorldRpcServiceImpl helloWorldRpcServiceImpl=new HelloWorldRpcServiceImpl();
//        helloWorldRpcServiceImpl.sayHello(re);
//    }
}
