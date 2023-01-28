package tbclient.GetHorseRaceLampList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<LiveList> DEFAULT_LIVE_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<LiveList> live_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<LiveList> list;
    if (paramBoolean == true) {
      list = paramBuilder.live_list;
      if (list == null) {
        this.live_list = DEFAULT_LIVE_LIST;
      } else {
        this.live_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.live_list = Message.immutableCopyOf(((Builder)list).live_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<LiveList> live_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.live_list = Message.copyOf(param1DataRes.live_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
