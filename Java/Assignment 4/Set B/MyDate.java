public class MyDate {
    int dd;
    int mm;
    int yy;

    public MyDate(int dd, int mm, int yy) throws InvalidDateException {

        if(!this.isValid(dd, mm, yy)){
            throw new InvalidDateException();
        }
        this.dd = dd;
        this.mm = mm;
        this.yy = yy; 
    }
    
    private boolean isValid(int dd, int mm, int yy) {
        boolean flag = true;
        switch(mm) 
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:            
            case 12:
            {
                if (dd > 31) {
                    flag = false;
                }
            }break;

            case 4:
            case 6:
            case 9:
            case 11:
            {
                if(dd > 30) {
                    flag = false;
                }
            }break;

            case 2:
            {
                if(yy % 4 == 0) {
                    flag = true;
                }
                else if(yy % 100 == 0 && yy % 400 == 0) {
                    flag = true;
                }
                else {
                    flag = false;
                }

            }break;

            default:
            {
                flag = false;
            }break;
        }

        return flag;

    }

    @Override
    public String toString() {
        return  dd + "/" + mm + "/" + yy;
    }
}
