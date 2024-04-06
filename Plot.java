public class Plot {
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield) {
        cropType = crop;
        cropYield = yield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }
}

class ExperimentalFarm {
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p) {
        farmPlots = p;
    }

    public Plot getHighestYield(String c) {
        int highest = -1;
        Plot p = null;
        for(int i = 0; i < farmPlots.length; i++) {
            for(int j = 0; j < farmPlots[i].length; j++) {
                if(farmPlots[i][j].getCropType().equals(c)) {
                    if(farmPlots[i][j].getCropYield() > highest) {
                        highest = farmPlots[i][j].getCropYield();
                        p = farmPlots[i][j];
                    }
                }
            }
        }
        return p;

    }

    public boolean sameCrop(int col) {
        for(int i = 0; i < farmPlots.length; i++) {
            if(!farmPlots[i-1][col].getCropType().equals(farmPlots[i][col].getCropType())) {
                return false;
            }
        }
        return true;
    }
}
