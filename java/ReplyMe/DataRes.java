package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;

public final class DataRes extends Message {
  public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ReplyList> reply_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ReplyList> list;
    if (paramBoolean == true) {
      this.page = paramBuilder.page;
      list = paramBuilder.reply_list;
      if (list == null) {
        this.reply_list = DEFAULT_REPLY_LIST;
      } else {
        this.reply_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.page = ((Builder)list).page;
      this.reply_list = Message.immutableCopyOf(((Builder)list).reply_list);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Page page;
    
    public List<ReplyList> reply_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.page = param1DataRes.page;
      this.reply_list = Message.copyOf(param1DataRes.reply_list);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
