
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
/**
 * Created by yajiecao212929 on 2017/4/19.
 */
public class TestHelloWorldClient {

        private final ManagedChannel channel;
        private final HelloWorldServiceGrpc.HelloWorldServiceBlockingStub blockingStub;
        private final HelloWorldServiceGrpc.HelloWorldServiceStub asyncStub;


        public TestHelloWorldClient(String host,int port){
            channel= ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext(true).build();
            blockingStub=HelloWorldServiceGrpc.newBlockingStub(channel);
            asyncStub=HelloWorldServiceGrpc.newStub(channel);

        }

        public void sayHello(){
            HelloRequest helloRequest= HelloRequest.newBuilder()
                    .setGreeting("Hello Protocol Buffer")
                    .build();
            HelloResponse helloResponse=blockingStub.sayHello(helloRequest);
            System.out.println(helloRequest.getGreeting());
            System.out.println(helloResponse);
        }


        public static void main(String[] args){
            TestHelloWorldClient testHelloWorldClient=new TestHelloWorldClient("127.0.0.1",8001);
            testHelloWorldClient.sayHello();
        }

}
