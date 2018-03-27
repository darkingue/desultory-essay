package pers.qqs.jmeter.demo;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * Created by qqs on 15/11/27.
 */
public class HudsonJmeter extends AbstractJavaSamplerClient {
    private static String label = "hudson01";
    SampleResult results;

    public void setupTest(JavaSamplerContext arg0) {
    }

    @Override
    public Arguments getDefaultParameters() {
        Arguments arguments = new Arguments();
        arguments.addArgument("ResponseCode", "");
        return arguments;
    }

    @Override public SampleResult runTest(JavaSamplerContext javaSamplerContext) {

        results = new SampleResult();
        results.setSampleLabel(label);
        results.setResponseCode(javaSamplerContext.getParameter("ResponseCode"));
        results.sampleStart();
        try {
            //            System.out.println();
            try {
                Thread.sleep(1);
                System.out.println("pass");
                results.setSuccessful(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
                results.setSuccessful(false);
            }
        } finally {
            results.sampleEnd();
        }
        return results;
    }

    public void teardownTest(JavaSamplerContext arg0) {
    }
    //
    //    @Test
    //    public void testQuickPay() {
    //        HudsonJmeter mt = new HudsonJmeter();
    //        Arguments arg = new Arguments();
    //        arg.addArgument("loop", "10");
    //        // arg.addArgument("url", Constants.EXPRESS_URL);
    //        JavaSamplerContext context = new JavaSamplerContext(arg);
    //        mt.runTest(context);
    //    }

}
