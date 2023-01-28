package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ManageInfo extends Message {
  public static final Integer DEFAULT_ITEM_SOURCE = Integer.valueOf(0);
  
  @ProtoField(tag = 1)
  public final Item item;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer item_source;
  
  @ProtoField(tag = 2)
  public final TiebaPlusInfo tiebaplus_info;
  
  public ManageInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.item = paramBuilder.item;
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      integer = paramBuilder.item_source;
      if (integer == null) {
        this.item_source = DEFAULT_ITEM_SOURCE;
      } else {
        this.item_source = integer;
      } 
    } else {
      this.item = ((Builder)integer).item;
      this.tiebaplus_info = ((Builder)integer).tiebaplus_info;
      this.item_source = ((Builder)integer).item_source;
    } 
  }
  
  public ManageInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ManageInfo> {
    public Item item;
    
    public Integer item_source;
    
    public TiebaPlusInfo tiebaplus_info;
    
    public Builder() {}
    
    public Builder(ManageInfo param1ManageInfo) {
      super(param1ManageInfo);
      if (param1ManageInfo == null)
        return; 
      this.item = param1ManageInfo.item;
      this.tiebaplus_info = param1ManageInfo.tiebaplus_info;
      this.item_source = param1ManageInfo.item_source;
    }
    
    public ManageInfo build(boolean param1Boolean) {
      return new ManageInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
