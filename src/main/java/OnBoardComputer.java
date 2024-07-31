public class OnBoardComputer implements BurnStream {

    int burnArray[] = {0,0,200,200,200,200,200,200,200,200,200,200,200,170,100,100,130,95,104,100,100,100,100};
    int burnIndex = -1;

    @Override
    public int getNextBurn(DescentEvent status) {
        if (burnIndex < burnArray.length) {
            burnIndex++;
            System.out.println(burnArray[burnIndex]);
            return burnArray[burnIndex];
        }
        return 0;
    }
}
