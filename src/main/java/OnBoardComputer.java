public class OnBoardComputer implements BurnStream {

    int burnArray[] = {0,0,200,200,200,200,200,200,200,200,200,200,200,170,100,100,130,95,104,100,100,100,100};
    int burnIndex = -1;
    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.getVelocity() == 2) {
            burn = 100;
        } else if (status.getAltitude() > 6000) {
            burn = 100;
        } else if (status.getVelocity() > 100) {
            burn = 200;
        } else if (status.getAltitude() > 100) {
            burn =100;
        } else burn = 198;

        System.out.println(burn);
        return burn;

    }
}
