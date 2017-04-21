import io.grpc.Server;
import io.grpc.ServerBuilder;



/**
 * Created by yajiecao212929 on 2017/4/19.
 */
public class SimulateServer {
//    private static final Logger logger = LoggerFactory.getLogger(SimulateServer.class);

    private static int default_port=8001;
    private Server server;

    private void start(int port) throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new HelloWorldRpcServiceImpl())
                .build().start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {

                SimulateServer.this.stop();

            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final SimulateServer searchServer = new SimulateServer();
        int port = default_port;
        if(args!=null&&args.length==1) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        searchServer.start(port);
        searchServer.blockUntilShutdown();
    }
}
