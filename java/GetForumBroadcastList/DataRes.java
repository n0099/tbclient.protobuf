package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BroadcastInfo;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<BroadcastInfo> DEFAULT_BCAST_INFOS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BroadcastInfo> bcast_infos;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<BroadcastInfo> list = paramBuilder.bcast_infos;
      if (list == null) {
        this.bcast_infos = DEFAULT_BCAST_INFOS;
      } else {
        this.bcast_infos = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.bcast_infos = Message.immutableCopyOf(paramBuilder.bcast_infos);
      this.page = paramBuilder.page;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<BroadcastInfo> bcast_infos;
    
    public Page page;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.bcast_infos = Message.copyOf(param1DataRes.bcast_infos);
      this.page = param1DataRes.page;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
