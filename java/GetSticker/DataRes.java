package tbclient.GetSticker;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<String> DEFAULT_PIC_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1, type = Message.Datatype.STRING)
  public final List<String> pic_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      list = paramBuilder.pic_info;
      if (list == null) {
        this.pic_info = DEFAULT_PIC_INFO;
      } else {
        this.pic_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.pic_info = Message.immutableCopyOf(((Builder)list).pic_info);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<String> pic_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.pic_info = Message.copyOf(param1DataRes.pic_info);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
