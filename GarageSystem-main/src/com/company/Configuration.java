package com.company;
//interface class to choose configuration
public interface Configuration {
    int searchForSlot(Slot[] Slots,double depth,double width);
}

// to search for first available and suitable slot
class FirstSlot implements Configuration{
    @Override
    public int searchForSlot(Slot[] slots,double depth,double width){
        for (int i = 0; i < slots.length; i++) {
            if(slots[i].getAvailability()) {
                if(slots[i].getDepth()>=depth&&slots[i].getWidth()>=width) {
                    return i;
                }
            }
        }
        return -1;
    }
}
// to search for  best available and suitable slot
class BestSlot implements Configuration
{
    @Override
    public int searchForSlot(Slot[] slots,double depth,double width)
    {
        int index=-1;
        double width_=-1,depth_=-1;
        for (int i = 0; i < slots.length; i++) {
            if (slots[i].getAvailability())
            {
                if(index== -1)
                {
                    if(slots[i].getDepth()>=depth&&slots[i].getWidth()>=width){
                        index = i;
                        width_ = slots[i].getWidth();
                        depth_ = slots[i].getDepth();
                    }
                }
                else
                {
                    if((slots[i].getDepth()<depth_||slots[i].getWidth()<width_)&&slots[i].getWidth()>=width&&slots[i].getDepth()>=depth)
                    {
                        index=i;
                        width_ = slots[i].getWidth();
                        depth_ = slots[i].getDepth();
                    }
                }
            }
        }
        return index;
    }
}
