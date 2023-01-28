package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<BigdayInfo> DEFAULT_BIGDAY_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<BigdayInfo> bigday_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<BigdayInfo> list;
    if (paramBoolean == true) {
      list = paramBuilder.bigday_list;
      if (list == null) {
        this.bigday_list = DEFAULT_BIGDAY_LIST;
      } else {
        this.bigday_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.bigday_list = Message.immutableCopyOf(((Builder)list).bigday_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<BigdayInfo> bigday_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.bigday_list = Message.copyOf(param1DataRes.bigday_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
