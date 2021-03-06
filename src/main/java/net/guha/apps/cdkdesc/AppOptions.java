/**
 *
 * @author Rajarshi Guha
 */
package net.guha.apps.cdkdesc;

import org.openscience.cdk.qsar.DescriptorEngine;
import org.openscience.cdk.qsar.IMolecularDescriptor;
import org.openscience.cdk.silent.SilentChemObjectBuilder;

import java.util.HashMap;
import java.util.Map;

public class AppOptions {

    private static String outputMethod = CDKDescConstants.OUTPUT_SPC;
    private static DescriptorEngine engine = new DescriptorEngine(IMolecularDescriptor.class,
            SilentChemObjectBuilder.getInstance());
    private static Map<String, Boolean> selectedDescriptors = new HashMap<String, Boolean>();
    private static String settingsFile = "";
    private static String selectedFingerprintType = null;
    private static boolean addH = true;
    private static boolean debug = false;

    public static String getSelectedFingerprintType() {
        return selectedFingerprintType;
    }

    public static void setSelectedFingerprintType(String selectedFingerprintType) {
        AppOptions.selectedFingerprintType = selectedFingerprintType;
    }

    public String getSettingsFile() {
        return settingsFile;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        AppOptions.debug = debug;
    }

    public void setSettingsFile(String settingsFile) {
        AppOptions.settingsFile = settingsFile;
    }

    public Map<String, Boolean> getSelectedDescriptors() {
        return selectedDescriptors;
    }

    public static DescriptorEngine getEngine() {
        return engine;
    }

    public String getOutputMethod() {
        return outputMethod;
    }

    public void setOutputMethod(String outputMethod) {
        AppOptions.outputMethod = outputMethod;
    }

    private static AppOptions ourInstance = new AppOptions();

    public static AppOptions getInstance() {
        return ourInstance;
    }

    private AppOptions() {
    }

    public boolean isAddH() {
        return addH;
    }

    public void setAddH(boolean addH) {
        AppOptions.addH = addH;
    }

}
