import org.jzy3d.analysis.AbstractAnalysis;
import org.jzy3d.chart.factories.AWTChartComponentFactory;
import org.jzy3d.colors.ColorMapper;
import org.jzy3d.colors.colormaps.ColorMapRainbow;
import org.jzy3d.maths.Range;
import org.jzy3d.plot3d.builder.Builder;
import org.jzy3d.plot3d.builder.Mapper;
import org.jzy3d.plot3d.builder.concrete.OrthonormalGrid;
import org.jzy3d.plot3d.primitives.Shape;
import org.jzy3d.plot3d.rendering.canvas.Quality;

import java.util.Map;

public class Surface3D extends AbstractAnalysis {
    private static MainFrame.Core core;// = new Core(0.2, 0.2, 0.2, 0.2, 0.2, 100, 5, 5, 2, 3);
    private Map<String, Double> sleep;

    public Surface3D(MainFrame.Core core) {
        this.core = core;
    }


    /*public static void main(String[] args) throws Exception {
        AnalysisLauncher.open(new Surface3D());
    }*/

    public void init() throws Exception {
        //core.run();
        this.sleep = core.getCountSleep();
        Mapper mapper = new Mapper() {
            @Override
            public double f(double x, double y) {
                String key = (int) x + "," + (int) y;
                double result = sleep.getOrDefault(key, 0.0);
                return result;
            }
        };

        // Define range and precision for the function to plot
        Range xRange = new Range(0, core.getN());
        Range yRange = new Range(0, core.getM());
        int xSteps = 100;
        int ySteps = 100;

        // Create the object to represent the function over the given range.
        final Shape surface = Builder.buildOrthonormal(new OrthonormalGrid(xRange, xSteps, yRange, ySteps), mapper);
        surface.setColorMapper(new ColorMapper(new ColorMapRainbow(), surface.getBounds().getZmin(), surface.getBounds().getZmax()));
        surface.setFaceDisplayed(true);
        surface.setWireframeDisplayed(false);

        // Create a chart
        chart = AWTChartComponentFactory.chart(Quality.Advanced, getCanvasType());
        chart.getScene().getGraph().add(surface);
    }


}