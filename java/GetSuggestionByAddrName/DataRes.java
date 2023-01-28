package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Lbs;

public final class DataRes extends Message {
  public static final List<Lbs> DEFAULT_POI_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<Lbs> poi_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Lbs> list;
    if (paramBoolean == true) {
      list = paramBuilder.poi_info;
      if (list == null) {
        this.poi_info = DEFAULT_POI_INFO;
      } else {
        this.poi_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.poi_info = Message.immutableCopyOf(((Builder)list).poi_info);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<Lbs> poi_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.poi_info = Message.copyOf(param1DataRes.poi_info);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
