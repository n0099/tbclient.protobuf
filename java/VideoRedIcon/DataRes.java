package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<RedIcon> DEFAULT_RED_ICON_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<RedIcon> red_icon_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RedIcon> list;
    if (paramBoolean == true) {
      list = paramBuilder.red_icon_list;
      if (list == null) {
        this.red_icon_list = DEFAULT_RED_ICON_LIST;
      } else {
        this.red_icon_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.red_icon_list = Message.immutableCopyOf(((Builder)list).red_icon_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<RedIcon> red_icon_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.red_icon_list = Message.copyOf(param1DataRes.red_icon_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
