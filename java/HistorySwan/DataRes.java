package tbclient.HistorySwan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SmartApp;

public final class DataRes extends Message {
  public static final List<SmartApp> DEFAULT_NAWS_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<SmartApp> naws_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<SmartApp> list;
    if (paramBoolean == true) {
      list = paramBuilder.naws_list;
      if (list == null) {
        this.naws_list = DEFAULT_NAWS_LIST;
      } else {
        this.naws_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.naws_list = Message.immutableCopyOf(((Builder)list).naws_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<SmartApp> naws_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.naws_list = Message.copyOf(param1DataRes.naws_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
