package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<OfficialList> DEFAULT_OFFICIAL_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<OfficialList> official_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<OfficialList> list;
    if (paramBoolean == true) {
      list = paramBuilder.official_list;
      if (list == null) {
        this.official_list = DEFAULT_OFFICIAL_LIST;
      } else {
        this.official_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.official_list = Message.immutableCopyOf(((Builder)list).official_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<OfficialList> official_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.official_list = Message.copyOf(param1DataRes.official_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
