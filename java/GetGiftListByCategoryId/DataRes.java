package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<PresentGiftListByCategoryId1> DEFAULT_GIFT_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PresentGiftListByCategoryId1> gift_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PresentGiftListByCategoryId1> list;
    if (paramBoolean == true) {
      list = paramBuilder.gift_list;
      if (list == null) {
        this.gift_list = DEFAULT_GIFT_LIST;
      } else {
        this.gift_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.gift_list = Message.immutableCopyOf(((Builder)list).gift_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<PresentGiftListByCategoryId1> gift_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.gift_list = Message.copyOf(param1DataRes.gift_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
