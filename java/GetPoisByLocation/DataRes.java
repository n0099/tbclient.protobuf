package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final String DEFAULT_FORMATTED_ADDRESS = "";
  
  public static final List<PoiInfo> DEFAULT_POI_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String formatted_address;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PoiInfo> poi_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PoiInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.formatted_address;
      if (str == null) {
        this.formatted_address = "";
      } else {
        this.formatted_address = str;
      } 
      list = paramBuilder.poi_info;
      if (list == null) {
        this.poi_info = DEFAULT_POI_INFO;
      } else {
        this.poi_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.formatted_address = ((Builder)list).formatted_address;
      this.poi_info = Message.immutableCopyOf(((Builder)list).poi_info);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public String formatted_address;
    
    public List<PoiInfo> poi_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.formatted_address = param1DataRes.formatted_address;
      this.poi_info = Message.copyOf(param1DataRes.poi_info);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
